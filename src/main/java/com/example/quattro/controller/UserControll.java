package com.example.quattro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.quattro.model.User;
import com.example.quattro.service.UserService;

@RestController
public class UserControll {

	@Autowired
	UserService userservice;
	
	@GetMapping("/users")
	public Iterable<User> users(){
		return userservice.users();
	}
	@GetMapping("/user/{id}")
	public User User(@PathVariable int id) {
		return userservice.user(id);
	}
	@GetMapping("/name/{nm}")
	public Iterable<User> findByName(@PathVariable String nm) {
		return userservice.getByName(nm);
	}
	@PostMapping("/user")
	public String addUser(@RequestBody User ur) {
		return userservice.addUser(ur);
	}
	
	@PutMapping("/user/{id}")
	public String updateUser(@PathVariable int id,@RequestBody User ur) {
		return userservice.updateUser(id, ur);
	}
	
	@DeleteMapping("/user/{id}")
	public String deleteuser(@PathVariable int id) {
		return userservice.deleteUser(id);
	}
	
	
}
