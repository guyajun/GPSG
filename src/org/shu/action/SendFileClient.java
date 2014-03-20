package org.shu.action;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;


public class SendFileClient
{

    private static final int    Server_PORT    = 6000;
    private static final int    Client_PORT    = 6001;
    
    /**
     * 使用方法：运行这个程序需要带上参数，参数类型为点分十进制的ip地址，例如：192.168.0.153
     * @param args
     * @throws IOException 
     */
    public static void main( String[] args ) throws IOException
    {
        // TODO Auto-generated method stub

        System.out.println( "This is client" );      
        byte[] buf = new byte[100];
        byte[] name = new byte[100];
        //InetAddress inetAddr;

        
        if ( !isIPAddress(args[0]) )
        {
            System.out.println("The usage is : java SendFileClient ipaddress");
            System.out.println("For example : java SendFileClient 192.168.0.153");
            
            return;
        }
        
        String ipStr = args[0];
        try
        {
            // 创建一个Socket

            Socket s = new Socket();
            s.connect ( new InetSocketAddress (ipStr , Server_PORT ), Client_PORT );
            OutputStream os = s.getOutputStream( );// 输出流

            InputStream is = s.getInputStream( );// 输入流

            int len = is.read( buf );// 从输入流中读取数据到buf

            System.out.println( new String( buf, 0, len ) );
            // 向输出流中写入数据,请求传输一个文件

            os.write( "get server.txt".getBytes( ) );
            len = is.read( buf );// 从输入流中读取数据到buf

            String tempStr = new String(buf,0,len);
            if ( tempStr.startsWith( "Please input your name and password" ) )
            {
                System.out.println("Please input your name and password, ");
                System.out.println("Using the format:name@password:");
                do
                {
                    System.in.read( name ); 
                } while ( name.length<5 );
                os.write( name );
            }
            
            //开始读取文件数据并把它写到一个名为"clientread.txt"的文件中

            FileOutputStream fos = new FileOutputStream( "clientread.txt" );
            int data;
            while ( -1 != ( data = is.read( ) ) )
            {
                fos.write( data );
            }
            
            System.out.println("\nFile has been recerved successfully.");
            os.close( );
            is.close( );
            s.close( );
        } catch ( Exception ex )
        {
            ex.printStackTrace( );
        }
    }
    
    //简单的判断字符串是否为一个ip地址

    //后期再完善该判断方法

    private static boolean isIPAddress( String ip )
    {
        if(ip.length( )<5)
        {
            return false;            
        }else
        {
            return true;
        }
    }
}
