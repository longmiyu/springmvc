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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id", unique=true, nullable=false, precision=18)
	private long userId;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(length=50)
	private String email;

	@Column(name="user_age")
	private int userAge;

	@Column(name="user_code", nullable=false, length=20)
	private String userCode;

	@Column(name="user_name", nullable=false, length=20)
	private String userName;

	@Column(name="user_password", nullable=false, length=30)
	private String userPassword;

	@Column(name="user_sex", nullable=false, length=1)
	private String userSex;

	@Column(name="user_type", length=2)
	private String userType;

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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getUserAge() {
		return this.userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserSex() {
		return this.userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

}