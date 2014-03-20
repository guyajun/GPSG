package org.shu.plan.action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import common.base.action.BaseAction;
public class UploadAction extends BaseAction{
	private  List<File> upload;      			//上传的文件内容，由于是多个用List集合
	private List<String> uploadFileName;  			//文件名
	private String choosefile;
	
	public String getChoosefile() {
		return choosefile;
	}
	public void setChoosefile(String choosefile) {
		this.choosefile = choosefile;
	}
	public String execute() throws Exception {
		Integer path_flag=Integer.valueOf(request.getParameter("choosefile"));
//		System.out.println(path_flag);
		String path="";
		try
		{
			switch(path_flag)
			{
			case 1: path="pipeGangJinMake/"; break;
			case 2: path="pipeGuJiaMake/"; break;
			case 3: path="pipeGangMoMake/"; break;
			case 4: path="pipeDemisionCheck/"; break;
			case 5: path="pipeSteam/"; break;
			case 6: path="pipeWater/"; break;
			case 7: path="pipeHalfProCheck/"; break;
			case 8: path="pipeCertificate/"; break;
			case 9: path="pipeCheckLou/"; break;
			case 10: path="ConcretePouringRecord/"; break;
			case 11: path="horizontalTogether/"; break;
			}
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
//		System.out.println(path);
		if(upload!=null){
			for (int i = 0; i < upload.size(); i++) {   //遍历，得到每个文件对他们进行读写操作
				InputStream is=new FileInputStream(upload.get(i));
				OutputStream os=
						new FileOutputStream("D:/apache/apache-tomcat-7.0.39/webapps/GP/uploadfile/"+path+getUploadFileName().get(i));
				byte buffer[]=new byte[1024];
				int count=0;
				while((count=is.read(buffer))>0){
					os.write(buffer,0,count);
				}
				os.close();
				is.close();
			}
		}
		return SUCCESS;
	}
	public List<File> getUpload() {
		return upload;
	}
	public void setUpload(List<File> upload) {
		this.upload = upload;
	}
	public List<String> getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(List<String> uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
}
