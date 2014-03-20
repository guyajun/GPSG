package org.shu.construct.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.commons.net.ftp.FTPClient;

import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;

public class FtpUploadAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	FTPClient ftpClient = null;
	OutputStream os = null;
	FileInputStream is = null;
	
	public void upload(String localFilePath, String RemoteFilePath) throws Exception {
		ftpClient = new FTPClient();
		ftpClient.connect("127.0.0.1");
		ftpClient.login("ftp", "ftp");
		processFile(localFilePath, RemoteFilePath);
		ftpClient.disconnect();
	}

	private void processFile(String localPath, String remotePath)
			throws Exception {
		File file = new File(localPath);
		FileInputStream fis = null;
		if (file.exists()) {
			if(file.isFile()){
				fis = new FileInputStream(file);
				ftpClient.setBufferSize(1024);
				ftpClient.setControlEncoding("UTF-8");
				ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
				ftpClient.storeFile(new String(remotePath.getBytes("UTF-8"), "ISO-8859-1"), fis);
				fis.close();
			}
			else{
				ftpClient.makeDirectory(remotePath);
				File[] files = file.listFiles();
				for (int i = 0; i < files.length; i++) {
					String newlocalPath = localPath + "/" + files[i].getName();
					String newRemotePath = remotePath + "/" + files[i].getName();
					processFile(newlocalPath, newRemotePath);
				}				
			}
		}
	}

	public String mainUpload() throws Exception {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
		Date date=new Date();  
		String today=sdf.format(date);
		String localPath=request.getParameter("localPath");
		if(localPath.contains("\\\\")){
				localPath=localPath.replaceAll("\\\\", "/");
		}
		upload(localPath, "/" + today);
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("localPath", localPath);
		request.put("today", today);
		return SUCCESS;
	}
}