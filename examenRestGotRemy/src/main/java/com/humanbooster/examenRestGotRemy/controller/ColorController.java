package com.humanbooster.examenRestGotRemy.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.humanbooster.examenRestGotRemy.model.Color;
import com.humanbooster.examenRestGotRemy.repository.ColorRepository;

@RestController
@RequestMapping("/api/colors")
public class ColorController {

	@Autowired
	private ColorRepository colorRepository;
	
	@GetMapping("")
	List<Color> all(){
		return colorRepository.findAll();
	}
	
	@PostMapping(value="", produces = {"application/json"}, consumes = {"application/json"})
	public ResponseEntity<Color> saveColor(@Valid @RequestBody Color color){
		this.colorRepository.save(color);
		return new ResponseEntity<Color>(color, HttpStatus.CREATED);
	}
	
	@DeleteMapping(value = "/{color}", produces = {"application/json"})
	void deleteOne(@PathVariable(name="color", required = false) Color color) {
		if(color == null) {
			throw new ResponseStatusException(
					HttpStatus.NOT_FOUND, "Color introuvable"
					);
		}
		else {
			this.colorRepository.delete(color);
		}
	}
	
	@PutMapping(value = "/{color}", produces = {"application/json"})
	public ResponseEntity<Color> update(@PathVariable(name="color", required = false) Color color, @Valid @RequestBody Color colorUpdate){
		if(color == null) {
			throw new ResponseStatusException(
					HttpStatus.NOT_FOUND, "Color introuvable"
					);
		}
		colorUpdate.setId(color.getId());
		this.colorRepository.save(colorUpdate);
		
		return new ResponseEntity<Color>(color, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{color}", produces = {"application/json"})
	Color getOne(@PathVariable(name="color", required = false) Color color) {
		if(color == null) {
			throw new ResponseStatusException(
					HttpStatus.NOT_FOUND, "Color introuvable"
					);
		}
		else {
			return color;
		}
	}
}
