package org.shu.action;

import java.io.*;
import java.net.*;

public class FileServer {
	
	private ServerSocket server = null;
	Socket socket = null;
	
	public void getData(String savePath,int port) {
		int progress = 0;
        
		try {
			// ����socket������
			server = new ServerSocket(port);
			
		while ( (socket = server.accept()) != null) {
			// ����socket������  
			DataInputStream inputStream = new DataInputStream(new BufferedInputStream(socket  
                    .getInputStream()));  
            // ��������С  
            int bufferSize = 8192;  
            // ������  
            byte[] buf = new byte[bufferSize];  
            int passedlen = 0;  
            long len = 0;  
            // ��ȡ�ļ�����
            if( !savePath.contains("."))
            savePath += inputStream.readUTF();  
            DataOutputStream fileOut = new DataOutputStream(  
                    new BufferedOutputStream(new BufferedOutputStream(  
                            new FileOutputStream(savePath))));  
            // ��ȡ�ļ�����  
            len = inputStream.readLong();  
  
            System.out.println("�ļ��ĳ���Ϊ:" + len + "  KB");  
            System.out.println("��ʼ�����ļ�!");  
  
            // ��ȡ�ļ����±��ǽ�������
            System.out.print("#>>>>>>>>#>>>>>>>>>#>>>>>>>>>#>>>>>>>>>#>>>>>>>>>#");
            System.out.println(">>>>>>>>>#>>>>>>>>>#>>>>>>>>>#>>>>>>>>>#>>>>>>>>>#");  
            while (true) {  
                int read = 0;  
                if (inputStream != null) {  
                    read = inputStream.read(buf);  
                }  
                passedlen += read;
                if (read == -1) {  
                    break;  
                }

                if((int)(passedlen * 100.0 / len)-progress > 0){
                	        progress = (int)(passedlen * 100.0 / len);
//                	        System.out.println("�ļ�������" + progress + "%"); 
                	        System.out.print(">");
                			}

                fileOut.write(buf, 0, read);  
            } 
            System.out.println();
            System.out.println("������ɣ��ļ���Ϊ: " + savePath);  
            fileOut.close();  
        	} 
		}catch (Exception e){
			System.err.println("File Server Excetption: " + e);
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args) {
    	//��������֮ǰҪָ���������ļ���ַ��
    	if(args.length != 2){
    		System.err.println("Usage: FileServer <save path> <port>");
    		System.exit(-1);
    	}
//		new FileServer().getData("F:\\\\", 9600); 
        new FileServer().getData(args[0], Integer.parseInt(args[1])); 
	}

}
