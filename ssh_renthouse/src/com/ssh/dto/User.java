package com.ssh.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userName;
	private String userNickname;
	private Short gender;
	private String userAvatar;
	private String phone;
	private String wechat;
	private String EMail;
	private String password;
	private String idcardNumber;
	private Set favorites = new HashSet(0);
	private Set houses = new HashSet(0);
	private Set reservationsForFUserIdRent = new HashSet(0);
	private Set reservationsForFUserIdOwner = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String userNickname, String phone, String password) {
		this.userNickname = userNickname;
		this.phone = phone;
		this.password = password;
	}

	/** full constructor */
	public User(String userName, String userNickname, Short gender, String userAvatar, String phone, String wechat,
			String EMail, String password, String idcardNumber, Set favorites, Set houses,
			Set reservationsForFUserIdRent, Set reservationsForFUserIdOwner) {
		this.userName = userName;
		this.userNickname = userNickname;
		this.gender = gender;
		this.userAvatar = userAvatar;
		this.phone = phone;
		this.wechat = wechat;
		this.EMail = EMail;
		this.password = password;
		this.idcardNumber = idcardNumber;
		this.favorites = favorites;
		this.houses = houses;
		this.reservationsForFUserIdRent = reservationsForFUserIdRent;
		this.reservationsForFUserIdOwner = reservationsForFUserIdOwner;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNickname() {
		return this.userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public Short getGender() {
		return this.gender;
	}

	public void setGender(Short gender) {
		this.gender = gender;
	}

	public String getUserAvatar() {
		return this.userAvatar;
	}

	public void setUserAvatar(String userAvatar) {
		this.userAvatar = userAvatar;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWechat() {
		return this.wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public String getEMail() {
		return this.EMail;
	}

	public void setEMail(String EMail) {
		this.EMail = EMail;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIdcardNumber() {
		return this.idcardNumber;
	}

	public void setIdcardNumber(String idcardNumber) {
		this.idcardNumber = idcardNumber;
	}

	public Set getFavorites() {
		return this.favorites;
	}

	public void setFavorites(Set favorites) {
		this.favorites = favorites;
	}

	public Set getHouses() {
		return this.houses;
	}

	public void setHouses(Set houses) {
		this.houses = houses;
	}

	public Set getReservationsForFUserIdRent() {
		return this.reservationsForFUserIdRent;
	}

	public void setReservationsForFUserIdRent(Set reservationsForFUserIdRent) {
		this.reservationsForFUserIdRent = reservationsForFUserIdRent;
	}

	public Set getReservationsForFUserIdOwner() {
		return this.reservationsForFUserIdOwner;
	}

	public void setReservationsForFUserIdOwner(Set reservationsForFUserIdOwner) {
		this.reservationsForFUserIdOwner = reservationsForFUserIdOwner;
	}

}