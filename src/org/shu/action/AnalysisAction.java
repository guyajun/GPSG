package org.shu.action;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.shu.common.service.CheckService;
import org.shu.model.ConcResistComp;
import org.shu.model.ReportPdfMapping;
import org.shu.service.imp.ConcResistCompService;
import org.tool.MyMath;

import com.opensymphony.xwork2.ActionContext;

import common.base.action.BaseAction;

public class AnalysisAction extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 979205628302783434L;

	protected ConcResistCompService concResistCompService;
	protected CheckService checkService;
	private ReportPdfMapping reportPdfMapping;

	String beginDate;
	String endDate;
	String reportid;

	
	public void setCheckService(CheckService checkService) {
		this.checkService = checkService;
	}
	public void setConcResistCompService(
			ConcResistCompService concResistCompService) {
		this.concResistCompService = concResistCompService;
	}

	public void setReportid(String reportid) {
		this.reportid = reportid;
	}
	public void setReportPdfMapping(ReportPdfMapping reportPdfMapping) {
		this.reportPdfMapping = reportPdfMapping;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String execute() throws Exception {
		String start_date = String.valueOf(request.getParameter("beginDate"));
		String end_date = String.valueOf(request.getParameter("endDate"));
		if (start_date.length() > 0 && end_date.length() > 0 && !start_date.equals("null") && !end_date.equals("null")) {
			List<ConcResistComp> list = concResistCompService.getComcResist(
					start_date, end_date);

			DecimalFormat df = new DecimalFormat("#.0");
			ArrayList<String> value_all = new ArrayList<String>();
			for (int i = 0; i < list.size(); i++) {
				String comp_value = list.get(i).getResistCompValue();
				String[] values = comp_value.split("@");
				List<String> values_list = Arrays.asList(values);
				value_all.addAll(values_list); // ������еĻ�������ѹ �Կ�ǿ�ȴ���ֵ
			}
			int N = value_all.size(); // ����
			double lam1 = 0.0;
			double lam2 = 0.0;
			double fcu_average = 0.0;
			double fcu_sdiviation = 0.0;
			double fcu_min = 0.0;
			double fcu_standard = 60; // ��׼ֵ
			if (N >= 10) {
				/** �ϸ��ж�ϵ�� **/

				if (N >= 10 && N <= 14) {
					lam1 = 1.15;
					lam2 = 0.90;
				}
				if (N >= 15 && N <= 19) {
					lam1 = 1.05;
					lam2 = 0.85;
				}
				if (N >= 20) {
					lam1 = 0.95;
					lam2 = 0.85;
				}
				/** ��׼ֵ��ƽ��ֵ����Сֵ����׼�� **/
				double sum = 0.0;
				double[] temp_value = new double[value_all.size()];
				fcu_min = Double.parseDouble(value_all.get(0).toString());
				for (int j = 0; j < value_all.size(); j++) {
					double temp = Double.parseDouble(value_all.get(j)
							.toString());
					if (temp < fcu_min) {
						fcu_min = temp; // ��Сֵ
					}
					sum += temp;
					temp_value[j] = temp;
				}
				fcu_average = Double.parseDouble(df.format((double) (sum / N))); // ƽ��ֵ

				fcu_sdiviation = Double.parseDouble(df.format(MyMath
						.getStandardDiviation(temp_value))); // ��׼��
				int type=-1;
				if (fcu_average >= (fcu_standard + lam1 * fcu_sdiviation)
						&& fcu_min >= (lam2 * fcu_sdiviation)) {
					type=1;
				}
				/**
				 * **/
				
				String[] dates=start_date.split("/");
				String year=dates[2];
				String month="00"+dates[0];
				
				month=month.substring(month.length()-2);
				String day="00"+dates[1];
				day=day.substring(day.length()-2);
				String start_date_1=year+month+day;
				 dates=end_date.split("/");
				 year=dates[2];
				 month="00"+dates[0];
				month=month.substring(month.length()-2);
				 day="00"+dates[1];
				day=day.substring(day.length()-2);
				String end_date_1=year+month+day;
				String pdf_code=start_date_1+"-"+end_date_1;			
				String path="/concevaluate/"+pdf_code+".pdf";
				/** ����pdf **/
				String status = concResistCompService.createPDF(start_date,
						end_date, N, fcu_standard, fcu_average, fcu_min,
						fcu_sdiviation, value_all, lam1, lam2,pdf_code);
				/** ����pdf���� **/
				
				/**���浽���ݿ�**/
				ReportPdfMapping rpm_find=checkService.find(pdf_code);
				if(rpm_find==null)
				{
				ReportPdfMapping rpm1=new ReportPdfMapping();
				rpm1.setProId(type);
				rpm1.setReportId(pdf_code);
				rpm1.setPdfLocation(path);
				rpm1.setMark("30");
				
				checkService.savePdf(rpm1);	
				}else
				{
					rpm_find.setProId(type);
					rpm_find.setPdfLocation(path);
					rpm_find.setMark("30");
					checkService.updatePdf(rpm_find);
				}
				
				request.setAttribute("beginDate", start_date);
				request.setAttribute("endDate", end_date);
				/**�������ݿ����**/
				
				if (status.equals("PDFERROR")) {
					return "PDFERROR";
				} else {
					return SUCCESS;
				}

			}//if(N>10)����	
			return "COUNT";
		}
		return ERROR;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String testEvaluate()
	{
		List pdfsearch = new ArrayList();
		String reportId = String.valueOf(request.getParameter("reportid"));
		if (reportId.equals("null")) {
			pdfsearch = checkService.pdfsearch();
		} else {
			pdfsearch = checkService.pdfsearch(reportId);
		}
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("pdfsearch", pdfsearch);
		return SUCCESS;
	}

}
