package org.shu.plan.action;

import org.shu.action.UploadAction;
import org.shu.common.service.TransportService;
import org.shu.model.GpQuality;
import org.shu.model.GpReceive;
import org.shu.model.GpStorage;

import common.base.action.BaseAction;


@SuppressWarnings("serial")
public class TransportAction extends BaseAction {
	private TransportService transportService;
	private GpStorage gpStorage;
	private GpReceive gpReceive;
	private UploadAction uploadAction;
	private GpQuality gpQuality;
	

	public GpQuality getGpQuality() {
		return gpQuality;
	}

	public void setGpQuality(GpQuality gpQuality) {
		this.gpQuality = gpQuality;
	}

	public GpReceive getGpReceive() {
		return gpReceive;
	}

	public void setGpReceive(GpReceive gpReceive) {
		this.gpReceive = gpReceive;
	}

	public UploadAction getUploadAction() {
		return uploadAction;
	}

	public void setUploadAction(UploadAction uploadAction) {
		this.uploadAction = uploadAction;
	}

	public TransportService getTransportService() {
		return transportService;
	}

	public GpStorage getGpStorage() {
		return gpStorage;
	}

	public void setGpStorage(GpStorage gpStorage) {
		this.gpStorage = gpStorage;
	}

	public void setTransportService(TransportService transportService) {
		this.transportService = transportService;
	}

	/** ========================物流管理=================== **/
	//仓储管理
	public String storageGP()
	{
		GpStorage gpstorage1=new GpStorage();
		gpstorage1.setCoverId(gpStorage.getCoverId());
		gpstorage1.setStorageArea(gpStorage.getStorageArea());
		gpstorage1.setStorageDate(gpStorage.getStorageDate());
		transportService.addStorage(gpstorage1);
		
		return SUCCESS;
	}	
	//接收管理
	public String receiveGP()
	{
		GpReceive gpReceive1 = new GpReceive();
		gpReceive1.setReportId(gpReceive.getReportId());
		gpReceive1.setReceiveCount(gpReceive.getReceiveCount());
		gpReceive1.setReceiveDate(gpReceive.getReceiveDate());
		gpReceive1.setReceiver(gpReceive.getReceiver());
		gpReceive1.setUrl("uploadfile\\" + uploadAction.getFileName());
		transportService.addReceive(gpReceive1);
		return SUCCESS;
	}
	
	//出厂管理
	public String outGP()
	{
		GpQuality gpquality1 = new GpQuality();
		gpquality1.setReportId(gpQuality.getReportId());
		gpquality1.setUrl("uploadfile\\" + uploadAction.getFileName());
		transportService.addQuality(gpquality1);
		return SUCCESS;
	}
	
	
}
