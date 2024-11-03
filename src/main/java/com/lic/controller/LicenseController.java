package com.lic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.entities.License;
import com.lic.service.LicenseService;

@RestController
public class LicenseController {
	@Autowired
   LicenseService licenseService;
	
	//get all licenses
	@GetMapping("/all")
	public List<License> getAllLicense() {
		List<License> list = this.licenseService.getAllLic();
		if(list.size() == 0) {
			System.out.println("no license available");
		}
		return list;
	}
	
	//get license by id
	@GetMapping("/lic/{id}")
	public License getLicById(@PathVariable("id") int id) {
		License license = this.licenseService.getById(id);
		return license;
	}
	
	//create license
	@PostMapping("/create")
	public License createLicense(@RequestBody License license) {
		License newlic =  this.licenseService.createBook(license);
		return newlic;
	}
	
	//update license
	@PutMapping("/update/{id}")
	public License updateLicense(@RequestBody License license, @PathVariable("id") int id) {
		License lic = this.licenseService.updateLicense(license, id);
		return lic;
	}
	
	//delete license
	@DeleteMapping("/delete/{id}")
	public void deleteLicense(@PathVariable("id") int id) {
		this.licenseService.deleteLicense(id);
	}
}
