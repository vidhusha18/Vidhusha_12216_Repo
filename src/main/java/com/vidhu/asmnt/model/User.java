package com.vidhu.asmnt.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "users_tbl")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	@Column(name = "userName")
	private String userName;

	@Column(name = "userGender")
	private String userGender;

	@Column(name = "userAadhar")
	private double userAadhar;

	@OneToOne(cascade = CascadeType.ALL)
	private License lic;

	
	public User(int userId, String userName, String userGender, double userAadhar) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userGender = userGender;
		this.userAadhar = userAadhar;
		this.lic = lic;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getuserId() {
		return userId;
	}

	public void setuserId(int userId) {
		this.userId = userId;
	}

	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

	public String getuserGender() {
		return userGender;
	}

	public void setuserGender(String userGender) {
		this.userGender = userGender;
	}

	public double getuserAadhar() {
		return userAadhar;
	}

	public void setuserAadhar(double userAadhar) {
		this.userAadhar = userAadhar;
	}

	public License getLicense() {
		return lic;
	}

	public void setLicense(License lic) {
		this.lic = lic;
	}
	
	
}