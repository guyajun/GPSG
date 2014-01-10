package org.shu.action;

import java.io.*;
import java.net.*;


public class FileClient {	
	public void sendData(String filepath, String IP, int port) {
		int progress = 0;
        // socket�����  
        DataOutputStream os = null;  
        // �ļ�������  
        DataInputStream is = null;  
        // ����socket����  
        Socket socket = null;  
        try {  
            // ѡ����д�����ļ�  
            File file = new File(filepath);  
  
            // ����socket����
            socket = new Socket(IP, port);
  
            os = new DataOutputStream(socket.getOutputStream());  
  
            // ���ļ��������ȴ����������ˡ�
            os.writeUTF(file.getName());  
            os.flush();  
            os.writeLong((long) file.length());  
            os.flush();  
  
            is = new DataInputStream(new BufferedInputStream(  
                    new FileInputStream(filepath)));  
            // ��������С  
            int bufferSize = 8192;  
            // ������  
            byte[] buf = new byte[bufferSize]; 
            
            // �����ļ�  
            while (true) {  
                int read = 0;  
                if (is != null) {  
                    read = is.read(buf);  
                }  
                progress += Math.abs(read);
                if (read == -1) {  
                    break;  
                }  
                os.write(buf, 0, read); 
                //���ͽ��ȡ�
                System.out.println("�ļ��ѷ��ͣ�" + (int)(100.0*progress/file.length()) + "%");
            }          
            os.flush(); 
            System.out.println("\n�ļ����ϴ���ϣ�");
	}catch (IOException e) {  
        e.printStackTrace();  
    } finally {  
        // �ر���������  
        try {  
            if (os != null)  
                os.close();  
        } catch (IOException e) {  
        	}  
        try {  
            if (is != null)  
                is.close();  
        } catch (IOException e) {  
        	}  
        try {  
            if (socket != null)  
                socket.close();  
        } catch (IOException e) {  
        	}  
        } 
    }  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 3) {
			System.err.println("Usage: FileClient: <file path> <server address> <port number>");
			System.exit(-1);
		}
		new FileClient().sendData(args[0], args[1], Integer.parseInt(args[2]));
//		new FileClient().sendData("E:\\hadoop-1.0.3.tar.gz", "202.117.10.158", 9600);
	}

}

