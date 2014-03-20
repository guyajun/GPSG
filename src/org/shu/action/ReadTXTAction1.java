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
            String encoding = "GBK"; // 字符编码(可解决中文乱码问题 )   
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
               System.out.println("找不到指定的文件！"); 
           } 
          
       } catch (Exception e) {  
           System.out.println("读取文件内容操作出错");
           e.printStackTrace();
          // return ERROR;
       } 
        return SUCCESS;

   }   

}  
