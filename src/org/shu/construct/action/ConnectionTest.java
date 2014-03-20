package org.shu.construct.action;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.tool.CommonParam;

import common.base.action.BaseAction;

public class ConnectionTest extends BaseAction{

	public String synch() {
		// TODO Auto-generated method stub
		String[] alltable={"RFID_COMBINE","SHIELD_PROCESS","SYNCHRONOUS_GROUT","SHIELD_POSE","WATER_PROOF","BOLT_QUALITY"};
		/** 加载数据库引擎 **/
		String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";// SQL数据库引擎
		CommonParam cp=new CommonParam();
		String connectDB = cp.getString("Remote_DB"); // 数据源注意IP地址和端口号，数据库名字！！！
		String connectLC = cp.getString("Server_DB");
		try {
			Class.forName(JDriver);// 加载数据库引擎，返回给定字符串名的类
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
			System.out.println("加载数据库引擎失败");
			System.exit(0);
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
			/**对每个表进行更新**/
			while (rs_table.next()) {
				String table_name = rs_table.getString(3);
//				System.out.println(table_name);
				/** 连接表 **/
				
				for(int kk=0;kk<alltable.length;kk++)
				{
				
				if(table_name.equals(alltable[kk]))
				{
					String status="";
					if(table_name.equals("RFID_COMBINE"))
					{
						status="";
					}
					if(table_name.equals("SHIELD_PROCESS"))
					{
						status="";
					}
					if(table_name.equals("SYNCHRONOUS_GROUT"))
					{
						status="";
					}
					if(table_name.equals("SHIELD_POSE"))
					{
						status="";
					}
					if(table_name.equals("WATER_PROOF"))
					{
						status="";
					}
					if(table_name.equals("BOLT_QUALITY"))
					{
						status="";
					}
				System.out.println("开始更新数据表："+alltable[kk]);
//				stmtTF.executeUpdate("DELETE FROM "+table_name);
				System.out.println("开始读取服务器数据库");
				ResultSet rs=stmt.executeQuery("SELECT * FROM "+table_name+"WHERE "+status+" = 1");
				rsmd = rs.getMetaData(); // 获取表的字段名
				int column_count = rsmd.getColumnCount();
				List column_array = new ArrayList();
				for (int i = 0; i < column_count; i++) {
					column_array.add(rsmd.getColumnName(i + 1));
				}
				/** 创建SQL语句 **/
				while (rs.next()) {
					sql="INSERT INTO "+table_name+"(";
					for (int j = 1; j < column_array.size(); j++) {
						value[j] = rs.getString((String) column_array.get(j));
						if (j != column_array.size() - 1)
							sql = sql + (String) column_array.get(j) + ",";
						else
							sql = sql + (String) column_array.get(j) + ")";
					}
//					System.out.println(sql);
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
					System.out.println(sql);
					try {
						// 创建表
						System.out.println("开始更新数据");
						stmtTF.executeUpdate(sql);// 返回SQL语句查询结果集(集合)
						System.out.println("更新数据表"+table_name+"完成");
						// 关闭连接
					} catch (SQLException e) {
						e.printStackTrace();
						System.exit(0);
					}
				} // while(rs.next()) 结束
				}//if(table_name.equals(alltable[kk])) 结束
				}	
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
			return ERROR;
		}// try...catch 结束
	}
	
}
