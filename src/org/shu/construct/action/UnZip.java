package org.shu.construct.action;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

import org.apache.commons.io.FilenameUtils;
import org.apache.tools.zip.ZipEntry;
import org.apache.tools.zip.ZipFile;
import org.tool.CommonParam;

import common.base.action.BaseAction;

public class UnZip extends BaseAction {
	private String message;	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * 创建目录
	 * 
	 * @param path
	 *            目录绝对路径名
	 */
	static void createDir(String path) {
		File dir = new File(path);
		if (dir.exists() == false)
			dir.mkdir();
	}

	/**
	 * 取得文件名,不包含后缀名
	 * 
	 * @param name
	 *            完整文件名
	 * @return 文件名(不包含后缀名)
	 */
	static String getSuffixName(String name) {
		return name.substring(0, name.lastIndexOf("."));
	}

	public void beginUnZip() throws Exception {
		CommonParam cp=new CommonParam();
		String produceFile=cp.getString("local-imgs-produce");//生产端下载下来的压缩包解压缩之后的路径
		String restoreDbPath=cp.getString("local-restore-path");//施工端还原生产端数据库的路径
		File file = new File("C:\\Users\\Administrator\\Downloads");
		File[] fileList = file.listFiles();
		long minDiffDays = 365 * 10;
		Date mostRecentDate = null;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < fileList.length; i++) {
			File file1 = fileList[i];
			String fileName = file1.getName();
			String baseName = FilenameUtils.getBaseName(fileName);
			String extName = FilenameUtils.getExtension(fileName);
			String[] nYR = baseName.split("-");
			Date today = new Date();
			if (file1.isFile() && extName.equals("zip") && nYR.length == 3
					&& nYR[0].length() == 4 && nYR[1].length() == 2
					&& nYR[2].length() == 2) {
				System.out.println("合格文件="+fileName);
				Date date = format.parse(baseName);
				long time1 = today.getTime();
				long time2 = date.getTime();
				long diff = (time1 - time2) / 1000 / 60 / 60 / 24;
				System.out.println("差的天数"+diff);
				if (diff < minDiffDays) {
					minDiffDays = diff;
					mostRecentDate = date;
				}
			}
		}
		String mostRecentDate1 = format.format(mostRecentDate);
		unzip("C:\\Users\\Administrator\\Downloads\\" + mostRecentDate1 + ".zip", produceFile);
		CopyFile fileObj = new CopyFile();
		fileObj.copyFolder(produceFile+"\\"+mostRecentDate1, produceFile);
		fileObj.copyFolder(produceFile+"\\"+mostRecentDate1+"\\produce-db", restoreDbPath);
	}

	/**
	 * 解压zip文件
	 * 
	 * @param zipFilePath
	 *            zip文件绝对路径
	 * @param unzipDirectory
	 *            解压到的确
	 * @throws Exception
	 */
	public static void unzip(String zipFilePath, String unzipDirectory)
			throws Exception {
		// 创建文件对象
		File file = new File(zipFilePath);
		// 创建zip文件对象
		ZipFile zipFile = new ZipFile(file);
		// 创建本zip文件解压目录
		File unzipFile = new File(unzipDirectory + "/"
				+ getSuffixName(file.getName()));
		if (unzipFile.exists())
			unzipFile.delete();
		unzipFile.mkdir();
		// 得到zip文件条目枚举对象
		Enumeration zipEnum = zipFile.getEntries();
		// 定义输入输出流对象
		InputStream input = null;
		OutputStream output = null;
		// 定义对象
		ZipEntry entry = null;
		// 循环读取条目
		while (zipEnum.hasMoreElements()) {
			// 得到当前条目
			entry = (ZipEntry) zipEnum.nextElement();
			String entryName = new String(entry.getName());
			// 用/分隔条目名称
			String names[] = entryName.split("\\/");
			int length = names.length;
			String path = unzipFile.getAbsolutePath();
			for (int v = 0; v < length; v++) {
				if (v < length - 1) { // 最后一个目录之前的目录
					path += "/" + names[v] + "/";
					createDir(path);
				} else { // 最后一个
					if (entryName.endsWith("/")) // 为目录,则创建文件夹
						createDir(unzipFile.getAbsolutePath() + "/" + entryName);
					else { // 为文件,则输出到文件
						input = zipFile.getInputStream(entry);
						output = new FileOutputStream(new File(
								unzipFile.getAbsolutePath() + "/" + entryName));
						byte[] buffer = new byte[1024 * 8];
						int readLen = 0;
						while ((readLen = input.read(buffer, 0, 1024 * 8)) != -1)
							output.write(buffer, 0, readLen);
						// 关闭流
						input.close();
						output.flush();
						output.close();
					}
				}
			}
		}
	}
}