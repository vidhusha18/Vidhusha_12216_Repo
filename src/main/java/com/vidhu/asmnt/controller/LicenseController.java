package com.vidhu.asmnt.controller;

import java.util.List;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vidhu.asmnt.service.LicenseService;
import com.vidhu.asmnt.model.License;

@RestController
@RequestMapping("/license")
@CrossOrigin("http://localhost:3000/")
public class LicenseController {

	
		LicenseService service;

	public LicenseController(LicenseService service) {
		super();
		this.service = service;
	}

	@PostMapping
	public void addLicense(@RequestBody License lic) {
		service.addLicense(lic);
	}

	@GetMapping("{id}")
	public License getLicense(@PathVariable int id) {
		return service.getLicense(id);
	}

	
	@DeleteMapping("{id}")
	public void deleteLicense(@PathVariable int id) {
		service.deleteLicense(id);
	}

	@PutMapping
	public void updateLicense(@RequestBody License lic) {
		service.updateLicense(lic);
	}
	

	
	@GetMapping("/alllid")
	public List<License> getAllId(){
		return service.getAllId();
	}
	
	@GetMapping("/alllicid")
	public List<Integer> getAllLicId(){
		return service.fetAlllicenseNumbers();
	}
}
