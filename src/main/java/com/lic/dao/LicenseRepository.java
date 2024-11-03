package com.lic.dao;

import org.springframework.data.repository.CrudRepository;

import com.lic.entities.License;

public interface LicenseRepository extends CrudRepository<License, Integer> {

}
