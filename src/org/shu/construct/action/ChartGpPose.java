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

public class ChartGpPose extends BaseAction {
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
		chart = ChartFactory.createLineChart("管片姿态高程曲线", // chart
															// title
				"环号", // domain axis label
				"管片姿态高程", // range axis label
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
		ValueAxis rangeAxis = plot.getRangeAxis();
		// rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
		// rangeAxis.setAutoRangeIncludesZero(true);
		// rangeAxis.setUpperMargin(0.20);
		// rangeAxis.setLabelAngle(Math.PI / 2.0);
		Font font1 = new Font("SimSun", 10, 20); // 设定字体、类型、字号
		chart.getTitle().setFont(font1);
		Font font3 = new Font("SimSun", 10, 12); // 设定字体、类型、字号
		chart.getLegend().setItemFont(font3);// 最下方
		return SUCCESS;
	}
	public String chartPingMian() throws IOException {
		// 定义图表对象
		DefaultCategoryDataset linedataset = createDatasetPingMian();
		chart = ChartFactory.createLineChart("管片姿态平面曲线", // chart
															// title
				"环号", // domain axis label
				"管片姿态平面", // range axis label
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
		ValueAxis rangeAxis = plot.getRangeAxis();
		// rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
		// rangeAxis.setAutoRangeIncludesZero(true);
		// rangeAxis.setUpperMargin(0.20);
		// rangeAxis.setLabelAngle(Math.PI / 2.0);
		Font font1 = new Font("SimSun", 10, 20); // 设定字体、类型、字号
		chart.getTitle().setFont(font1);
		Font font3 = new Font("SimSun", 10, 12); // 设定字体、类型、字号
		chart.getLegend().setItemFont(font3);// 最下方
		return SUCCESS;
	}
	public DefaultCategoryDataset createDataset() {
		int startLoop = Integer.valueOf(request.getParameter("startLoop"));
		int endLoop = Integer.valueOf(request.getParameter("endLoop"));
		int isEast = Integer.valueOf(request.getParameter("isEast"));
		ArrayList<ShieldPose> list = poseService.getByBetweenLoopsAndIsEast(startLoop, endLoop, isEast);
		DefaultCategoryDataset linedataset = new DefaultCategoryDataset();
		String series1 = "管片姿态高程";
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getGpVertical() != null
					&& !list.get(i).getGpVertical().equals("")
					&& list.get(i).getTunnelLoop() != null) {
				linedataset.addValue(
						Double.parseDouble(list.get(i).getGpVertical()),
						series1, list.get(i).getTunnelLoop() + "");
			}
		}
		return linedataset;
	}
	public DefaultCategoryDataset createDatasetPingMian() {
		int startLoop = Integer.valueOf(request.getParameter("startLoop"));
		int endLoop = Integer.valueOf(request.getParameter("endLoop"));
		int isEast = Integer.valueOf(request.getParameter("isEast"));
		ArrayList<ShieldPose> list = poseService.getByBetweenLoopsAndIsEast(startLoop, endLoop, isEast);
		DefaultCategoryDataset linedataset = new DefaultCategoryDataset();
		String series1 = "管片姿态平面";
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getGpPlane() != null
					&& !list.get(i).getGpPlane().equals("")
					&& list.get(i).getTunnelLoop() != null) {
				linedataset.addValue(
						Double.parseDouble(list.get(i).getGpPlane()),
						series1, list.get(i).getTunnelLoop() + "");
			}
		}
		return linedataset;
	}
}