package com.vidhu.asmnt.service;

import java.util.List;


import com.vidhu.asmnt.model.License;

public interface LicenseService {

	public String addLicense(License lic);
	public License getLicense(int id);
	public String updateLicense(License lic);
	public String deleteLicense(int id);
	public List<Integer> fetAlllicenseNumbers();
	public List<License> getAllId();
	

	
}
