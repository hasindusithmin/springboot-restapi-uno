package com.example.quattro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quattro.model.Country;
import com.example.quattro.repositary.CounRepo;

@Service
public class CountryService {

	@Autowired
	CounRepo counRepo;
	
	public Iterable<Country> coun() {
		return counRepo.findAll();
	}
	
	public Country coun(String cname) {
		return counRepo.findById(cname).get();
	}
	
	public String coun(Country c) {
		counRepo.save(c);
		return "inserted!";
	}
	
	public int coun(String cname,Country cobj) {
		Country country = counRepo.findById(cname).get();
		country.setName(cobj.getName());
		country.setContinent(cobj.getContinent());
		country.setPopulation(cobj.getPopulation());
		return 200;
	}
	
	public void country(String cname) {
		counRepo.deleteById(cname);
	}
	
	
	
}
