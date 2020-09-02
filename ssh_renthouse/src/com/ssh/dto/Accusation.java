package com.ssh.dto;

/**
 * Accusation entity. @author MyEclipse Persistence Tools
 */

public class Accusation implements java.io.Serializable {

	// Fields

	private Integer accusedId;
	private Integer FHouseId;
	private Integer FUserId;
	private Short hasRented;
	private Short houseNotExist;
	private Short locationFake;
	private Short priceFake;
	private Short pictureFake;
	private Short descriptionFake;
	private Short cheated;
	private Short others;
	private Short stealMine;
	private Integer FOwnerId;
	private String reason;

	// Constructors

	/** default constructor */
	public Accusation() {
	}

	/** full constructor */
	public Accusation(Integer FHouseId, Integer FUserId, Short hasRented, Short houseNotExist, Short locationFake,
			Short priceFake, Short pictureFake, Short descriptionFake, Short cheated, Short others, Short stealMine,
			Integer FOwnerId, String reason) {
		this.FHouseId = FHouseId;
		this.FUserId = FUserId;
		this.hasRented = hasRented;
		this.houseNotExist = houseNotExist;
		this.locationFake = locationFake;
		this.priceFake = priceFake;
		this.pictureFake = pictureFake;
		this.descriptionFake = descriptionFake;
		this.cheated = cheated;
		this.others = others;
		this.stealMine = stealMine;
		this.FOwnerId = FOwnerId;
		this.reason = reason;
	}

	// Property accessors

	public Integer getAccusedId() {
		return this.accusedId;
	}

	public void setAccusedId(Integer accusedId) {
		this.accusedId = accusedId;
	}

	public Integer getFHouseId() {
		return this.FHouseId;
	}

	public void setFHouseId(Integer FHouseId) {
		this.FHouseId = FHouseId;
	}

	public Integer getFUserId() {
		return this.FUserId;
	}

	public void setFUserId(Integer FUserId) {
		this.FUserId = FUserId;
	}

	public Short getHasRented() {
		return this.hasRented;
	}

	public void setHasRented(Short hasRented) {
		this.hasRented = hasRented;
	}

	public Short getHouseNotExist() {
		return this.houseNotExist;
	}

	public void setHouseNotExist(Short houseNotExist) {
		this.houseNotExist = houseNotExist;
	}

	public Short getLocationFake() {
		return this.locationFake;
	}

	public void setLocationFake(Short locationFake) {
		this.locationFake = locationFake;
	}

	public Short getPriceFake() {
		return this.priceFake;
	}

	public void setPriceFake(Short priceFake) {
		this.priceFake = priceFake;
	}

	public Short getPictureFake() {
		return this.pictureFake;
	}

	public void setPictureFake(Short pictureFake) {
		this.pictureFake = pictureFake;
	}

	public Short getDescriptionFake() {
		return this.descriptionFake;
	}

	public void setDescriptionFake(Short descriptionFake) {
		this.descriptionFake = descriptionFake;
	}

	public Short getCheated() {
		return this.cheated;
	}

	public void setCheated(Short cheated) {
		this.cheated = cheated;
	}

	public Short getOthers() {
		return this.others;
	}

	public void setOthers(Short others) {
		this.others = others;
	}

	public Short getStealMine() {
		return this.stealMine;
	}

	public void setStealMine(Short stealMine) {
		this.stealMine = stealMine;
	}

	public Integer getFOwnerId() {
		return this.FOwnerId;
	}

	public void setFOwnerId(Integer FOwnerId) {
		this.FOwnerId = FOwnerId;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}