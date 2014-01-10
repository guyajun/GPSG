package file;

import java.nio.channels.SocketChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.ByteBuffer;

import java.io.RandomAccessFile;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;

/**
 * <p>Title: Socekt���ѧϰ</p>
 *
 * <p>Description: �ļ�������ն�</p>
 *
 * <p>Copyright: Copyright (c) 2009</p>
 *
 * <p>Company: <a href="www.kum.net.cn">��è�Ƽ�</a></p>
 *
 * @author ����<380595305@qq.com>
 * @version 1.0
 */
public class ReveiceThread extends Thread {
  private FileUtil util = new FileUtil();
  private SocketChannel r_channel = null;
  private ByteBuffer buf = ByteBuffer.allocate(util.getBlockSize() + 9);
  public ReveiceThread(SocketChannel channel) throws Exception {
    this.r_channel = channel;
    this.r_channel.configureBlocking(false);
  }

  public void run() {
    try {
      Selector selector = Selector.open();
      SelectionKey key = r_channel.register(selector, SelectionKey.OP_READ);
      buf.clear();
      File file = null;
      FileOutputStream fout = null;//�ļ����������
      RandomAccessFile raf = null;//������ʱ�ļ�����

      int FileSize = 0; //�ļ���С
      String FileName = ""; //�ļ�����
      int BlockIndex = 0; //�ļ���������
      int BlockSize = 0; //�ļ����С
      int readlen = 0; //���������ݳ���
      int buflen = 0; //buf�ĳ���
      byte cmd = 0x0; //������
      int BlockNum = 0; // �ļ������ݼ�����
      int CompSize = 0; //�Ѿ������

      while (key.selector().isOpen()) {
        int selkey = selector.select();
        if (selkey == 0) {
          readlen = this.r_channel.read(buf); //��ʼ������
          buflen += readlen; //��¼������buf�ĳ���
          if (readlen >= 1) { //����������
            buf.rewind(); ///����ָ��ָ��0
            cmd = buf.get(); //��ȡһ���ֽ�,����ļ�ͷ��Ϣ,�жϷ�����Ϣ����(head or body)
            switch (cmd) {
              case 0x1: { ///�ļ���Ϣ
                if (buflen >= 260) {
                  FileSize = buf.getInt(); //��ȡ�ļ���С
                  byte[] filename = new byte[255];
                  buf.get(filename); //�ӻ������ж�ȡ255���ֽڣ���ȡ�ļ���
                  FileName = (new String(filename)).trim();
                  buf.compact(); //ɾ����ȡ��������
                  buflen -= 260; //��������С��ȥ�Ѷ���260���ֽڴ�С
                  buf.position(buflen); //����ָ��ָ��buf�����λ��
                  System.out.println("�ļ���-->��" + FileName + ",�ļ���С-->��" +
                                     FileSize);
                  fout = new FileOutputStream(FileName);
                  file = new File("~" + FileName + ".tmp"); //������ʱ�ļ�
                  raf = new RandomAccessFile(file, "rw"); //����ʱ�ļ���д������
                  System.out.println("�ļ������ɹ�,��ʼд������...");
                }
                else {
                  buf.position(buflen); ///����ָ��ָ��buf�����λ��
                }
              }
              break;
              case 0x2: { //�ļ���������(body)
                if (buflen >= 9) {
                  BlockIndex = buf.getInt(); //����ļ���������
                  BlockSize = buf.getInt(); //����ļ����С
                  if (buflen >= (9 + BlockSize)) { //��������С��ȥ�Ѷ�����
                    byte[] blockdb = new byte[BlockSize];
                    buf.get(blockdb); //��ȡ�ļ�������
                    buf.compact(); //ɾ���Ѷ�����
                    buflen -= (9 + BlockSize);
                    buf.position(buflen); //����ָ��ָ��buf���������λ��
                    if (BlockSize < util.getBlockSize()) {
                      //����յ������ݿ��СС�ڶ��������ļ����С
                      byte[] tmpdb = new byte[util.getBlockSize()]; ///������ʱ������ݿ�
                      System.arraycopy(blockdb, 0, tmpdb, 0, BlockSize);//
                      raf.seek( (util.getBlockSize() + 4) * BlockIndex); //(+4)�����ڴ���ļ���С��Ϣ��
                      //�ļ���д����ʱ�ļ��н���Ӧ���ݿ�ŵ���Ӧ��λ����ȥ
                      raf.writeInt(BlockSize); //����ʱ���ݿ���д���ļ���С��Ϣ
                      raf.write(tmpdb); //����ʱ���ݿ���д���ļ�����Ϣ
                      BlockNum++; //�ļ���������ۼ�
                    }
                    else {
                       //�յ������ݵ����ļ��鶨������ֵ
                      raf.seek( (util.getBlockSize() + 4) * BlockIndex);
                      //�ļ���д����ʱ�ļ��н���Ӧ���ݿ�ŵ���Ӧ��λ����ȥ
                      raf.writeInt(BlockSize);
                      raf.write(blockdb);
                      BlockNum++;//�ļ���������ۼ�
                    }
                    System.out.println("д����ʱ�ļ���ɣ� ---->" +
                                       (CompSize += BlockSize) + "****");
                    FileSize -= BlockSize; ///ÿ�յ�һ�飬�ʹ����ļ���С���ȥ
                    if (FileSize == 0) { ///�������0�ˣ�˵���ļ����Ѿ���ȫ�ˣ����Թر��ļ��ˡ�
                      for (int i = 0; i < BlockNum; i++) {
                        //�����ļ������ѭ������ʱ�ļ�д����ʽ�ļ�
                        raf.seek( (util.getBlockSize() + 4) * i);
                        BlockSize = raf.readInt();//����ʱ�ļ��ж�ȡ�ļ����С
                        byte[] tmpdb = new byte[BlockSize];
                        raf.read(tmpdb);//����ʱ�ļ��ж�ȡ�ļ�������
                        fout.write(tmpdb);//����ʽ�ļ���д���ļ���
                      }
                      raf.close();//�ͷ���Դ
                      file.delete(); ///ɾ����ʱ�ļ�
                      fout.close();
                      System.out.println("*******�ļ��Ѿ���������ˣ�*******");
                    }
                  }
                  else {
                    buf.position(buflen); ///����ָ��ָ��buf�����λ��
                  }
                }
                else {
                  buf.position(buflen); ///����ָ��ָ��buf�����λ��
                }
              }
              break;
            }
          }
        }
      }
    }
    catch (ClosedChannelException ex) {
     System.out.println("����ClosedChannelException�쳣,ԭ�� ----> ��" + ex.getMessage());
   }
   catch (IOException ex) {
     System.out.println("��ѡ����ʱ�쳣��ԭ�� ----> ��" + ex.getMessage());
   }

  }

}
