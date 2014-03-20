package file;
import java.net.*;
import java.io.*;
class Server 
{
	public static void main(String[] args) 
	{
		try
		{
			while(true)
			{
			  ServerSocket ss=new ServerSocket(65432);
		      Socket s=ss.accept();
		       
			   OutputStream os=s.getOutputStream();
		       InputStream is=s.getInputStream();
			  
			   FileOutputStream fos=new FileOutputStream("e:\\love2.txt");
			  BufferedOutputStream bos=new BufferedOutputStream(fos);
		      byte[] buf=new byte[1000];
			 // Thread.sleep(3000);
			 // os.write("begin to receive".getBytes());
			 // Thread.sleep(4000);
		    
		      int len=is.read(buf);
			  bos.write(buf,0,len);
			  bos.close();
		     // System.out.println(new String(buf,0,len));
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
