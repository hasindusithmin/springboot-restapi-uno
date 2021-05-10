package com.example.quattro.model;

import org.springframework.data.annotation.Id;

import lombok.Data;
@Data
public class Country {
	
	@Id
	private String name;
	private String continent;
	private int population;
	public String getName() {
		return name;
	}
	
	
	
	
}
