package com.vidhu.asmnt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "license_tbl")
public class License {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int licenseNumber;
	String vehicleType;

	

	

	public License(int licenseNumber, String vehicleType, User objUser) {
		super();
		this.licenseNumber = licenseNumber;
		this.vehicleType = vehicleType;
	}

	public License() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getlicenseNumber() {
		return licenseNumber;
	}

	public void setlicenseNumber(int licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getvehicleType() {
		return vehicleType;
	}

	public void setvehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

}
