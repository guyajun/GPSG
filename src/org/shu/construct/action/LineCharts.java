package org.shu.construct.action;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class LineCharts extends ApplicationFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LineCharts(String s) {
		super(s);
		setContentPane(createDemoLine());
	}

	public static void main(String[] args) {
		LineCharts fjc = new LineCharts("zhexiantu here");
		fjc.pack();
		RefineryUtilities.centerFrameOnScreen(fjc);
		fjc.setVisible(true);

	}

	// 生成显示图表的面板
	public static JPanel createDemoLine() {
		JFreeChart jfreechart = createChart(createDataset());
		return new ChartPanel(jfreechart);
	}

	// 生成图表主对象JFreeChart
	public static JFreeChart createChart(DefaultCategoryDataset linedataset) {
		// 定义图表对象
		JFreeChart chart = ChartFactory.createLineChart("zhexiantu", // chart
																		// title
				"shijian", // domain axis label
				"xiaoshoue(baiwan)", // range axis label
				linedataset, // data
				PlotOrientation.VERTICAL, // orientation取向
				true, // include legend图例
				true, // tooltips
				false // urls
				);
		CategoryPlot plot = chart.getCategoryPlot();
		// customise the range axis...
		NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
		rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
		rangeAxis.setAutoRangeIncludesZero(true);
		rangeAxis.setUpperMargin(0.20);
		rangeAxis.setLabelAngle(Math.PI / 2.0);

		return chart;
	}

	// 生成数据
	public static DefaultCategoryDataset createDataset() {
		DefaultCategoryDataset linedataset = new DefaultCategoryDataset();
		// 各曲线名称
		String series1 = "bingxiang";
		String series2 = "caidian";
		String series3 = "xiyiji";

		// 横轴名称(列名称)
		String type1 = "1yue";
		String type2 = "2yue";
		String type3 = "3yue";

		linedataset.addValue(0.0, series1, type1);// 纵轴坐标值，类型，横轴坐标值
		linedataset.addValue(4.2, series1, type2);
		linedataset.addValue(3.9, series1, type3);

		linedataset.addValue(1.0, series2, type1);
		linedataset.addValue(5.2, series2, type2);
		linedataset.addValue(7.9, series2, type3);

		linedataset.addValue(2.0, series3, type1);
		linedataset.addValue(9.2, series3, type2);
		linedataset.addValue(8.9, series3, type3);

		return linedataset;
	}

}