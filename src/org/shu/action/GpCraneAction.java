package org.shu.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.shu.model.GpCrane;
import org.shu.service.imp.GpCraneService;
import org.tool.CommonParam;
import common.base.action.BaseAction;

@SuppressWarnings("serial")
public class GpCraneAction extends BaseAction{
	protected GpCrane gpCrane;
	protected GpCraneService gpCraneService;
	private String fileName;
	private  File upload;      			//�ϴ����ļ����ݣ������Ƕ����List����
	private String uploadFileName;  			//�ļ���
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public GpCrane getGpCrane() {
		return gpCrane;
	}

	public void setGpCrane(GpCrane gpCrane) {
		this.gpCrane = gpCrane;
	}

	public void setGpCraneService(GpCraneService gpCraneService) {
		this.gpCraneService = gpCraneService;
	}

	public String execute() throws Exception {
		String str=gpCrane.getReportId();
//		String envirmentTemp=gpCrane.get.getEnvirmentTemp();
//		String steamtime=gpCrane.getSteamTime();
//		String qidiaotime=gpCrane.getQidiaoTime();
		GpCrane gpCrane1 = new GpCrane();
//		gpCrane1.setCraneStrength(gpCrane.getCraneStrength());
		gpCrane1.setReportId(str);
//		gpCrane1.setEnvirmentTemp(envirmentTemp);
//		gpCrane1.setSteamTime(steamtime);
//		gpCrane1.setQidiaoTime(qidiaotime);
		gpCraneService.saveGpCrane(gpCrane1);	
		return SUCCESS;
	}	
	
}
