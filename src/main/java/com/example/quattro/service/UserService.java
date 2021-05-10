package com.example.quattro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quattro.model.User;
import com.example.quattro.repositary.UserRepositary;

@Service
public class UserService {

	@Autowired
	UserRepositary userRepositary;
	
	public Iterable<User> users() {
		return userRepositary.findAll();
	}
	
	public User user(int id) {
		return userRepositary.findById(id).get();
	}
	
	public String addUser(User ur) {
		userRepositary.save(ur);
		return "successfully inserted!";
	}
	
	public String updateUser(int id,User ur) {
		User user = userRepositary.findById(id).get();
		user.setName(ur.getName());
		user.setAge(ur.getAge());
		user.setEmail(ur.getEmail());
		userRepositary.save(user);
		return "successfully updated!";
	}
	
	public String deleteUser(int id) {
		userRepositary.deleteById(id);
		return "successfully deleted!";
	}
	
	public Iterable<User> getByName(String name) {
		return userRepositary.findByName(name);
	}
	
	
}
