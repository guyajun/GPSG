package org.shu.construct.action;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;

public class FtpAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	private String ip = "127.0.0.1";
	private String username = "ftp";
	private String password = "ftp";

	public String getSon() {
		FTPClient ftpClient = new FTPClient();
		FileInputStream fis = null;
		String fileFolder1 = request.getParameter("folder");
		String ftpPath = request.getParameter("ftpPath");
		String path = "";
		if (ftpPath.equals("/")) {
			path = ftpPath + fileFolder1;
		} else {
			path = ftpPath + "/" + fileFolder1;
		}
		try {
			ftpClient.connect("127.0.0.1");
			ftpClient.login("ftp", "ftp");
			FTPFile[] files = ftpClient.listFiles(path);
			ArrayList<String> list = new ArrayList<String>();
			for (int j = 2; j < files.length; j++) {
				list.add(files[j].getName());
			}
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("list", list);
			request.put("ftpPath", path);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("FTP客户端出错！", e);
		} finally {
			IOUtils.closeQuietly(fis);
			try {
				ftpClient.disconnect();
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("关闭FTP连接发生异常！", e);
			}
		}
		return SUCCESS;
	}

	public String getAllFtpFolders() throws Exception, IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = sdf.parse(request.getParameter("startDate"));
		Date endDate = sdf.parse(request.getParameter("endDate"));
		System.out.println("startDate=" + startDate);
		System.out.println("endDate=" + endDate);
		FTPClient ftpClient = new FTPClient();
		ftpClient.connect(ip);
		ftpClient.login(username, password);
		FTPFile[] files = ftpClient.listFiles();
		ArrayList<String> dadList = new ArrayList<String>();
		for (int j = 2; j < files.length; j++) {
			System.out.println("files[j].getName()=" + files[j].getName());
			String str[] = files[j].getName().split("-");
			if (str.length == 3) {
				if (str[0].length() == 4 && str[1].length() == 2
						&& str[2].length() == 2) {
					Date date = sdf.parse(files[j].getName());
					if ((date.after(startDate) && date.before(endDate))
							|| date.equals(startDate) || date.equals(endDate)) {
						dadList.add(files[j].getName());
					}
				}
			}
		}
		String ftpPath = "/";
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("dadList", dadList);
		request.put("ftpPath", ftpPath);
		ftpClient.disconnect();
		return SUCCESS;
	}
}