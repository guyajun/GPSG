package org.shu.construct.action;

import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.shu.construct.service.PoseService;
import org.shu.model.ShieldPose;

import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;

public class LineChartShieldPose extends BaseAction {
	private static final long serialVersionUID = 1L;
	private PoseService poseService;
	private JFreeChart chart;

	public JFreeChart getChart() {
		return chart;
	}

	public void setChart(JFreeChart chart) {
		this.chart = chart;
	}

	public void setPoseService(PoseService poseService) {
		this.poseService = poseService;
	}

	public String chart() throws IOException {
		// 定义图表对象
		DefaultCategoryDataset linedataset = createDataset();
		chart = ChartFactory.createLineChart("盾构姿态曲线图", // chart
														// title
				"环号", // domain axis label
				"盾构姿态", // range axis label
				linedataset, // data
				PlotOrientation.VERTICAL, // orientation取向
				true, // include legend图例
				true, // tooltips
				false // urls
				);
		CategoryPlot plot = chart.getCategoryPlot();
		Font font2 = new Font("SimSun", 10, 16); // 设定字体、类型、字号
		plot.getDomainAxis().setLabelFont(font2);// 相当于横轴或理解为X轴
		plot.getRangeAxis().setLabelFont(font2);// 相当于竖轴理解为Y轴
		// customise the range axis...
		NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
		 rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
		 rangeAxis.setAutoRangeIncludesZero(true);
		// rangeAxis.setUpperMargin(0.20);
		// rangeAxis.setLabelAngle(Math.PI / 2.0);
		Font font1 = new Font("SimSun", 10, 20); // 设定字体、类型、字号
		chart.getTitle().setFont(font1);
		Font font3 = new Font("SimSun", 10, 12); // 设定字体、类型、字号
		chart.getLegend().setItemFont(font3);// 最下方
		return SUCCESS;
	}

	public String temp() {
		String startLoop = request.getParameter("gpHighStartLoop");
		String endLoop = request.getParameter("gpHighEndLoop");
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("startLoop", startLoop);
		request.put("endLoop", endLoop);
		return SUCCESS;
	}
	public String temp1() {
		String startLoop = request.getParameter("startLoop");
		String endLoop = request.getParameter("endLoop");
		String checks = request.getParameter("checked");
		System.out.println("checked="+checks);
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("aa", checks);
		request.put("startLoop", startLoop);
		request.put("endLoop", endLoop);
		return SUCCESS;
	}

	public DefaultCategoryDataset createDataset() {
		int startLoop = Integer.valueOf(request.getParameter("startLoop"));
		int endLoop = Integer.valueOf(request.getParameter("endLoop"));
		int isEast = Integer.valueOf(request.getParameter("isEast"));
		String checked = request.getParameter("checked");
		System.out.println("checked="+checked);
		String[] checks = checked.split("2");
		System.out.println("checks.length="+checks.length);
		ArrayList<ShieldPose> list = poseService.getByBetweenLoopsAndIsEast(startLoop, endLoop, isEast);
		String series1 = "切口高程偏差";
		String series2 = "切口平面偏差";
		String series3 = "盾尾高程偏差";
		String series4 = "盾尾平面偏差";
		DefaultCategoryDataset linedataset = new DefaultCategoryDataset();
		for (int i = 0; i < checks.length; i++) {
			System.out.println("checks[i]="+checks[i]);
			if (checks[i].equals("qiekougaocheng")) {
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).getShieldVerticalTwo() != null
							&& !list.get(j).getShieldVerticalTwo().equals("")
							&& list.get(j).getTunnelLoop() != null) {
						linedataset.addValue(
								Integer.parseInt(list.get(j)
										.getShieldVerticalTwo().split("@")[0]),
								series1, list.get(j).getTunnelLoop() + "");
					}
				}
			} else if (checks[i].equals("qiekoupingmian")) {
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).getShieldPlaneTwo() != null
							&& !list.get(j).getShieldPlaneTwo().equals("")
							&& list.get(j).getTunnelLoop() != null) {
						linedataset.addValue(
								Integer.parseInt(list.get(j)
										.getShieldPlaneTwo().split("@")[0]),
								series2, list.get(j).getTunnelLoop() + "");
					}
				}
			} else if (checks[i].equals("dunweigaocheng")) {
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).getShieldVerticalTwo() != null
							&& !list.get(j).getShieldVerticalTwo().equals("")
							&& list.get(j).getTunnelLoop() != null) {
						linedataset.addValue(
								Integer.parseInt(list.get(j)
										.getShieldVerticalTwo().split("@")[1]),
								series3, list.get(j).getTunnelLoop() + "");
					}
				}
			} else if (checks[i].equals("dunweipingmian")) {
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).getShieldPlaneTwo() != null
							&& !list.get(j).getShieldPlaneTwo().equals("")
							&& list.get(j).getTunnelLoop() != null) {
						linedataset.addValue(
								Integer.parseInt(list.get(j)
										.getShieldPlaneTwo().split("@")[1]),
								series4, list.get(j).getTunnelLoop() + "");
					}
				}
			}
		}

		return linedataset;
	}
}