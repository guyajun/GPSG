package org.shu.construct.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.tools.zip.ZipOutputStream;
import org.tool.CommonParam;

import common.base.action.BaseAction;

public class Zip extends BaseAction {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * 
	 * @param inputFileName
	 *            输入一个文件夹
	 * @param zipFileName
	 *            输出一个压缩文件夹，打包后文件名字
	 * @throws Exception
	 */
	public void zip(String inputFileName, String zipFileName) throws Exception {
		System.out.println(zipFileName);
		zip(zipFileName, new File(inputFileName));
	}

	private void zip(String zipFileName, File inputFile) throws Exception {
		ZipOutputStream out = new ZipOutputStream(new FileOutputStream(
				zipFileName));
		zip(out, inputFile, "");
		System.out.println("zip done");
		out.close();
	}

	private void zip(ZipOutputStream out, File f, String base) throws Exception {
		if (f.isDirectory()) { // 判断是否为目录
			File[] fl = f.listFiles();
			out.putNextEntry(new org.apache.tools.zip.ZipEntry(base + "/"));
			base = base.length() == 0 ? "" : base + "/";
			for (int i = 0; i < fl.length; i++) {
				zip(out, fl[i], base + fl[i].getName());
			}
		} else { // 压缩目录中的所有文件
			out.putNextEntry(new org.apache.tools.zip.ZipEntry(base));
			FileInputStream in = new FileInputStream(f);
			int b;
			System.out.println(base);
			while ((b = in.read()) != -1) {
				out.write(b);
			}
			in.close();
		}
	}

	public String beginZip() {
		try {
			 Runtime.getRuntime().exec("C:\\Users\\Administrator\\Desktop\\WinRAR\\WinRAR.exe a E:\\GPFile111.zip  E:\\GPFile");
//			 p.waitFor();
			message = "压缩开始";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String beginZip1() {
		CommonParam cp = new CommonParam();
		String uploadpath = cp.getString("ftp-local-path");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String today = sdf.format(date);
		String inputFileName = uploadpath; // 你要压缩的文件夹
		String zipFileName = "C://" + today + ".zip"; // 压缩后的zip文件
		Zip book = new Zip();
		try {
			book.zip(inputFileName, zipFileName);
			message = "压缩完成";
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return SUCCESS;
	}

}
