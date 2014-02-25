package org.shu.construct.action;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;
import org.tool.Pager;
import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;

public class ProduceGP extends BaseAction{
	private static final long serialVersionUID = 1L;
	private Integer pageNow=1;	
	private Integer loop;	
	public Integer getLoop() {
		return loop;
	}
	public void setLoop(Integer loop) {
		this.loop = loop;
	}
	public Integer getPageNow() {
		return pageNow;
	}
	public void setPageNow(Integer pageNow) {
		this.pageNow = pageNow;
	}
	
	public String getByLoop() {
		Pager pager = new Pager(pageNow, getByLoop1(loop).size());
		ArrayList<ShengChanGpTotalInfo> list = getOnePageByLoop(pageNow,pager.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");
		if(list.size()==0){
			pager.setPageNow(0);
		}
		request.put("pager", pager);
		request.put("list", list);
		return SUCCESS;
	}
	public String getList() {
		Pager pager = new Pager(pageNow, getAll().size());
		ArrayList<ShengChanGpTotalInfo> list = getOnePage(pageNow,pager.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");
		if(list.size()==0){
			pager.setPageNow(0);
		}
		request.put("pager", pager);
		request.put("list", list);
		return SUCCESS;
	}
	public ArrayList<ShengChanGpTotalInfo> getOnePage(int pageNow, int pageSize) {
		ArrayList<ShengChanGpTotalInfo> list = (ArrayList<ShengChanGpTotalInfo>) getAll();
		ArrayList<ShengChanGpTotalInfo> list1 = new ArrayList<ShengChanGpTotalInfo>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < list.size()) {
				list1.add(list.get(i));
			} else {
				break;
			}
		}
		return list1;
	}
	public ArrayList<ShengChanGpTotalInfo> getOnePageByLoop(int pageNow, int pageSize) {
		ArrayList<ShengChanGpTotalInfo> list = (ArrayList<ShengChanGpTotalInfo>) getByLoop1(loop);
		ArrayList<ShengChanGpTotalInfo> list1 = new ArrayList<ShengChanGpTotalInfo>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < list.size()) {
				list1.add(list.get(i));
			} else {
				break;
			}
		}
		return list1;
	}
	public ArrayList<ShengChanGpTotalInfo> getBySql(String sql) {
		ArrayList<ShengChanGpTotalInfo> list = new ArrayList<ShengChanGpTotalInfo>();
		ShengChanGpTotalInfo gpTotalInfo = new ShengChanGpTotalInfo();
		ParamAction param = new ParamAction();
		Field[] fields = gpTotalInfo.getClass().getDeclaredFields();
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver")
					.newInstance();
			Connection con = DriverManager.getConnection(
					"jdbc:sqlserver://localhost:1433;databaseName=GP0711",
					"sa", "ZBF917ZGB919cs");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				ShengChanGpTotalInfo gp = new ShengChanGpTotalInfo();
				for (int i = 0; i < fields.length; i++) {
					Method method = gp.getClass().getDeclaredMethod(
							"set" + param.upInitial(fields[i].getName()),
							fields[i].getType());
					method.invoke(gp, rs.getObject(i + 1));
				}
				list.add(gp);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<ShengChanGpTotalInfo> getByLoop1(int loop) {
		ArrayList<ShengChanGpTotalInfo> list =getBySql("select * from GP_TOTAL_INFO where PRODUCE_LOOP="+loop);
		return list;
	}
	public ArrayList<ShengChanGpTotalInfo> getByGpId(String gpId) {
		ArrayList<ShengChanGpTotalInfo> list =getBySql("select * from GP_TOTAL_INFO where GP_ID="+gpId);
		return list;
	}

	public ArrayList<ShengChanGpTotalInfo> getAll() {
		ArrayList<ShengChanGpTotalInfo> list =getBySql("select * from GP_TOTAL_INFO");
		return list;
	}
}
