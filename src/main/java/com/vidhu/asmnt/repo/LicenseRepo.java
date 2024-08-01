package com.vidhu.asmnt.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vidhu.asmnt.model.License;

@Repository
public interface LicenseRepo extends JpaRepository<License, Integer> 
{
	
	@Query("select licenseNumber from License")
		List<Integer> fetAlllicenseNumbers();
	}


