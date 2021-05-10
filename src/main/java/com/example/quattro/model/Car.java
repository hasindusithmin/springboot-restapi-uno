package com.example.quattro.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Car {

	@Id
	private String plate;
	private String model;
	private int year;
	
	
}
