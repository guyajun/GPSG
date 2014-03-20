package org.shu.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.tool.CommonParam;

import common.base.action.BaseAction;

public class Gptotal  extends BaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public String gptotal(){
		CommonParam cp=new CommonParam();
		String gp_id = "";
		String report_id = "";
		List<String> gp_list = new ArrayList<String>();
		List<String> report_list = new ArrayList<String>();
		String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";// SQL数据库引擎?
		String connectDB = cp.getString("GP_Total_DB"); 
		try {
			Class.forName(JDriver);// 加载数据库引擎，返回给定字符串名的类
		} catch (ClassNotFoundException e) {
			System.out.println("加载数据库引擎失败");
		}
		System.out.println("数据库驱动成功");

		try {
			String user = "aa";// 你自己创建的用户名字和密码！！！！！！！！！！！
			String password = "aa";
			Connection con = DriverManager.getConnection(connectDB, user,
					password);// 连接数据库对象
			System.out.println("连接服务器数据库成功");
			Statement stmt = con.createStatement();// 创建SQL命令对象
			Statement stmt2 = con.createStatement();
			Statement stmt3 = con.createStatement();
			/** 获取管片编号 **/
			ResultSet rs_total=stmt.executeQuery("SELECT * FROM GP_TOTAL_INFO");
			while(rs_total.next())
			{
				String gp_total_id=rs_total.getString("GP_ID");
				gp_list.add(gp_total_id);
			}

			/** 对每个管片编号进行数据库全生命周期表的更新 */

			for (int i = 0; i < gp_list.size(); i++) {
				
		

				gp_id = gp_list.get(i).toString();

				String loop_num = gp_list.get(i).toString().substring(8, gp_id.length()-2); // 环号
				String use_date = gp_list.get(i).toString().substring(0, 8); // 管片生产日期
				String modle_num=gp_list.get(i).toString().substring(gp_id.length()-1);

				int loop = Integer.parseInt(loop_num); // 环数

				String steel_one = "", steel_two = "", steel_three = "", steel_four = "", report_five = "", report_six = "", report_seven = "", report_eight = "", report_nine = "", report_ten = "";

				/** 钢筋加工、钢筋骨架制作、钢模质量检查、管片外观和尺寸 **/
				report_list.clear();
				ResultSet rs2 = stmt
						.executeQuery("select * from four_table_same_part where Start_num <= "
								+ loop + " and End_num >= " + loop);
				while (rs2.next()) {
					
					report_id = rs2.getString("Report_id");

					report_list.add(report_id);
				}
				
				for (int j = 0; j < report_list.size(); j++) {
					ResultSet rs_pdf = stmt
							.executeQuery("SELECT * from report_pdf_mapping where Report_ID = '"
									+ report_list.get(j)+"'");
					while (rs_pdf.next()) {
						String report_mark = rs_pdf.getString("mark");
						String pdf_loaction = rs_pdf.getString("Pdf_location");
						Integer mark = Integer.valueOf(report_mark);
						try {
							switch (mark) {
							case 1:
								steel_one = pdf_loaction;
								break;
							case 2:
								steel_two = pdf_loaction;
								break;
							case 3:
								steel_three = pdf_loaction;
								break;
							case 4:
								steel_four = pdf_loaction;
								break;
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						}
					}
				}
				System.out.println("four_table_same_part 查找完成");

				/** 混凝土浇注 */
				ResultSet rs6 = stmt.executeQuery("select * from CONC_POUR where Start_num <= "+ loop + " and End_num >= " + loop);
				while (rs6.next()) {
					String conc_pour_id = rs6.getString("Report_ID");
					

					ResultSet rs_conc = stmt3
							.executeQuery("SELECT * from report_pdf_mapping where Report_ID = '"
									+ conc_pour_id + "' and mark=10");
					while (rs_conc.next()) {
						report_seven = rs_conc.getString("Pdf_location");
					}
				}
				System.out.println("混凝土浇注  查找完成");

				/** 管片水养  **/
				ResultSet rs7 = stmt
						.executeQuery("select * from GP_WATER_CURING where Start_num <= "+loop+" and End_num >= "+loop);
				while (rs7.next()) {
					String water_id = rs7.getString("Report_ID");
					ResultSet  water_cur=stmt3.executeQuery("SELECT * from report_pdf_mapping where Report_ID = '"
									+ water_id + "' and mark=6");
					while(water_cur.next())
					{
						report_eight=water_cur.getString("Pdf_location");
					}
				}
				System.out.println("管片水养  查找完成");

				/** 水平拼装 **/
				ResultSet rs8 = stmt
						.executeQuery("select * from GP_ASSEMBLE where Start_num <= "
								+ loop + " and End_num >= " + loop);
				while (rs8.next()) {
					String gp_assemble_id = rs8.getString("Report_ID");
					ResultSet gp_ass = stmt3
							.executeQuery("SELECT * from report_pdf_mapping where Report_ID = '"
									+ gp_assemble_id + "' and mark=11");
					while (gp_ass.next()) {
						report_nine = gp_ass.getString("Pdf_location");
					}
				}
				System.out.println("水平拼装  查找完成");

				/** 管片检漏 **/
				ResultSet rs9 = stmt
						.executeQuery("select * from GP_CHECK_LEAK where Start_num <= "
								+ loop + " and End_num >= " + loop);
				while (rs9.next()) {
					String gp_check_id = rs9.getString("Report_ID");

					ResultSet gp_checkleak = stmt3.executeQuery("SELECT * from report_pdf_mapping where Report_ID = '"+ gp_check_id + "' and mark=9");
					while (gp_checkleak.next()) {
						report_ten = gp_checkleak.getString("Pdf_location");
					}
				}
				System.out.println("管片检漏  查找完成");

				 /**钢筋骨架半成品抽查*/
				 ResultSet
				 rs4=stmt.executeQuery("select * from STEEL_SKEL_HALF where Start_num <= "+loop+" and End_num >= "+loop);//report_pdf_mapping where mark = 7");
				 while(rs4.next())
				 {
					 String skel_half_id=rs4.getString("Report_ID");
					 ResultSet steel_skel_half=stmt3.executeQuery("SELECT * from report_pdf_mapping where Report_ID = '"+skel_half_id+"' and mark=7");
					 while(steel_skel_half.next())
					 {
						 report_five=steel_skel_half.getString("Pdf_location");
					 }
				 }
				 /**管片蒸养**/
				 ResultSet
				 rs5=stmt.executeQuery("select * from GP_STEAM_CURING where Start_num <= "+loop+" and End_num >= "+loop);//where mark = 5");
				 while(rs5.next())
				 {
					 String steamcuring=rs5.getString("Report_ID");
					ResultSet steam_curing=stmt3.executeQuery("SELECT * from report_pdf_mapping where Report_ID = '"+steamcuring+"' and mark=5");
					while(steam_curing.next())
					{
						report_six=steam_curing.getString("Pdf_location");
					}
				 }
				/** 混凝土抗压报告 */
//				String report_kangya = "";
//				ResultSet rs_kangya = stmt
//						.executeQuery("select * from CONC_RESIST_COMP");
//				while (rs_kangya.next()) {
//					String report_time = rs_kangya.getString("DATE").replaceAll("-", "");
//					if (use_date.equals(report_time)) {
//						report_kangya = rs_kangya.getString("URL");
//					}
//				}
//				System.out.println("混凝土抗压  查找完成");
				/** 混凝土抗渗报告 */
				String report_kangshen = "";
				ResultSet rs_kangshen = stmt
						.executeQuery("select * from CONC_RESIST_LEAK");
				while (rs_kangshen.next()) {
					String report_time = rs_kangshen.getString("DATE").replaceAll("-", "");
					if (use_date.equals(report_time)) {
						report_kangshen = rs_kangshen.getString("URL");
					}
				}
				System.out.println("混凝土抗渗  查找完成");
				/**管片起吊 */
				String report_crane="";
				ResultSet gp_crane=stmt.executeQuery("select * from GP_CRANE");
				while(gp_crane.next())
				{
					String gp_crane_id=gp_crane.getString("Report_ID");
					if(gp_crane_id.length()<9)
					{
						continue;
					}
					String gp_crane_id_date=gp_crane_id.substring(0,8);
					String gp_crane_id_model=gp_crane_id.substring(9);
				
					if(use_date.equals(gp_crane_id_date) && modle_num.equals(gp_crane_id_model))
					{
						report_crane=gp_crane.getString("CRANE_STRENGTH");
					}
				}
				System.out.println("管片起吊  查找完成");
				
				/**  **/

				String sql = "update GP_TOTAL_INFO SET PRODUCE_LOOP = '"+ loop 
						+ "',STEEL_PROCESS_REPORT_ID = '" + steel_one
						+ "',STEEL_SKEL_QUAL_REPORT_ID = '" + steel_two
						+ "',MOLD_QUAL_REPORT_ID = '" + steel_three
						+ "',GP_APPE_SIZE_REPORT_ID = '" + steel_four
						+ "',STEEL_SKEL_HALF_REPORT_ID = '" + report_five
						+ "',GP_STEAM_CURING_ID = '" + report_six
						+ "',CONC_POUR_REPORT_ID = '" + report_seven
						+ "',WATER_CURING_REPORT_ID = '" + report_eight
						+ "',ASSEM_REPORT_ID = '" + report_nine
						+ "',CHECK_LEAK_REPORT_ID = '" + report_ten
						+ "',GP_CRANE_ID = '" + report_crane
						+ "',CONC_RESIST_LEAK_ID = '" + report_kangshen
						+ "' where GP_ID = '" + gp_id + "'";
				stmt2.executeUpdate(sql);
				System.out.println("======记录："+(i+1)+"更新完成=======");
			}
			return SUCCESS;
		} catch (SQLException e) {
			e.printStackTrace();
		}// try...catch 结束
		return ERROR;
	}
}
