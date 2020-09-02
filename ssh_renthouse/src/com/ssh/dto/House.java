package com.ssh.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * House entity. @author MyEclipse Persistence Tools
 */

public class House implements java.io.Serializable {

	// Fields

	private Integer houseId;
	private User user;
	private String housetitle;
	private Integer province;
	private String city;
	private String address;
	private Integer roomNumber;
	private Integer rentType;
	private Integer charge;
	private Integer roomType;
	private Integer towards;
	private Short elevator;
	private Integer storey;
	private Short bed;
	private Short network;
	private Short airondition;
	private Short balcony;
	private Short refrigerator;
	private Short toilet;
	private Short kitchen;
	private Short bath;
	private Short heating;
	private Date releaseTime;
	private String comment;
	private Integer chargeType;
	private Short livingroom;
	private Short television;
	private Short washingMachine;
	private Short waterHeater;
	private Short sofa;
	private Integer area;
	private Integer decoration;
	private Integer status;
	private Short wardrobe;
	private Set picses = new HashSet(0);
	private Set favorites = new HashSet(0);

	// Constructors

	/** default constructor */
	public House() {
	}

	/** minimal constructor */
	public House(User user, String housetitle, Integer province, Integer charge) {
		this.user = user;
		this.housetitle = housetitle;
		this.province = province;
		this.charge = charge;
	}

	/** full constructor */
	public House(User user, String housetitle, Integer province, String city, String address, Integer roomNumber,
			Integer rentType, Integer charge, Integer roomType, Integer towards, Short elevator, Integer storey,
			Short bed, Short network, Short airondition, Short balcony, Short refrigerator, Short toilet, Short kitchen,
			Short bath, Short heating, Date releaseTime, String comment, Integer chargeType, Short livingroom,
			Short television, Short washingMachine, Short waterHeater, Short sofa, Integer area, Integer decoration,
			Integer status, Short wardrobe, Set picses, Set favorites) {
		this.user = user;
		this.housetitle = housetitle;
		this.province = province;
		this.city = city;
		this.address = address;
		this.roomNumber = roomNumber;
		this.rentType = rentType;
		this.charge = charge;
		this.roomType = roomType;
		this.towards = towards;
		this.elevator = elevator;
		this.storey = storey;
		this.bed = bed;
		this.network = network;
		this.airondition = airondition;
		this.balcony = balcony;
		this.refrigerator = refrigerator;
		this.toilet = toilet;
		this.kitchen = kitchen;
		this.bath = bath;
		this.heating = heating;
		this.releaseTime = releaseTime;
		this.comment = comment;
		this.chargeType = chargeType;
		this.livingroom = livingroom;
		this.television = television;
		this.washingMachine = washingMachine;
		this.waterHeater = waterHeater;
		this.sofa = sofa;
		this.area = area;
		this.decoration = decoration;
		this.status = status;
		this.wardrobe = wardrobe;
		this.picses = picses;
		this.favorites = favorites;
	}

	// Property accessors

	public Integer getHouseId() {
		return this.houseId;
	}

	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getHousetitle() {
		return this.housetitle;
	}

	public void setHousetitle(String housetitle) {
		this.housetitle = housetitle;
	}

	public Integer getProvince() {
		return this.province;
	}

	public void setProvince(Integer province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getRoomNumber() {
		return this.roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Integer getRentType() {
		return this.rentType;
	}

	public void setRentType(Integer rentType) {
		this.rentType = rentType;
	}

	public Integer getCharge() {
		return this.charge;
	}

	public void setCharge(Integer charge) {
		this.charge = charge;
	}

	public Integer getRoomType() {
		return this.roomType;
	}

	public void setRoomType(Integer roomType) {
		this.roomType = roomType;
	}

	public Integer getTowards() {
		return this.towards;
	}

	public void setTowards(Integer towards) {
		this.towards = towards;
	}

	public Short getElevator() {
		return this.elevator;
	}

	public void setElevator(Short elevator) {
		this.elevator = elevator;
	}

	public Integer getStorey() {
		return this.storey;
	}

	public void setStorey(Integer storey) {
		this.storey = storey;
	}

	public Short getBed() {
		return this.bed;
	}

	public void setBed(Short bed) {
		this.bed = bed;
	}

	public Short getNetwork() {
		return this.network;
	}

	public void setNetwork(Short network) {
		this.network = network;
	}

	public Short getAirondition() {
		return this.airondition;
	}

	public void setAirondition(Short airondition) {
		this.airondition = airondition;
	}

	public Short getBalcony() {
		return this.balcony;
	}

	public void setBalcony(Short balcony) {
		this.balcony = balcony;
	}

	public Short getRefrigerator() {
		return this.refrigerator;
	}

	public void setRefrigerator(Short refrigerator) {
		this.refrigerator = refrigerator;
	}

	public Short getToilet() {
		return this.toilet;
	}

	public void setToilet(Short toilet) {
		this.toilet = toilet;
	}

	public Short getKitchen() {
		return this.kitchen;
	}

	public void setKitchen(Short kitchen) {
		this.kitchen = kitchen;
	}

	public Short getBath() {
		return this.bath;
	}

	public void setBath(Short bath) {
		this.bath = bath;
	}

	public Short getHeating() {
		return this.heating;
	}

	public void setHeating(Short heating) {
		this.heating = heating;
	}

	public Date getReleaseTime() {
		return this.releaseTime;
	}

	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(Integer chargeType) {
		this.chargeType = chargeType;
	}

	public Short getLivingroom() {
		return this.livingroom;
	}

	public void setLivingroom(Short livingroom) {
		this.livingroom = livingroom;
	}

	public Short getTelevision() {
		return this.television;
	}

	public void setTelevision(Short television) {
		this.television = television;
	}

	public Short getWashingMachine() {
		return this.washingMachine;
	}

	public void setWashingMachine(Short washingMachine) {
		this.washingMachine = washingMachine;
	}

	public Short getWaterHeater() {
		return this.waterHeater;
	}

	public void setWaterHeater(Short waterHeater) {
		this.waterHeater = waterHeater;
	}

	public Short getSofa() {
		return this.sofa;
	}

	public void setSofa(Short sofa) {
		this.sofa = sofa;
	}

	public Integer getArea() {
		return this.area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	public Integer getDecoration() {
		return this.decoration;
	}

	public void setDecoration(Integer decoration) {
		this.decoration = decoration;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Short getWardrobe() {
		return this.wardrobe;
	}

	public void setWardrobe(Short wardrobe) {
		this.wardrobe = wardrobe;
	}

	public Set getPicses() {
		return this.picses;
	}

	public void setPicses(Set picses) {
		this.picses = picses;
	}

	public Set getFavorites() {
		return this.favorites;
	}

	public void setFavorites(Set favorites) {
		this.favorites = favorites;
	}

}