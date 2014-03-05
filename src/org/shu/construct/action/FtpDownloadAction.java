package org.shu.construct.action;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

import com.opensymphony.xwork2.ActionContext;

import common.base.action.BaseAction;

public class FtpDownloadAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	FTPClient ftpclient = null;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void processdownload(String localPath, String remotePath)
			throws Exception {
		FileOutputStream fos = null;
		FTPFile[] list = null;
		list = ftpclient.listFiles(remotePath);
		File file = null;
		for (int i = 0; i < list.length; i++) {
			file = new File(localPath);
			if (list[i].isFile()) {
				fos = new FileOutputStream(file);
				ftpclient.setBufferSize(1024);
				ftpclient.setControlEncoding("UTF-8");
				ftpclient.setFileType(FTPClient.BINARY_FILE_TYPE);
				ftpclient.retrieveFile(new String(remotePath.getBytes("UTF-8"),
						"GB2312"), fos);
				fos.close();
			}
		}
	}

	public void download(String localPath, String remotePath) throws Exception {
		ftpclient = new FTPClient();
		ftpclient.connect("127.0.0.1");
		ftpclient.login("ftp", "ftp");
		processdownload(localPath, remotePath);
		ftpclient.disconnect();
	}

	public String mainDownload() throws Exception {
		String zip = request.getParameter("downloads");
		String savePath = "C:\\Users\\Administrator\\Downloads";
		if (savePath.contains("\\\\")) {
			savePath = savePath.replaceAll("\\\\", "/");
		}
		System.out.println("savePath="+savePath);
		download(savePath + "/" + zip, "/" + zip);
		message = "下载完毕";
		UnZip unZip=new UnZip();
		unZip.beginUnZip();
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("msg", "FTP文件"+zip+"已下载至本地"+savePath);
		return SUCCESS;
	}
}