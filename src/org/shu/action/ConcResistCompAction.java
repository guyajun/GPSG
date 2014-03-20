package org.shu.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import org.shu.model.ConcResistComp;
import org.shu.service.imp.ConcResistCompService;
import org.shu.service.imp.UserInfoService;
import org.tool.CommonParam;

import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;

@SuppressWarnings("serial")
public class ConcResistCompAction extends BaseAction {
	protected ConcResistComp concResistComp;
	protected ConcResistCompService concResistCompService;
	private String fileName;
	private  File upload;      			//上传的文件内容，由于是多个用List集合
	private String uploadFileName;  			//文件名
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public ConcResistComp getConcResistComp() {
		return concResistComp;
	}

	public void setConcResistComp(ConcResistComp concResistComp) {
		this.concResistComp = concResistComp;
	}

	public void setConcResistCompService(
			ConcResistCompService concResistCompService) {
		this.concResistCompService = concResistCompService;
	}

	public String execute() throws Exception {
		CommonParam cp=new CommonParam();
		String uploadpath=cp.getString("Server_upload_path");
		String str=concResistComp.getReportId();
		if(upload!=null){		
				InputStream is=new FileInputStream(upload);
				
				String str2=getUploadFileName();
				String[] names = str2.split("\\.");	
				str+="."+names[1];
				setFileName(str);
				OutputStream os=
						new FileOutputStream(uploadpath+str);
				byte buffer[]=new byte[1024];
				int count=0;
				while((count=is.read(buffer))>0){
					os.write(buffer,0,count);			
				}
				os.close();
				is.close();
	
		}
		ConcResistComp concResistComp1 = new ConcResistComp();
		concResistComp1.setApprover(concResistComp.getApprover());
		concResistComp1.setChecker(concResistComp.getChecker());
		concResistComp1.setReportId(concResistComp.getReportId());
		concResistComp1.setResistCompIsQual(concResistComp
				.getResistCompIsQual());
		concResistComp1.setResistCompStan(concResistComp.getResistCompStan());
		concResistComp1.setResistCompValue(request.getParameter("resistCompValue1")
				+"@"+request.getParameter("resistCompValue2")
				+"@"+request.getParameter("resistCompValue3"));
		concResistComp1.setDate(concResistComp.getDate());
		concResistComp1.setUrl(str);
		concResistCompService.saveConcResistComp(concResistComp1);
		return SUCCESS;
	}

}
