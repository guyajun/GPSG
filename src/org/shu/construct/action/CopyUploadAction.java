package org.shu.construct.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

import common.base.action.BaseAction;
@SuppressWarnings("serial")
public class CopyUploadAction extends BaseAction{
	private  File upload;      			
	private String uploadFileName;
	private String uploadContentType;	
	
	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
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
	
	public String execute(){
		if(upload!=null){	
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
			Date date=new Date();  
			String today=sdf.format(date);
			FTPClient ftpClient =new FTPClient();
			try {
				uploadFileName=new String(uploadFileName.getBytes("UTF-8"), "ISO-8859-1");
				ftpClient.connect("111.186.106.171");
				ftpClient.login("ftp", "ftp");
				FTPFile[] files=ftpClient.listFiles("/");
				FileInputStream fis = null;
				fis = new FileInputStream(upload);
				ftpClient.setBufferSize(1024);
				ftpClient.setControlEncoding("UTF-8");
				ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
				String remoteName="/"+today+"."+FilenameUtils.getExtension(uploadFileName);
				ftpClient.storeFile(remoteName, fis);
				fis.close();
				ftpClient.disconnect();
			} catch (SocketException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}			
		}
		return SUCCESS;
	}
		
}
	