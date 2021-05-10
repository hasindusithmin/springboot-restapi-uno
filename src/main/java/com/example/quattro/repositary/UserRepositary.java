package com.example.quattro.repositary;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.quattro.model.User;

@Repository
public interface UserRepositary extends MongoRepository<User, Integer>{

	public Iterable<User> findByName(String nm);
	
}
