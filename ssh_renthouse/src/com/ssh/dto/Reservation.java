package com.ssh.dto;

import java.sql.Time;
import java.util.Date;

/**
 * Reservation entity. @author MyEclipse Persistence Tools
 */

public class Reservation implements java.io.Serializable {

	// Fields

	private Integer reverseId;
	private User userByFUserIdRent;
	private User userByFUserIdOwner;
	private Date date;
	private Time time;
	private String position;
	private String message;
	private Short isagree;

	// Constructors

	/** default constructor */
	public Reservation() {
	}

	/** minimal constructor */
	public Reservation(User userByFUserIdRent, User userByFUserIdOwner, Date date, Short isagree) {
		this.userByFUserIdRent = userByFUserIdRent;
		this.userByFUserIdOwner = userByFUserIdOwner;
		this.date = date;
		this.isagree = isagree;
	}

	/** full constructor */
	public Reservation(User userByFUserIdRent, User userByFUserIdOwner, Date date, Time time, String position,
			String message, Short isagree) {
		this.userByFUserIdRent = userByFUserIdRent;
		this.userByFUserIdOwner = userByFUserIdOwner;
		this.date = date;
		this.time = time;
		this.position = position;
		this.message = message;
		this.isagree = isagree;
	}

	// Property accessors

	public Integer getReverseId() {
		return this.reverseId;
	}

	public void setReverseId(Integer reverseId) {
		this.reverseId = reverseId;
	}

	public User getUserByFUserIdRent() {
		return this.userByFUserIdRent;
	}

	public void setUserByFUserIdRent(User userByFUserIdRent) {
		this.userByFUserIdRent = userByFUserIdRent;
	}

	public User getUserByFUserIdOwner() {
		return this.userByFUserIdOwner;
	}

	public void setUserByFUserIdOwner(User userByFUserIdOwner) {
		this.userByFUserIdOwner = userByFUserIdOwner;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return this.time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Short getIsagree() {
		return this.isagree;
	}

	public void setIsagree(Short isagree) {
		this.isagree = isagree;
	}

}