package org.shu.construct.action;

import java.awt.Font;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.shu.construct.service.SoilService;
import org.shu.model.GpSoilproperty;

import common.base.action.BaseAction;

public class TimeSeriesChart extends BaseAction {
	private static final long serialVersionUID = 1L;
	private SoilService soilService;

	public void setSoilService(SoilService soilService) {
		this.soilService = soilService;
	}

	public String getTimeSeriesChart() throws Exception {
		System.out.println("here erin");
		XYDataset xydataset = createDataset();
		JFreeChart jfreechart = ChartFactory.createTimeSeriesChart(
				"比重随时间的变化曲线", "时间", "比重", xydataset, true, true, true);
		XYPlot xyplot = (XYPlot) jfreechart.getPlot();
		DateAxis dateaxis = (DateAxis) xyplot.getDomainAxis();
		dateaxis.setDateFormatOverride(new SimpleDateFormat("yyyy-MM-dd"));
		dateaxis.setLabelFont(new Font("黑体", Font.BOLD, 14)); // 水平底部标题
		dateaxis.setTickLabelFont(new Font("宋体", Font.BOLD, 12)); // 垂直标题
		ValueAxis rangeAxis = xyplot.getRangeAxis();// 获取柱状
		rangeAxis.setLabelFont(new Font("黑体", Font.BOLD, 15));
		jfreechart.getLegend().setItemFont(new Font("黑体", Font.BOLD, 15));
		jfreechart.getTitle().setFont(new Font("宋体", Font.BOLD, 20));// 设置标题字体
		ChartUtilities.saveChartAsJPEG(new File("C:/Program Files/Apache Software Foundation/Tomcat 7.0/webapps/GP/md.jpg"), jfreechart, 3000,
				500);
		return SUCCESS;

	}

	public XYDataset createDataset() {
		ArrayList<GpSoilproperty> soilList = soilService.getAll();
		TimeSeries timeseries = new TimeSeries("比重的变化曲线",
				org.jfree.data.time.Day.class);
		Day day = new Day(1, 1, 2013);
		for (int i = 0; i < soilList.size(); i++) {
			if (soilList.get(i).getTcMd() == null) {
				timeseries.addOrUpdate(day, 0.00);
			} else {
				timeseries.addOrUpdate(day, soilList.get(i).getTcMd());
			}
			day = (Day) day.next();
		}
		TimeSeriesCollection timeseriescollection = new TimeSeriesCollection();
		timeseriescollection.addSeries(timeseries);
		return timeseriescollection;
	}
}