package com.example.quattro.repositary;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.quattro.model.Car;

@Repository
public interface CarRepositary extends MongoRepository<Car, String>{

}
