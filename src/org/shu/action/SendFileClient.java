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
     * ʹ�÷������������������Ҫ���ϲ�������������Ϊ���ʮ���Ƶ�ip��ַ�����磺192.168.0.153
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
            // ����һ��Socket

            Socket s = new Socket();
            s.connect ( new InetSocketAddress (ipStr , Server_PORT ), Client_PORT );
            OutputStream os = s.getOutputStream( );// �����

            InputStream is = s.getInputStream( );// ������

            int len = is.read( buf );// ���������ж�ȡ���ݵ�buf

            System.out.println( new String( buf, 0, len ) );
            // ���������д������,������һ���ļ�

            os.write( "get server.txt".getBytes( ) );
            len = is.read( buf );// ���������ж�ȡ���ݵ�buf

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
            
            //��ʼ��ȡ�ļ����ݲ�����д��һ����Ϊ"clientread.txt"���ļ���

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
    
    //�򵥵��ж��ַ����Ƿ�Ϊһ��ip��ַ

    //���������Ƹ��жϷ���

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
