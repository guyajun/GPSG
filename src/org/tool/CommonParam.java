package org.tool;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
 
public class CommonParam {
    private String propertyFileName;
    private ResourceBundle resourceBundle;
    public CommonParam() {
        propertyFileName = "../SysConfig";
        resourceBundle = ResourceBundle.getBundle(propertyFileName);
    }
    public String getString(String key) {
        if (key == null || key.equals("") || key.equals("null")) {
            return "";
        }
        String result = "";
        try {
            result = resourceBundle.getString(key);
        } catch (MissingResourceException e) {
            e.printStackTrace();
        }
        return result;
    }
    public String getMostRecentDay(String dirPath) throws Exception{
		File file = new File(dirPath);
		File[] fileList = file.listFiles();
		long minDiffDays = 365 * 10;
		Date mostRecentDate = null;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < fileList.length; i++) {
			File file1 = fileList[i];
			String fileName = file1.getName();
			String[] nYR = fileName.split("-");
			Date today = new Date();
			if (file1.isDirectory() && nYR.length == 3 && nYR[0].length() == 4
					&& nYR[1].length() == 2 && nYR[2].length() == 2) {
				System.out.println("合格文件=" + fileName);
				Date date = format.parse(fileName);
				long time1 = today.getTime();
				long time2 = date.getTime();
				long diff = (time1 - time2) / 1000 / 60 / 60 / 24;
				System.out.println("差的天数" + diff);
				if (diff < minDiffDays) {
					minDiffDays = diff;
					mostRecentDate = date;
				}
			}
		}
		String mostRecentDate1 = format.format(mostRecentDate);
		return mostRecentDate1;
    }
}