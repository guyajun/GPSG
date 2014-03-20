package org.shu.model;

/**
 * PartOfConcRcvd entity. @author MyEclipse Persistence Tools
 */

public class PartOfConcRcvd implements java.io.Serializable {

	// Fields

	private Integer id;
	private String proId;
	private String mixRatioId;
	private Integer water;
	private Integer concrete;
	private Integer sand;
	private Integer stone;
	private Integer coalAsh;
	private Integer mineralPowder;
	private Integer additive;
	private Integer waterAshRatio;

	// Constructors

	/** default constructor */
	public PartOfConcRcvd() {
	}

	/** full constructor */
	public PartOfConcRcvd(String proId, String mixRatioId, Integer water,
			Integer concrete, Integer sand, Integer stone, Integer coalAsh,
			Integer mineralPowder, Integer additive, Integer waterAshRatio) {
		this.proId = proId;
		this.mixRatioId = mixRatioId;
		this.water = water;
		this.concrete = concrete;
		this.sand = sand;
		this.stone = stone;
		this.coalAsh = coalAsh;
		this.mineralPowder = mineralPowder;
		this.additive = additive;
		this.waterAshRatio = waterAshRatio;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProId() {
		return this.proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public String getMixRatioId() {
		return this.mixRatioId;
	}

	public void setMixRatioId(String mixRatioId) {
		this.mixRatioId = mixRatioId;
	}

	public Integer getWater() {
		return this.water;
	}

	public void setWater(Integer water) {
		this.water = water;
	}

	public Integer getConcrete() {
		return this.concrete;
	}

	public void setConcrete(Integer concrete) {
		this.concrete = concrete;
	}

	public Integer getSand() {
		return this.sand;
	}

	public void setSand(Integer sand) {
		this.sand = sand;
	}

	public Integer getStone() {
		return this.stone;
	}

	public void setStone(Integer stone) {
		this.stone = stone;
	}

	public Integer getCoalAsh() {
		return this.coalAsh;
	}

	public void setCoalAsh(Integer coalAsh) {
		this.coalAsh = coalAsh;
	}

	public Integer getMineralPowder() {
		return this.mineralPowder;
	}

	public void setMineralPowder(Integer mineralPowder) {
		this.mineralPowder = mineralPowder;
	}

	public Integer getAdditive() {
		return this.additive;
	}

	public void setAdditive(Integer additive) {
		this.additive = additive;
	}

	public Integer getWaterAshRatio() {
		return this.waterAshRatio;
	}

	public void setWaterAshRatio(Integer waterAshRatio) {
		this.waterAshRatio = waterAshRatio;
	}

}