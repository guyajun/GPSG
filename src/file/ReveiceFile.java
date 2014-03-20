package file;

import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;

/**
 * <p>Title: Socekt���ѧϰ</p>
 *
 * <p>Description: �ļ����ն�</p>
 *
 * <p>Copyright: Copyright (c) 2009</p>
 *
 * <p>Company: <a href="www.kum.net.cn">��è�Ƽ�</a></p>
 *
 * @author ����<380595305@qq.com>
 * @version 1.0
 */
public class ReveiceFile {
  public static void main(String[] args){
    try{
    System.out.println("***********�ļ����ն�***********");
      SocketAddress saddress = new InetSocketAddress(9999);
      ServerSocketChannel ssc = ServerSocketChannel.open();
      ssc.socket().bind(saddress);
      ssc.configureBlocking(false);
      Selector selector = Selector.open();
      SelectionKey selkey = ssc.register(selector, SelectionKey.OP_ACCEPT);
      while (selkey.selector().isOpen()) {
        int key = selector.select();
        if (key == 0) {
          (new ReveiceThread(ssc.accept())).start();
          System.out.println("�ļ����Ͷ���������...");
        }
      }
    }catch(Exception err){
      System.out.println("�ȴ��ļ����Ͷ�����ʱ�쳣��ԭ��" + err.getMessage());
    }
  }
}
