package org.shu.construct.action;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import org.apache.commons.net.ftp.FTPClient;
import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;

public class FtpDownloadStream extends BaseAction {
	private static final long serialVersionUID = 1L;
	FTPClient ftpclient = null;
	private InputStream fileStream;
	private String downloadZip;

	public String getDownloadZip() {
		return downloadZip;
	}

	public void setDownloadZip(String downloadZip) {
		this.downloadZip = downloadZip;
	}

	public InputStream getFileStream() {
		return fileStream;
	}

	public void setFileStream(InputStream fileStream) {
		this.fileStream = fileStream;
	}
	public String mainDownload() throws Exception, IOException {
		downloadZip = request.getParameter("downloadZip");
		ftpclient = new FTPClient();
		ftpclient.connect("127.0.0.1");
		ftpclient.login("ftp", "ftp");
		String remotePath = "/" + downloadZip;
		ftpclient.setBufferSize(1024 * 1024);
		ftpclient.setControlEncoding("UTF-8");
		ftpclient.setFileType(FTPClient.BINARY_FILE_TYPE);
		fileStream = ftpclient.retrieveFileStream(remotePath);
		return SUCCESS;
	}
}