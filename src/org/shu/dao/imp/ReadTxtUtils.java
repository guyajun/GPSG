package org.shu.dao.imp;  
  
import java.io.BufferedReader;   

import java.io.File;   

import java.io.FileInputStream;   

import java.io.InputStreamReader;   



public class ReadTxtUtils {   

    public static void main(String arg[]) {   

        try {   

            String encoding = "GBK"; // �ַ�����(�ɽ�������������� )   

          File file = new File("F:/test/aa.txt");   

           if (file.isFile() && file.exists()) {   

               InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);   

                BufferedReader bufferedReader = new BufferedReader(read);   

               String lineTXT = null;   

               while ((lineTXT = bufferedReader.readLine()) != null) {   

                     System.out.println(lineTXT.toString().trim());   

               }   

               read.close();   

            }else{   

               System.out.println("�Ҳ���ָ�����ļ���");   

           }   

       } catch (Exception e) {   

           System.out.println("��ȡ�ļ����ݲ�������");   

           e.printStackTrace();   

       }   

   }   

}  
