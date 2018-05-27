package com.springdemo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_power database table.
 * 
 */
@Entity
@Table(name="user_power")
@NamedQuery(name="UserPower.findAll", query="SELECT u FROM UserPower u")
public class UserPower implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="power_id", unique=true, nullable=false)
	private int powerId;

	@Column(name="power_code", nullable=false, length=20)
	private String powerCode;

	@Column(name="power_name", nullable=false, length=30)
	private String powerName;

	public UserPower() {
	}

	public int getPowerId() {
		return this.powerId;
	}

	public void setPowerId(int powerId) {
		this.powerId = powerId;
	}

	public String getPowerCode() {
		return this.powerCode;
	}

	public void setPowerCode(String powerCode) {
		this.powerCode = powerCode;
	}

	public String getPowerName() {
		return this.powerName;
	}

	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}

}