package org.shu.action;

import java.io.BufferedReader; 
import java.io.File; 
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import common.base.action.BaseAction;
@SuppressWarnings("serial")
public class ReadTXTAction1 extends BaseAction{   
    public String readTxt() {  
        try {  
            String encoding = "GBK"; // �ַ�����(�ɽ�������������� )   
          File file = new File("F:/test/aa.txt"); 
           if (file.isFile() && file.exists()) {   
               InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);   

                BufferedReader bufferedReader = new BufferedReader(read); 
               String lineTXT = null; 
               while ((lineTXT = bufferedReader.readLine()) != null) {                  
                     Map request = (Map) ActionContext.getContext().get("request");
         			request.put("saomiao1",lineTXT.toString().trim());
               }  
               read.close();   
            }else{ 
               System.out.println("�Ҳ���ָ�����ļ���"); 
           } 
          
       } catch (Exception e) {  
           System.out.println("��ȡ�ļ����ݲ�������");
           e.printStackTrace();
          // return ERROR;
       } 
        return SUCCESS;

   }   

}  
