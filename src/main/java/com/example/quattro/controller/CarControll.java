package com.example.quattro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.quattro.model.Car;
import com.example.quattro.service.CarService;

@RestController
public class CarControll {

	@Autowired
	CarService carservice;
	
	@GetMapping("/car")
	public Iterable<Car> cars() {
		return carservice.cars();
	}
	
	@PostMapping("/car")
	public int setCar(@RequestBody Car c) {
		return carservice.setCar(c);
	}
	
	@GetMapping("/car/{id}")
	public Car car(@PathVariable String id) {
		return carservice.car(id);
	}
	
	@PutMapping("/car/{id}")
	public String update_car(@PathVariable String id,@RequestBody Car c) {
		return carservice.update_car(id, c);
	}
	
	@DeleteMapping("/car/{id}")
	public String delete_car(@PathVariable String id) {
		return carservice.delete_car(id);
	}
	
	
}
