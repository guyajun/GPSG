package file;


import java.nio.channels.SocketChannel;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.io.IOException;

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
public class SendFile {
    public static void main(String[] args) throws IOException {
        System.out.println("***********�ļ����Ͷ�***********");
        SocketAddress address = new InetSocketAddress("58.198.100.138", 9999); //���׽���ͨ�������������ӵ�Զ��
        SocketChannel sc = SocketChannel.open(address);
        sc.configureBlocking(false);
        Selector selector = Selector.open(); //��ѡ����
        SelectionKey key = sc.register(selector, SelectionKey.OP_READ); //ע��key,Ϊread��ʽ
        new SendThread(sc).start();
        while (key.selector().isOpen()) {
          int celkey = selector.select();
          if (celkey == 0) {
            System.out.println("�ļ����ն���������...");
          }
        }
      }
  }
