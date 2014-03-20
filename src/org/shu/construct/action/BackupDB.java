package org.shu.construct.action;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Map;

import org.tool.CommonParam;

import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;

public class BackupDB extends BaseAction {
	private static final long serialVersionUID = 1L;
	private String backupPath;
	private String restorePath;
	private File upload;
	private String uploadFileName;

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

	public String getRestorePath() {
		return restorePath;
	}

	public void setRestorePath(String restorePath) {
		this.restorePath = restorePath;
	}

	public String getBackupPath() {
		return backupPath;
	}

	public void setBackupPath(String backupPath) {
		this.backupPath = backupPath;
	}

	public String backup() {
		Map request = (Map) ActionContext.getContext().get("request");
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver")
					.newInstance();
			Connection con = DriverManager.getConnection(
					"jdbc:sqlserver://localhost:1433", "sa", "ZBF917ZGB919cs");
			if (!con.isClosed()) {
				System.out.println("Successfully connected to server");
			}
			Statement st1 = con.createStatement();
			if (backupPath.contains("\\\\")) {
				backupPath = backupPath.replaceAll("\\\\", "/");
			}
			String sql = "backup database GP0711 to disk = '" + backupPath
					+ "';";
			st1.executeUpdate(sql);
			st1.close();
			con.close();
			request.put("msg", "本地数据库备份成功！");
		} catch (Exception e) {
			request.put("msg", "本地数据库备份失败！");
			e.printStackTrace();
		}

		return SUCCESS;
	}

	public String restore() {
		if (upload != null) {
			Map request1 = (Map) ActionContext.getContext().get("request");
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver")
						.newInstance();
				Connection con = DriverManager.getConnection(
						"jdbc:sqlserver://localhost:1433", "sa",
						"ZBF917ZGB919cs");
				if (!con.isClosed()) {
					System.out.println("Successfully connected to server");
				}
				Statement st1 = con.createStatement();
				CommonParam cp = new CommonParam();
				String path = cp.getString("local-restore-path");
				String path1 = path + "/" + uploadFileName;
				String dbName = request.getParameter("dbName");
				String sql = "if exists(select 1 from master..sysdatabases where name='"
						+ dbName + "') BEGIN drop database " + dbName + "; restore database "+dbName+" from disk='"+path1+"'; END else restore database "+dbName+ " from disk='"
								+ path1 + "';";

				System.out.println("sql=" + sql);
				st1.executeUpdate(sql);
				request1.put("msg", "数据库还原成功！");
				st1.close();
				con.close();
			} catch (Exception e) {
				request1.put("msg", "数据库还原失败！请检查路径！");
				e.printStackTrace();
			}
		}
		return SUCCESS;
	}
}
