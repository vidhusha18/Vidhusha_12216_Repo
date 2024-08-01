package com.vidhu.asmnt.serviceimpl;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;


import com.vidhu.asmnt.model.License;
import com.vidhu.asmnt.repo.LicenseRepo;
import com.vidhu.asmnt.service.LicenseService;

@Service
public class LicenseServiceImpl implements LicenseService {

	
	LicenseRepo repo;

	public LicenseServiceImpl(LicenseRepo repo) {
		super();
		this.repo = repo;
	}

	
	
	public String addLicense(License lic) {
		if(lic!=null)
		{
			repo.save(lic);
			return "success";
		}
		else {
			return "failure";
		}
		

	}

	public License getLicense(int id) {
		Optional<License> licOptional = repo.findById(id);
		return licOptional.orElse(null);

	}

	public List<License> getAllLicense() {

		return repo.findAll();
	}

	
	public String updateLicense(License lic) {
		if(lic!= null)
		{
			repo.save(lic);
			return "success";
		}
		else {
			return "failure";
		}

	}

	public String deleteLicense(int id) {
		Optional<License> licOptional= repo.findById(id);
		if(licOptional.isPresent())
		{
			repo.deleteById(id);
			return "success";
		}
		else {
			return "failure";
		}

	}






	@Override
	public List<License> getAllId() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}



	@Override
	public List<Integer> fetAlllicenseNumbers() {
		// TODO Auto-generated method stub
		return repo.fetAlllicenseNumbers();
	}




	
}



