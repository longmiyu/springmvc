package com.springdemo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the up_user database table.
 * 
 */
@Entity
@Table(name="up_user")
@NamedQuery(name="UpUser.findAll", query="SELECT u FROM UpUser u")
public class UpUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="UP_USER_USERID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="UP_USER_USERID_GENERATOR")
	@Column(name="user_id")
	private long userId;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="uer_code")
	private String uerCode;

	@Column(name="user_age")
	private int userAge;

	@Column(name="user_name")
	private String userName;

	@Column(name="user_password")
	private String userPassword;

	public UpUser() {
	}

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Object getUerCode() {
		return this.uerCode;
	}

	public void setUerCode(String uerCode) {
		this.uerCode = uerCode;
	}

	public int getUserAge() {
		return this.userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public Object getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Object getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}