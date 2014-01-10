package file;

/**
 * <p>Title: Socekt���ѧϰ</p>
 *
 * <p>Description: �ļ�����Э����</p>
 *
 * <p>Copyright: Copyright (c) 2009</p>
 *
 * <p>Company: <a href="www.kum.net.cn">��è�Ƽ�</a></p>
 *
 * @author ����<380595305@qq.com>
 * @version 1.0
 */

import java.nio.ByteBuffer;

public class FileUtil {

  private byte FileInfo = 0x1; ///�ļ���Ϣ�ϴ�����
  private byte FileDB = 0x2; ///�ļ����ݴ�������
  private int BlockSize = 512;  ///�涨�ļ����СΪ512

  public byte[] getFileInfoPack(String FileName, int FileSize) {
    ByteBuffer buf = ByteBuffer.allocate(260);
    byte[] infopack = new byte[260];
    byte[] filename = new byte[255];

    System.arraycopy(FileName.getBytes(), 0, filename, 0, FileName.length());
    buf.clear();
    buf.put(FileInfo);
    buf.putInt(FileSize);
    buf.put(filename);
    buf.flip();
    buf.get(infopack);
    buf.compact();
    return infopack;
  }

  public byte[] getFileDB(int index, int blocksize, byte[] data) {
    byte[] filedb = new byte[9 + blocksize];
    ByteBuffer buf = ByteBuffer.allocate(9 + blocksize);
    buf.clear();
    buf.put(this.FileDB);
    buf.putInt(index);
    buf.putInt(blocksize);
    buf.put(data,0,blocksize);
    buf.flip();
    buf.get(filedb);
    buf.compact();
    return filedb;
  }

  public int getBlockSize(){
    return this.BlockSize;
  }

}
