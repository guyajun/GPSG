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
import org.shu.construct.service.MonitorService;
import org.shu.model.GpGroundsettling;
import org.shu.model.GpSoilproperty;

import common.base.action.BaseAction;

public class MonitorChart extends BaseAction {
	private static final long serialVersionUID = 1L;
	private String date1;
	private String date2;
	private String number;	
	private MonitorService monitorService;	
	public void setMonitorService(MonitorService monitorService) {
		this.monitorService = monitorService;
	}
	public String getDate1() {
		return date1;
	}
	public void setDate1(String date1) {
		this.date1 = date1;
	}
	public String getDate2() {
		return date2;
	}
	public void setDate2(String date2) {
		this.date2 = date2;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTimeSeriesChart() throws Exception {
		System.out.println("here erin");
		XYDataset xydataset = createDataset();
		JFreeChart jfreechart = ChartFactory.createTimeSeriesChart(
				"测量值在该时间区间的变化曲线", "时间", "测量值", xydataset, true, true, true);
		XYPlot xyplot = (XYPlot) jfreechart.getPlot();
		DateAxis dateaxis = (DateAxis) xyplot.getDomainAxis();
		dateaxis.setDateFormatOverride(new SimpleDateFormat("yyyy-MM-dd"));
		dateaxis.setLabelFont(new Font("黑体", Font.BOLD, 14)); // 水平底部标题
		dateaxis.setTickLabelFont(new Font("宋体", Font.BOLD, 12)); // 垂直标题
		ValueAxis rangeAxis = xyplot.getRangeAxis();// 获取柱状
		rangeAxis.setLabelFont(new Font("黑体", Font.BOLD, 15));
		jfreechart.getLegend().setItemFont(new Font("黑体", Font.BOLD, 15));
		jfreechart.getTitle().setFont(new Font("宋体", Font.BOLD, 20));// 设置标题字体
		ChartUtilities.saveChartAsJPEG(new File("C:/Program Files/Apache Software Foundation/Tomcat 7.0/webapps/GP/monitor.jpg"), jfreechart, 3000,
				500);
		return SUCCESS;

	}

	public XYDataset createDataset() {
		ArrayList<GpGroundsettling> list = monitorService.getCountByBetweenDates(date1, date2, number);
		TimeSeries timeseries = new TimeSeries("测量值在该时间区间的变化曲线",
				org.jfree.data.time.Day.class);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getDcValue() == null) {
				timeseries.addOrUpdate(new Day(list.get(i).getDcTime()), 0.00);
			} else {
				timeseries.addOrUpdate(new Day(list.get(i).getDcTime()), list.get(i).getDcValue());
			}
		}
		TimeSeriesCollection timeseriescollection = new TimeSeriesCollection();
		timeseriescollection.addSeries(timeseries);
		return timeseriescollection;
	}
}