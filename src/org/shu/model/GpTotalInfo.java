package org.shu.model;

/**
 * GpTotalInfo entity. @author MyEclipse Persistence Tools
 */

public class GpTotalInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer tunnelLoop;
	private Integer proId;
	private String shieldPosePic;
	private String synchronousGroutPic;
	private String inCheckPic;
	private String downWellPic;
	private String pzqcheckPic;
	private String segmentrepairPic;
	private Integer isEast;

	// Constructors

	/** default constructor */
	public GpTotalInfo() {
	}

	/** full constructor */
	public GpTotalInfo(Integer tunnelLoop, Integer proId, String shieldPosePic,
			String synchronousGroutPic, String inCheckPic, String downWellPic,
			String pzqcheckPic, String segmentrepairPic, Integer isEast) {
		this.tunnelLoop = tunnelLoop;
		this.proId = proId;
		this.shieldPosePic = shieldPosePic;
		this.synchronousGroutPic = synchronousGroutPic;
		this.inCheckPic = inCheckPic;
		this.downWellPic = downWellPic;
		this.pzqcheckPic = pzqcheckPic;
		this.segmentrepairPic = segmentrepairPic;
		this.isEast = isEast;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTunnelLoop() {
		return this.tunnelLoop;
	}

	public void setTunnelLoop(Integer tunnelLoop) {
		this.tunnelLoop = tunnelLoop;
	}

	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public String getShieldPosePic() {
		return this.shieldPosePic;
	}

	public void setShieldPosePic(String shieldPosePic) {
		this.shieldPosePic = shieldPosePic;
	}

	public String getSynchronousGroutPic() {
		return this.synchronousGroutPic;
	}

	public void setSynchronousGroutPic(String synchronousGroutPic) {
		this.synchronousGroutPic = synchronousGroutPic;
	}

	public String getInCheckPic() {
		return this.inCheckPic;
	}

	public void setInCheckPic(String inCheckPic) {
		this.inCheckPic = inCheckPic;
	}

	public String getDownWellPic() {
		return this.downWellPic;
	}

	public void setDownWellPic(String downWellPic) {
		this.downWellPic = downWellPic;
	}

	public String getPzqcheckPic() {
		return this.pzqcheckPic;
	}

	public void setPzqcheckPic(String pzqcheckPic) {
		this.pzqcheckPic = pzqcheckPic;
	}

	public String getSegmentrepairPic() {
		return this.segmentrepairPic;
	}

	public void setSegmentrepairPic(String segmentrepairPic) {
		this.segmentrepairPic = segmentrepairPic;
	}

	public Integer getIsEast() {
		return this.isEast;
	}

	public void setIsEast(Integer isEast) {
		this.isEast = isEast;
	}

}