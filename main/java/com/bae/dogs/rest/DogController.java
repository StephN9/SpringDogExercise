package com.bae.dogs.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bae.dogs.data.Dog;
import com.bae.dogs.service.DogService;

@RestController
public class DogController {

	private DogService service;

	public DogController(DogService service) {
		super();
		this.service = service;
	}

	@GetMapping("/")
	public String hello() {
		return "Hello, World!";
	}

	@PostMapping("/createDog") // fancy
	public void createDog(@RequestBody Dog dog) { // less fancy
		this.service.createDog(dog);
	}

	@GetMapping("/getAllDogs")
	public List<Dog> getAllDogs() {
		return this.service.getAllDogs();
	}

	@GetMapping("/getDog/{id}")
	public Dog getDog(@PathVariable int id) {
		return this.service.getDog(id);
	}

	@PutMapping("/replaceDog/{id}")
	public Dog replaceDog(@PathVariable int id, @RequestBody Dog newDog) {
		return this.service.replaceDog(id, newDog);
	}

	@DeleteMapping("/deleteDog/{id}")
	public String deleteDog(@PathVariable int id) {
		return this.service.deleteDog(id);
	}

}
