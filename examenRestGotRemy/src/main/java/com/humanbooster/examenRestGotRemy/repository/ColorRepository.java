package com.humanbooster.examenRestGotRemy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.humanbooster.examenRestGotRemy.model.Color;

@Repository
public interface ColorRepository extends CrudRepository<Color, Long>{

	@Override
	List<Color> findAll();
}
