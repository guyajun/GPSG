package file;
import java.net.*;
import java.io.*;
class  Client
{
	public static void main(String[] args) 
	{
		try
		{
			Socket s=new Socket(InetAddress.getByName("127.0.0.1"),65432);
		 OutputStream os=s.getOutputStream();
		       InputStream is=s.getInputStream();
			   
			   FileInputStream fos=new FileInputStream("e:\\love1.txt");
			   BufferedInputStream bis=new BufferedInputStream(fos);
			   
          byte[] buf=new byte[1000];
		  int length=bis.read(buf);
		  
		  //os.write("begin to send message".getBytes());
		 // Thread.sleep(3000);
        
		 os.write(buf,0,length);
		 os.close();
		 //int len=is.read(buf);
		 //System.out.println(new String(buf,0,len));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}