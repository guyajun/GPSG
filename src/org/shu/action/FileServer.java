package org.shu.action;

import java.io.*;
import java.net.*;

public class FileServer {
	
	private ServerSocket server = null;
	Socket socket = null;
	
	public void getData(String savePath,int port) {
		int progress = 0;
        
		try {
			// 建立socket监听。
			server = new ServerSocket(port);
			
		while ( (socket = server.accept()) != null) {
			// 建立socket输入流  
			DataInputStream inputStream = new DataInputStream(new BufferedInputStream(socket  
                    .getInputStream()));  
            // 缓冲区大小  
            int bufferSize = 8192;  
            // 缓冲区  
            byte[] buf = new byte[bufferSize];  
            int passedlen = 0;  
            long len = 0;  
            // 获取文件名称
            if( !savePath.contains("."))
            savePath += inputStream.readUTF();  
            DataOutputStream fileOut = new DataOutputStream(  
                    new BufferedOutputStream(new BufferedOutputStream(  
                            new FileOutputStream(savePath))));  
            // 获取文件长度  
            len = inputStream.readLong();  
  
            System.out.println("文件的长度为:" + len + "  KB");  
            System.out.println("开始接收文件!");  
  
            // 获取文件，下边是进度条。
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
//                	        System.out.println("文件接收了" + progress + "%"); 
                	        System.out.print(">");
                			}

                fileOut.write(buf, 0, read);  
            } 
            System.out.println();
            System.out.println("接收完成，文件存为: " + savePath);  
            fileOut.close();  
        	} 
		}catch (Exception e){
			System.err.println("File Server Excetption: " + e);
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args) {
    	//函数运行之前要指定待传送文件地址。
    	if(args.length != 2){
    		System.err.println("Usage: FileServer <save path> <port>");
    		System.exit(-1);
    	}
//		new FileServer().getData("F:\\\\", 9600); 
        new FileServer().getData(args[0], Integer.parseInt(args[1])); 
	}

}
