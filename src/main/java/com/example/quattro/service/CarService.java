package com.example.quattro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quattro.model.Car;
import com.example.quattro.repositary.CarRepositary;

@Service
public class CarService {

	@Autowired
	CarRepositary carRepositary;
	
	public int setCar(Car c) {
		carRepositary.save(c);
		return 200;
	}
	
	public Iterable<Car> cars() {
		return carRepositary.findAll();
	}
	
	public Car car(String plt) {
	   return carRepositary.findById(plt).get();
	}
	
	public String update_car(String id,Car c) {
		Car car = carRepositary.findById(id).get();
		car.setModel(c.getModel());
		car.setYear(c.getYear());
		carRepositary.save(car);
		return "successfully updated!";
	}
	
	public String delete_car(String id) {
		carRepositary.deleteById(id);
		return "successfully deleted!";
	}
	
	
}
