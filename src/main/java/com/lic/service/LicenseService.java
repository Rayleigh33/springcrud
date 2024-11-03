package com.lic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lic.dao.LicenseRepository;
import com.lic.entities.License;

@Component
public class LicenseService {
	@Autowired
	LicenseRepository licenseRepository;
	
	//function to get all licenses
	
	public List<License> getAllLic(){
		List<License> lic = null;
		lic = (List<License>) this.licenseRepository.findAll();
		
		return lic;
	}
	
	//function to get license by id
	public License getById(int id) {
		Optional<License> found = (Optional<License>) this.licenseRepository.findById(id);
		License result = found.get();
		
		return result;
	}
	
	//function to create license
	public License createBook(License lic) {
		License license = this.licenseRepository.save(lic);
		return license;
	}
	
	//function to update license
	public License updateLicense(License license, int id) {
		license.setId(id);
		License lic = this.licenseRepository.save(license);
		return lic;
	}
	
	//delete license
	public void deleteLicense(int id) {
		this.licenseRepository.deleteById(id);
	}

}
