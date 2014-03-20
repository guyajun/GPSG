package org.shu.construct.action;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.net.ftp.FTPClient;
import org.tool.CommonParam;
import common.base.action.BaseAction;

public class StreamAction extends BaseAction {
	private InputStream fileStream;
	public InputStream getFileStream() {
		return fileStream;
	}

	public void setFileStream(InputStream fileStream) {
		this.fileStream = fileStream;
	}
	public String getFtpStream() throws IOException {//ftp下载文件
		FTPClient ftpclient = new FTPClient();
		ftpclient.connect("127.0.0.1");
		ftpclient.login("ftp", "ftp");
		CommonParam cp = new CommonParam();
		String localPath = cp.getString("local-imgs-path");
		String folder=request.getParameter("folder");
		String fileName=request.getParameter("fileName");
		File file=new File(localPath+"/"+folder+"/"+fileName);
		InputStream is = new FileInputStream(file);
		fileStream = new BufferedInputStream(is);
		return SUCCESS;
	}
	public String getStream() throws IOException {//施工端图片
		CommonParam cp = new CommonParam();
		String localPath = cp.getString("local-imgs-path");
		String folder=request.getParameter("folder");
		String fileName=request.getParameter("fileName");
		File file=new File(localPath+"/"+folder+"/"+fileName);
		InputStream is = new FileInputStream(file);
		fileStream = new BufferedInputStream(is);
		return SUCCESS;
	}
	public String getProduceStream() throws IOException {//生产端图片
		CommonParam cp = new CommonParam();
		String localPath = cp.getString("local-imgs-produce");
		String date=request.getParameter("date");
		String folder=request.getParameter("folder");
		String fileName=request.getParameter("fileName");
		File file=new File(localPath+"/"+date+"/"+folder+"/"+fileName);
		InputStream is = new FileInputStream(file);
		fileStream = new BufferedInputStream(is);
		return SUCCESS;
	}
}