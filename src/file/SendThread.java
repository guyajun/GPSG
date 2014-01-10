package file;

/**
 * <p>Title: Socekt���ѧϰ</p>
 *
 * <p>Description: �ļ����䷢�Ͷ�</p>
 *
 * <p>Copyright: Copyright (c) 2009</p>
 *
 * <p>Company: <a href="www.kum.net.cn">��è�Ƽ�</a></p>
 *
 * @author ����<380595305@qq.com>
 * @version 1.0
 */

import java.nio.channels.SocketChannel;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.nio.ByteBuffer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SendThread
    extends Thread {
  private FileUtil util = new FileUtil();

  private SocketChannel s_channel = null;
  private int down_count = 1; //��¼�ļ������յĴ���
  private InputStream is = null;
  private InputStreamReader isr = null;
  private BufferedReader br = null;

  private ByteBuffer buf = ByteBuffer.allocate(1024);
  public SendThread(SocketChannel channel) {
    this.s_channel = channel;
  }
  public void run() {
     String ch = "";
   do{
      try {
        System.out.print("****��ѡ����Ҫ���͵��ļ���"); //ѡ����д�����ļ�
        is = System.in; //�������������
        isr = new InputStreamReader(is);
        br = new BufferedReader(isr);
        String filePath = br.readLine(); //����̨��ȡĿ���ļ�·��
        if (filePath.equals("exit")) {
          break;
        }
        int index = 0; //�ļ�������
        int size = 0; //�ļ����С
        File file = new File(filePath); //�����ļ�����
        FileInputStream filestream = new FileInputStream(file); //��װһ���ļ������
        byte[] filedb = new byte[util.getBlockSize()]; //����һ���ļ���(�ֽ�����)
        System.out.println("�ļ�����: ---->" + filePath);
        byte[] fileinfo = util.getFileInfoPack(file.getName(),
                                               (int) file.length());
        buf.clear(); //�д��о�***********************************
        buf.put(fileinfo); //���ļ�����ӵ�ByteBuffer��
        buf.flip(); //����������Ϊ��ǰλ�ã�λ������Ϊ0
        size = buf.limit(); //��ü���ֵ
        while ( (size -= this.s_channel.write(buf)) > 0) {}
        buf.compact();
        System.out.println("�ļ�������� O(��_��)O����~");
        while ( (size = filestream.read(filedb)) != -1) {
          byte[] filedatabase = util.getFileDB(index, size, filedb);
          buf.clear(); //�д��о�*************************************
          buf.put(filedatabase);
          buf.flip(); //�д��о�***************************************
          while ( (size -= this.s_channel.write(buf)) > 0) {}
          buf.compact(); //�д��о�**************************************
          index++;
        }
        System.out.println("�ļ�������ɣ�����" + (down_count++) +
                           "���ͻ���(�ļ����ն�)�����˷���˷��͵��ļ�!");
        filestream.close();
        System.out.println("****�����ļ����ͳɹ�!****");
      }
      catch (Exception err) {
        System.out.println("�����ļ�ʱ�쳣��ԭ��  ---->" + err.getMessage());
      }
      //////////////////////////��ʾ�Ƿ��������////////////////////////////
       System.out.println("�Ƿ�������䣺(y or n)");
       is = System.in;
       isr = new InputStreamReader(is);
       br = new BufferedReader(isr);
         try {
           ch = br.readLine();
           if(!("y".equalsIgnoreCase(ch))){
             System.out.println("��ѡ�����˳�����!");
             System.exit(1);//�����˳�
           }
         }
         catch (IOException ex1) {
           System.out.println("��ȡ�ַ�����ʱ�쳣��ԭ��"+ex1.getMessage());
         }
     }
     while ("y".equalsIgnoreCase(ch));
  }
}
