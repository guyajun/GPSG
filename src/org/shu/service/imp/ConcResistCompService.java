package org.shu.service.imp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.shu.dao.imp.ConcResistCompDao;
import org.shu.model.ConcResistComp;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class ConcResistCompService {
	private ConcResistCompDao concResistCompDao;

	public void setConcResistCompDao(ConcResistCompDao concResistCompDao) {
		this.concResistCompDao = concResistCompDao;
	}

	public void saveConcResistComp(ConcResistComp concResistComp) {
		concResistCompDao.saveConcResistComp(concResistComp);
	}

	public List getAll() {
		return concResistCompDao.getAll();

	}

	public List<ConcResistComp> getComcResist(String start_date, String end_date) {
		return concResistCompDao.getComcResist(start_date, end_date);

	}

	public String createPDF(String start_date, String end_date, int N,
			double fcu_standard, double fcu_average, double fcu_min,
			double fcu_sdiviation, List value_all,double lam1,double lam2,String pdf_code) throws DocumentException,
			IOException {
		String status = "SUCCESS";
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String date = df.format(new Date());
		Document document = new Document(PageSize.A4, 36, 36, 20, 20);
		try {
			PdfWriter
					.getInstance(document, new FileOutputStream("G:/apache/apache-tomcat-7.0.39/webapps/GP/uploadfile/concevaluate/"+pdf_code+".pdf"));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (DocumentException e1) {
			e1.printStackTrace();
		}
		BaseFont chinese = BaseFont.createFont("C:/windows/fonts/simsun.ttc,1",
				BaseFont.IDENTITY_H, BaseFont.EMBEDDED);

		Font font_normal = new Font(chinese, 11, Font.NORMAL);
		Font font_bold = new Font(chinese, 24, Font.BOLD);
		Font font_table = new Font(chinese, 12, Font.NORMAL);
		Font font_table_2 = new Font(chinese, 10, Font.NORMAL);
		Font font_table_count = new Font(chinese, 14, Font.NORMAL);

		document.addAuthor("ayumi");
		document.addTitle("混凝土抗压强度统计方法评定表");
		document.addSubject("抗压强度评定");
		document.addKeywords("抗压强度  评定");
		document.addCreator("iText");
		document.open();
		try {
			Paragraph Title = new Paragraph("混凝土抗压强度统计方法评定表", font_bold);
			Title.setAlignment(Paragraph.ALIGN_CENTER);
			document.add(Title);
			document.add(new Paragraph(" "));
			Paragraph note = new Paragraph(
					"本表适用于(GB/T5107-2010)规定的方差未知的统计检验评定，验收批试件数应不少于10组。其强度标准由本检验批次n组试块强度代表值计算确定",
					font_normal);
			document.add(note);
			document.add(new Paragraph(" "));

			PdfPTable table = new PdfPTable(10);
			table.setTotalWidth(520);
			table.setLockedWidth(true);

			table.addCell(new Paragraph("评定单位", font_table));
			// 定义一个表格单元
			PdfPCell cell_1 = new PdfPCell(new Paragraph("隧道构件分公司嘉松基地",
					font_table_2));
			// 定义一个表格单元的跨度
			cell_1.setColspan(3);
			// 把单元加到表格中
			table.addCell(cell_1);

			PdfPCell cell_2 = new PdfPCell(new Paragraph("工程名称", font_table));
			cell_2.setColspan(3);
			table.addCell(cell_2);

			PdfPCell cell_3 = new PdfPCell(new Paragraph("虹梅南路-金海路通道越江段新建工程",
					font_table_2));
			cell_3.setColspan(3);
			table.addCell(cell_3);

			table.addCell(new Paragraph("结构部位", font_table));
			table.addCell(new Paragraph("管片", font_table_2));

			PdfPCell cell_4 = new PdfPCell(new Paragraph("供应单位", font_table));
			cell_4.setColspan(2);
			table.addCell(cell_4);

			PdfPCell cell_5 = new PdfPCell(new Paragraph("嘉松基地", font_table_2));
			cell_5.setColspan(3);
			table.addCell(cell_5);

			PdfPCell cell_6 = new PdfPCell(new Paragraph("评定日期", font_table));
			cell_6.setRowspan(2);
			table.addCell(cell_6);
			cell_6.disableBorderSide(2);

			PdfPCell cell_7 = new PdfPCell(new Paragraph(date));
			cell_7.setRowspan(2);
			cell_7.setColspan(2);
			table.addCell(cell_7);
			cell_7.disableBorderSide(2);

			PdfPCell cell_temp1 = new PdfPCell(
					new Paragraph("水泥", font_table_2));
			table.addCell(cell_temp1);
			cell_temp1.setHorizontalAlignment(1);
			PdfPCell cell_temp2 = new PdfPCell(new Paragraph("水", font_table_2));
			table.addCell(cell_temp2);
			cell_temp2.setHorizontalAlignment(1);
			PdfPCell cell_temp3 = new PdfPCell(new Paragraph("细骨料",
					font_table_2));
			table.addCell(cell_temp3);
			cell_temp3.setHorizontalAlignment(1);
			PdfPCell cell_temp4 = new PdfPCell(new Paragraph("粗骨料",
					font_table_2));
			table.addCell(cell_temp4);
			cell_temp4.setHorizontalAlignment(1);
			PdfPCell cell_temp5 = new PdfPCell(new Paragraph("外加剂",
					font_table_2));
			table.addCell(cell_temp5);
			cell_temp5.setHorizontalAlignment(1);

			PdfPCell cell_temp6 = new PdfPCell(new Paragraph("掺合料",
					font_table_2));
			cell_temp6.setColspan(2);
			table.addCell(cell_temp6);
			cell_temp6.setHorizontalAlignment(1);

			PdfPCell cell_temp11 = new PdfPCell(new Paragraph("PII52.5级",
					font_table_2));
			table.addCell(cell_temp11);
			cell_temp11.setHorizontalAlignment(1);
			PdfPCell cell_temp12 = new PdfPCell(new Paragraph("饮用水",
					font_table_2));
			table.addCell(cell_temp12);
			cell_temp12.setHorizontalAlignment(1);
			PdfPCell cell_temp13 = new PdfPCell(new Paragraph("中砂",
					font_table_2));
			table.addCell(cell_temp13);
			cell_temp13.setHorizontalAlignment(1);
			PdfPCell cell_temp14 = new PdfPCell(new Paragraph("5-25mm",
					font_table_2));
			table.addCell(cell_temp14);
			cell_temp14.setHorizontalAlignment(1);
			PdfPCell cell_temp15 = new PdfPCell(new Paragraph("SPP",
					font_table_2));
			table.addCell(cell_temp15);
			cell_temp5.setHorizontalAlignment(1);
			PdfPCell cell_temp16 = new PdfPCell(new Paragraph("F.II",
					font_table_2));
			table.addCell(cell_temp16);
			cell_temp16.setHorizontalAlignment(1);
			PdfPCell cell_temp17 = new PdfPCell(new Paragraph("矿粉",
					font_table_2));
			table.addCell(cell_temp17);
			cell_temp17.setHorizontalAlignment(1);

			PdfPCell cell_temp18 = new PdfPCell(new Paragraph("本验收批从: " + start_date,
					font_table));
			cell_temp18.setColspan(3);
			table.addCell(cell_temp18);

			PdfPCell cell_temp111 = new PdfPCell(new Paragraph("250kg",
					font_table_2));
			table.addCell(cell_temp111);
			cell_temp111.setHorizontalAlignment(1);
			PdfPCell cell_temp121 = new PdfPCell(new Paragraph("145kg",
					font_table_2));
			table.addCell(cell_temp121);
			cell_temp121.setHorizontalAlignment(1);
			PdfPCell cell_temp131 = new PdfPCell(new Paragraph("663kg",
					font_table_2));
			table.addCell(cell_temp131);
			cell_temp131.setHorizontalAlignment(1);
			PdfPCell cell_temp141 = new PdfPCell(new Paragraph("1120kg",
					font_table_2));
			table.addCell(cell_temp141);
			cell_temp141.setHorizontalAlignment(1);
			PdfPCell cell_temp151 = new PdfPCell(new Paragraph("6.0kg",
					font_table_2));
			table.addCell(cell_temp151);
			cell_temp151.setHorizontalAlignment(1);
			PdfPCell cell_temp161 = new PdfPCell(new Paragraph("25kg",
					font_table_2));
			table.addCell(cell_temp161);
			cell_temp161.setHorizontalAlignment(1);
			PdfPCell cell_temp171 = new PdfPCell(new Paragraph("225kg",
					font_table_2));
			table.addCell(cell_temp171);
			cell_temp171.setHorizontalAlignment(1);

			PdfPCell cell_temp181 = new PdfPCell(new Paragraph("起止日期:   "
					+ end_date, font_table));
			cell_temp181.setColspan(3);
			table.addCell(cell_temp181);

			PdfPCell cell_a = new PdfPCell(new Paragraph("抗压强度等级", font_table));
			cell_a.setColspan(2);
			cell_a.setHorizontalAlignment(1);
			cell_a.setVerticalAlignment(1);
			table.addCell(cell_a);
			PdfPCell cell_b = new PdfPCell(new Paragraph("fcu,k = " + fcu_standard
					+ " Mpa", font_table));
			cell_b.setColspan(5);
			cell_b.setHorizontalAlignment(1);
			cell_b.setVerticalAlignment(1);
			table.addCell(cell_b);
			PdfPCell cell_c = new PdfPCell(new Paragraph("n = "+N+" 组",
					font_table));
			cell_c.setColspan(3);
			cell_c.setHorizontalAlignment(1);
			cell_c.setVerticalAlignment(1);
			table.addCell(cell_c);

			PdfPCell cell_a1 = new PdfPCell(new Paragraph("批强度平均值", font_table));
			cell_a1.setColspan(2);
			cell_a1.setHorizontalAlignment(1);
			cell_a1.setVerticalAlignment(1);
			table.addCell(cell_a1);
			PdfPCell cell_b1 = new PdfPCell(new Paragraph("mfcu = " + fcu_average
					+ " Mpa", font_table));
			cell_b1.setColspan(5);
			cell_b1.setHorizontalAlignment(1);
			cell_b1.setVerticalAlignment(1);
			table.addCell(cell_b1);
			PdfPCell cell_c1 = new PdfPCell(new Paragraph("合格判定系数", font_table));
			cell_c1.setColspan(3);
			cell_c1.setHorizontalAlignment(1);
			cell_c1.setVerticalAlignment(1);
			table.addCell(cell_c1);

			PdfPCell cell_a2 = new PdfPCell(new Paragraph("批强度最小值", font_table));
			cell_a2.setColspan(2);
			cell_a2.setRowspan(2);
			cell_a2.setHorizontalAlignment(1);
			cell_a2.setVerticalAlignment(1);
			table.addCell(cell_a2);
			PdfPCell cell_b2 = new PdfPCell(new Paragraph("fcu,min = " + fcu_min
					+ " Mpa", font_table));
			cell_b2.setColspan(5);
			cell_b2.setRowspan(2);
			cell_b2.setHorizontalAlignment(1);
			cell_b2.setVerticalAlignment(1);
			table.addCell(cell_b2);
			PdfPCell cell_c21 = new PdfPCell(new Paragraph("N", font_table_2));
			cell_c21.setHorizontalAlignment(1);
			cell_c21.setVerticalAlignment(1);
			table.addCell(cell_c21);
			PdfPCell cell_c22 = new PdfPCell(new Paragraph("λ1", font_table_2));
			cell_c22.setHorizontalAlignment(1);
			cell_c22.setVerticalAlignment(1);
			table.addCell(cell_c22);
			PdfPCell cell_c23 = new PdfPCell(new Paragraph("λ2", font_table_2));
			cell_c23.setHorizontalAlignment(1);
			cell_c23.setVerticalAlignment(1);
			table.addCell(cell_c23);

			PdfPCell cell_c211 = new PdfPCell(new Paragraph("10~14",
					font_table_2));
			cell_c211.setHorizontalAlignment(1);
			cell_c211.setVerticalAlignment(1);
			table.addCell(cell_c211);
			PdfPCell cell_c221 = new PdfPCell(new Paragraph("1.15",
					font_table_2));
			cell_c221.setHorizontalAlignment(1);
			cell_c221.setVerticalAlignment(1);
			table.addCell(cell_c221);
			PdfPCell cell_c231 = new PdfPCell(new Paragraph("0.90",
					font_table_2));
			cell_c231.setHorizontalAlignment(1);
			cell_c231.setVerticalAlignment(1);
			table.addCell(cell_c231);

			PdfPCell cell_m = new PdfPCell(new Paragraph("批强度标准差", font_table));
			cell_m.setColspan(2);
			cell_m.setRowspan(2);
			cell_m.setHorizontalAlignment(1);
			cell_m.setVerticalAlignment(1);
			table.addCell(cell_m);
			PdfPCell cell_n = new PdfPCell(new Paragraph("Sfcu = " + fcu_sdiviation
					+ " Mpa", font_table));
			cell_n.setColspan(5);
			cell_n.setRowspan(2);
			cell_n.setHorizontalAlignment(1);
			cell_n.setVerticalAlignment(1);
			table.addCell(cell_n);
			PdfPCell cell_l1 = new PdfPCell(
					new Paragraph("15~19", font_table_2));
			cell_l1.setHorizontalAlignment(1);
			cell_l1.setVerticalAlignment(1);
			table.addCell(cell_l1);
			PdfPCell cell_l2 = new PdfPCell(new Paragraph("1.05", font_table_2));
			cell_l2.setHorizontalAlignment(1);
			cell_l2.setVerticalAlignment(1);
			table.addCell(cell_l2);
			PdfPCell cell_l3 = new PdfPCell(new Paragraph("0.85", font_table_2));
			cell_l3.setHorizontalAlignment(1);
			cell_l3.setVerticalAlignment(1);
			table.addCell(cell_l3);

			PdfPCell cell_k1 = new PdfPCell(new Paragraph("≥20", font_table_2));
			cell_k1.setHorizontalAlignment(1);
			cell_k1.setVerticalAlignment(1);
			table.addCell(cell_k1);
			PdfPCell cell_k2 = new PdfPCell(new Paragraph("1.05", font_table_2));
			cell_k2.setHorizontalAlignment(1);
			cell_k2.setVerticalAlignment(1);
			table.addCell(cell_k2);
			PdfPCell cell_k3 = new PdfPCell(new Paragraph("0.85", font_table_2));
			cell_k3.setHorizontalAlignment(1);
			cell_k3.setVerticalAlignment(1);
			table.addCell(cell_k3);

			String str = "fcu,k本验收批内格组试块强度代表值 :\n\n";
			for(int i=1;i<=value_all.size();i++)
			{
				
				if(i%10==0)
				{
					str=str+value_all.get(i-1);
					str=str+"\n\n";
				}else
				{
					String s=value_all.get(i-1)+"      ";
					str=str+s.substring(0,7);
				}
			}
			PdfPCell cell_content = new PdfPCell(new Paragraph(str,
					font_table_count));
			cell_content.setColspan(10);
			table.addCell(cell_content);

			PdfPCell cell_conclu = new PdfPCell(new Paragraph("计算合格评定条件",
					font_table));
			cell_conclu.setHorizontalAlignment(1);
			cell_conclu.setVerticalAlignment(1);
			cell_conclu.setColspan(2);
			table.addCell(cell_conclu);
			String str_1 = "1.当Sfcu<2.5N/mm2, 取Sfcu=2.5N/mm2;\n\n2.mfcu≥fcu,k+λ1Sfcu\n\n3.fcu,min≥λ2fcu,k";
			PdfPCell cell_conclu2 = new PdfPCell(new Paragraph(str_1,
					font_table_2));
			cell_conclu2.setVerticalAlignment(1);
			cell_conclu2.setColspan(4);
			table.addCell(cell_conclu2);

			String str_2="评定条件计算结果\n";
			if(fcu_sdiviation<2.5)
			{
				str_2=str_2+"1.  "+fcu_sdiviation+" < 2.5, 取Sfcu=2.5N/mm2;\n\n";
				fcu_sdiviation=2.5;
			}else if(fcu_sdiviation == 2.5)
			{
				str_2=str_2+"1.  "+fcu_sdiviation+" = 2.5, 取Sfcu=2.5N/mm2;\n\n";
			}else
			{
				str_2=str_2+"1.  "+fcu_sdiviation+" > 2.5, 取Sfcu="+fcu_sdiviation+";\n\n";
			}
			
			if(fcu_average > (fcu_standard + lam1 * fcu_sdiviation))
			{
				str_2=str_2+"2.  "+fcu_average+ " > " +(fcu_standard + lam1 * fcu_sdiviation)+"\n\n";
			}else if(fcu_average == (fcu_standard + lam1 * fcu_sdiviation))
			{
				str_2=str_2+"2.  "+fcu_average+ " = " +(fcu_standard + lam1 * fcu_sdiviation)+"\n\n";
			}else
			{
				str_2=str_2+"2.  "+fcu_average+ " < " +(fcu_standard + lam1 * fcu_sdiviation)+"\n\n";
			}
			
			if( fcu_min > (lam2 * fcu_standard))
			{
				str_2=str_2+"3.  "+fcu_min+ " > " +(lam2 * fcu_standard);
			}else if(fcu_min == (lam2 * fcu_standard))
			{
				str_2=str_2+"3.  "+fcu_min+ " = " +(lam2 * fcu_standard);
			}else
			{
				str_2=str_2+"3.  "+fcu_min+ "<" +(lam2 * fcu_standard);
			}
			PdfPCell cell_conclu3 = new PdfPCell(new Paragraph(str_2,
					font_table_2));
			cell_conclu3.setVerticalAlignment(1);
			cell_conclu3.setColspan(4);
			table.addCell(cell_conclu3);

			PdfPCell cell_last = new PdfPCell(new Paragraph(
					"本验收批混凝土\n强度等级评定结论", font_table));
			cell_last.setHorizontalAlignment(1);
			cell_last.setVerticalAlignment(1);
			cell_last.setColspan(2);
			table.addCell(cell_last);
			String type="不合格";
			if (fcu_average >= (fcu_standard + lam1 * fcu_sdiviation)
					&& fcu_min >= (lam2 * fcu_sdiviation)) {
				type="合格";
			}
			PdfPCell cell_last1 = new PdfPCell(new Paragraph(
					"按GB/T50107-2010, 该批混凝土强度评定"+type, font_table));
			cell_last1.setHorizontalAlignment(1);
			cell_last1.setVerticalAlignment(1);
			cell_last1.setColspan(8);
			table.addCell(cell_last1);
			document.add(table);
			Paragraph sign = new Paragraph(
					"评定单位:                  批准:                   审核 :                   统计:                    ",
					font_normal);
			document.add(sign);
		} catch (DocumentException e) {
			status="PDFERROR";
			e.printStackTrace();
		}finally
		{
			document.close();
		}	
		return status;
	}
}
