package org.shu.connection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.tool.CommonParam;

import common.base.action.BaseAction;

public class ConnectionTest extends BaseAction {
	String remotip;
	String port;
	String database;
	
	public String getRemotip() {
		return remotip;
	}

	public void setRemotip(String remotip) {
		this.remotip = remotip;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String synch() {
		
		/** ============备份数据库=========**/
		Connection conn = null;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            String url="jdbc:sqlserver://localhost:1433;databaseName=GP;user=aa;password=aa";
            conn= DriverManager.getConnection(url);
            bkData("E:\\databackup\\","GP",conn);
        }
        //异常
        catch(Exception e)
        {
            e.printStackTrace();
        }
        //释放连接
        finally
        {
            try{conn.close();}catch(Exception e){}
        }
        /**备份数据库完成**/
		// TODO Auto-generated method stub
		String[] alltable = { "four_table_same_part", "CONC_POUR",
				"GP_STEAM_CURING", "GP_WATER_CURING", "STEEL_SKEL_HALF",
				"GP_CHECK_LEAK", "GP_ASSEMBLE", "report_pdf_mapping" };
		/** 加载数据库引擎 **/
		String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";// SQL数据库引擎
		String ipaddress=request.getParameter("remotip");
		String remote_port=request.getParameter("port");
		String remote_db=request.getParameter("database");
		String connection_info="jdbc:sqlserver://"+ipaddress+":"+port+";DatabaseName="+remote_db;
		CommonParam cp = new CommonParam();
		String connectDB = connection_info; // 数据源注意IP地址和端口号，数据库名字！！！

		String connectLC = cp.getString("Server_DB");
		try {
			Class.forName(JDriver);// 加载数据库引擎，返回给定字符串名的类
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
			System.out.println("加载数据库引擎失败");
		
		}
		System.out.println("数据库驱动成功");
		/** 连接远程数据库 **/
		try {
			String user = cp.getString("Remote_Name");// 你自己创建的用户名字和密码！！！！！！！！！！！！
			String password = cp.getString("Remote_Password");
			Connection con = DriverManager.getConnection(connectDB, user,
					password);// 连接数据库对象
			System.out.println("连接服务器数据库成功");
			Statement stmt = con.createStatement();// 创建SQL命令对象
			ResultSetMetaData rsmd = null; // 字段变量
			String sql = ""; // 插入语句
			String[] value = new String[100]; // 存放每条记录的数值

			/** 读取数据库中所有表名称 **/
			DatabaseMetaData databaseMetaData = con.getMetaData();
			String[] tableType = { "TABLE" };
			ResultSet rs_table = databaseMetaData.getTables(null, null, "%",
					tableType);

			/** 连接本地数据库 **/
			String userlocal = cp.getString("Server_Name");// 你自己创建的用户名字和密码！！！！！！！！！！！！
			String passwordlocal = cp.getString("Server_Password");
			Connection conlocal = DriverManager.getConnection(connectLC,
					userlocal, passwordlocal);// 连接数据库对象
			System.out.println("连接本地数据库成功");
			Statement stmtTF = conlocal.createStatement();// 创建SQL命令对象
			/** 对每个表进行更新 **/
			while (rs_table.next()) {
				String table_name = rs_table.getString(3);
	
				/** 连接表 **/

				for (int kk = 0; kk < alltable.length; kk++) {

					if (table_name.equals(alltable[kk])) {
						List serverData = new ArrayList();
						ResultSet rs_server = stmtTF
								.executeQuery("select * from " + table_name);
						while (rs_server.next()) {
							String sever_report_id = "";
							if (table_name.equals("four_table_same_part")) {
								sever_report_id = rs_server
										.getString("Report_id");
							} else {
								sever_report_id = rs_server
										.getString("Report_ID");
							}
							serverData.add(sever_report_id);
						}
						String status = "";
						if (table_name.equals("four_table_same_part")) {
							status = "Report_status";
						}
						if (table_name.equals("CONC_POUR")) {
							status = "Report_status";
						}
						if (table_name.equals("GP_STEAM_CURING")) {
							status = "status";
						}
						if (table_name.equals("GP_WATER_CURING")) {
							status = "Report_status";
						}
						if (table_name.equals("STEEL_SKEL_HALF")) {
							status = "Report_status";
						}
						if (table_name.equals("GP_CHECK_LEAK")) {
							status = "Report_status";
						}
						if (table_name.equals("GP_ASSEMBLE")) {
							status = "status";
						}

						System.out.println("开始更新数据表：" + alltable[kk]);
						// stmtTF.executeUpdate("DELETE FROM "+table_name);
						System.out.println("开始读取服务器数据库");
						ResultSet rs;
						if (table_name.equals("report_pdf_mapping")) {
							// stmtTF.executeUpdate("DELETE FROM "+table_name);
							rs = stmt.executeQuery("SELECT * FROM "
									+ table_name);
						} else {
							String mysql="SELECT * FROM "
									+ table_name + " WHERE " + status + "= 1";
						
							rs = stmt.executeQuery("SELECT * FROM "
									+ table_name + " WHERE " + status + "= 1");
						}
						rsmd = rs.getMetaData(); // 获取表的字段名
						int column_count = rsmd.getColumnCount();
						List column_array = new ArrayList();
						for (int i = 0; i < column_count; i++) {
							column_array.add(rsmd.getColumnName(i + 1));
						}
						/** 创建SQL语句 **/
						while (rs.next()) {
							String locao_report_id = "";
							if (table_name.equals("four_table_same_part")) {
								locao_report_id = rs
										.getString("Report_id");
							} else {
								locao_report_id =rs // rs_server
										.getString("Report_ID");
							}
							if (!serverData.contains(locao_report_id)) {
								sql = "INSERT INTO " + table_name + "(";
								for (int j = 1; j < column_array.size(); j++) {
									value[j] = rs
											.getString((String) column_array
													.get(j));
									if (j != column_array.size() - 1)
										sql = sql
												+ (String) column_array.get(j)
												+ ",";
									else
										sql = sql
												+ (String) column_array.get(j)
												+ ")";
								}
								
								sql = sql + " VALUES(";
								for (int k = 1; k < column_array.size(); k++) {
									if (k != column_array.size() - 1)
										if (value[k] == null) {
											sql = sql + "null,";
										} else {
											sql = sql + "'" + value[k] + "',";
										}
									else if (value[k] == null) {
										sql = sql + "null)";
									} else {
										sql = sql + "'" + value[k] + "')";
									}
								}// for(k) 结束
							
								try {
									// 创建表
									System.out.println("开始更新数据");
									stmtTF.executeUpdate(sql);// 返回SQL语句查询结果集(集合)
									System.out.println("更新数据表" + table_name
											+ "完成");
									// 关闭连接
								} catch (SQLException e) {
									e.printStackTrace();
									System.exit(0);
								}
							}
						} // while(rs.next()) 结束
					}
				}// if(table_name.equals(alltable[kk])) 结束
			} // while(rs_table.next()) 结束
			stmtTF.close();// 关闭命令对象连接
			conlocal.close();// 关闭数据库连接
			System.out.println("读取完毕");
			// 关闭连接
			stmt.close();// 关闭命令对象连接
			con.close();// 关闭数据库连接
			return SUCCESS;
		} catch (SQLException e) {
			e.printStackTrace();
	
		}// try...catch 结束
		return ERROR;
	}
	
	public static String  bkData(String path,String db_name,Connection conn)
    {
        String bk_name = ""; //要返回的备份名称
        //盘名是否正确
        if(path.lastIndexOf("\\") == -1) path += "\\";
        //------------------------
        // 与数据库进行操作
        //------------------------
        PreparedStatement stmt = null;
        String sql = "";
        try
        {
            String file = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date())+".bak";
            sql = "backup database "+db_name+" to disk='"+path+file+"' with format,name='full backup of "+db_name+"'";
            stmt = conn.prepareStatement(sql);
            stmt.executeUpdate();
            bk_name = file; //返回的文件名
        }
        //异常
        catch(Exception e)
        {
            e.printStackTrace();
        }
        //状态集释放
        finally
        {
            try{stmt.close();} catch(Exception e){}
        }
        //返回
        return bk_name;
    }

}
