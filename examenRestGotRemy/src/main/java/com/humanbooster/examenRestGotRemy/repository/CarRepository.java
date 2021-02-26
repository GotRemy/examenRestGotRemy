package com.humanbooster.examenRestGotRemy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.humanbooster.examenRestGotRemy.model.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Long>{

	@Override
	List<Car> findAll();
}
