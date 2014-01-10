package org.shu.action;

import java.net.*;
import java.io.*;

/**
 * һ���򵥵Ķ��̷߳���������,���ڴ����ļ�
 * 
 * @author zieckey
 */
public class SendFileSocket extends Thread
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
        
        server( );//��������������

    }

    private static final int    PORT        = 6000;
    private Socket                s;
    private static final String    name        = "zieckey";
    private static final String    password    = "123456";

    public SendFileSocket( Socket s )
    {
        this.s = s;
    }

    public void run()
    {
        try
        {
            OutputStream os = s.getOutputStream( );
            InputStream is = s.getInputStream( );
            os.write( "Hello,welcome you!".getBytes( ) );
            byte[] buf = new byte[100];
            while ( true )
            {

                int len = is.read( buf );
                String revStr = new String( buf, 0, len );
                System.out.println( "This client wants to "+revStr );
                String fileName;
                if ( revStr.startsWith( "get " ) )//�����ͻ���������һ���ļ�

                {
                    os.write( "Please input your name and password! Using the format:name@password"
                                    .getBytes( ) );
                    fileName = getFileName( revStr );
                    len = is.read( buf );
                    revStr = new String( buf, 0, len );
                    System.out.println( "The received user name and password:"+revStr);
                    if ( revStr.startsWith( "zieckey@123456" ) )
                    {
                        FileInputStream fins = new FileInputStream( fileName );
                        //byte[] fielBuf = new byte[100];

                        int data;
                        while ( -1 != ( data = fins.read( ) ) )//���ļ��ж�ȡ���ݣ�ÿ�ζ�ȡ1�ֽ�

                        {
                            os.write( data ); //����ȡ��������д�������������з��͸��ͻ���

                        }
                        break;
                    }
                } else
                {
                    os.write( "geting file's usage is:get filename".getBytes( ) );
                }
            }

            os.close( );
            is.close( );
            s.close( );
        } catch ( Exception e )
        {
            e.printStackTrace( );
        }

    }

    /* 
     * ���ã��ӿͻ��˷������ļ�������������ȡ����������ļ���
     * �������ͻ��˷������ļ����������ַ�����Ӧ���ԡ�get ����ͷ
     * ����ֵ����ȡ����������ļ���
     */
    private String getFileName( String revStr )
    {
        String fileName;
        fileName = revStr.substring( 3 );
        while ( fileName.startsWith( " " ) )
        {
            fileName = fileName.substring( 1 );
        }
        return fileName;
    }

    public static void server()
    {
        System.out.println( "This is server" );
        try
        {
            ServerSocket ss = new ServerSocket( PORT );
            int count = 0;
            while ( true )
            {
                // ����һ��Socket�ȴ��ͻ�������

                Socket s = ss.accept( );
                count++ ;
                System.out.println( "This is the " + count + "'st client connetion!" );
                new SendFileSocket( s ).start( );// ����һ���߳�Ϊ����ͻ��˷���

            }
        } catch ( Exception ex )
        {
            ex.printStackTrace( );
        }
    }
}
