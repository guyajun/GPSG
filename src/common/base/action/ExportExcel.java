package common.base.action;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

@SuppressWarnings("serial")
public class ExportExcel extends BaseAction {	

	public void exportExcelCommon(ArrayList list,ArrayList<String> titles,String excelPath) {		
		try {
			WritableWorkbook book = Workbook
					.createWorkbook(new File(excelPath));
			WritableSheet sheet = book.createSheet("第一页", 0);
			for (int i = 0; i < titles.size(); i++) {
				Label label = new Label(i, 0, titles.get(i));
				sheet.addCell(label);
			}
			for (int i = 0; i < list.size(); i++) {
				Object object = list.get(i);
				Field[] fields=object.getClass().getDeclaredFields();
				for(int j=0;j<fields.length;j++){
					Field field = object.getClass().getDeclaredField(fields[j].getName()); 
					field.setAccessible(true); 
			        if(field.get(object)==null){
						Label label = new Label(j, i + 1, "");
						sheet.addCell(label);
			        }
			        else{
						Label label = new Label(j, i + 1, field.get(object).toString());
						sheet.addCell(label);
			        }
				}
			}
			book.write();
			book.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}