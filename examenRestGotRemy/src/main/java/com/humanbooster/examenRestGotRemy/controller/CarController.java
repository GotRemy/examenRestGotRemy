package com.humanbooster.examenRestGotRemy.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.humanbooster.examenRestGotRemy.model.Car;
import com.humanbooster.examenRestGotRemy.repository.CarRepository;

@RestController
@RequestMapping("/api/cars")
public class CarController {

	@Autowired
	private CarRepository carRepository;
	
	@GetMapping("")
	List<Car> all(){
		return carRepository.findAll();
	}
	
	@PostMapping(value="", produces = {"application/json"}, consumes = {"application/json"})
	public ResponseEntity<Car> saveCar(@Valid @RequestBody Car car){
		
		this.carRepository.save(car);
		return new ResponseEntity<Car>(car, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/{car}", produces = {"application/json"})
	Car getOne (@PathVariable(name="car", required = false) Car car) {
		if(car == null) {
			throw new ResponseStatusException(
					HttpStatus.NOT_FOUND, "Car introuvable"
					);
		}
		else {
			return car;
		}
	}
}
