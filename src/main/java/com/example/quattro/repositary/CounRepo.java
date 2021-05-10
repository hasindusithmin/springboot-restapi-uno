package com.example.quattro.repositary;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.quattro.model.Country;

public interface CounRepo extends MongoRepository<Country, String>{

}
