package com.example.quattro.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class User {

	@Id
	private int id;
	private String name;
	private int age;
	private String email;
	
}
