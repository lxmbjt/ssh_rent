package com.ssh.dto;

/**
 * Pics entity. @author MyEclipse Persistence Tools
 */

public class Pics implements java.io.Serializable {

	// Fields

	private Integer picsId;
	private House house;
	private String pic;

	// Constructors

	/** default constructor */
	public Pics() {
	}

	/** full constructor */
	public Pics(House house, String pic) {
		this.house = house;
		this.pic = pic;
	}

	// Property accessors

	public Integer getPicsId() {
		return this.picsId;
	}

	public void setPicsId(Integer picsId) {
		this.picsId = picsId;
	}

	public House getHouse() {
		return this.house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	public String getPic() {
		return this.pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

}