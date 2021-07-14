package com.bae.dogs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.bae.dogs.data.Dog;

@Service
public class DogServiceList implements DogService {

	@Override
	public List<Dog> getAllDogs() {
		return this.dogs;
	}

	@GetMapping("/")
	public String hello() {
		return "Hello, World!";
	}

	private List<Dog> dogs = new ArrayList<>();

//creating a dog, put the dog class characteristics in the request body

	@Override
	public void createDog(@RequestBody Dog dog) {
		this.dogs.add(dog);
		System.out.println(dog);
	}

//how to delete a dog based on their id

	@Override
	public String deleteDog(@PathVariable int id) {
		dogs.remove(id);
		return "Deleted dog at index: " + id;
	}

//Getting a dog based on their index id on an array

	@Override
	public Dog getDog(@PathVariable int id) {
		return this.dogs.get(id);
	}

	// Getting a specific dog based on their index id on an array
	public Dog getASpecificDog(@PathVariable int id) {
		Dog found = this.dogs.get(id);
		return found;
	}

//how to replace a dog based on their specific id.
	// would replace all dog id with a new dog based on the criteria you enter into
	// the request bit

	@Override
	public Dog replaceDog(@PathVariable int id, @RequestBody Dog newDog) {
		return this.dogs.set(id, newDog);
	}

//listing all dogs

	public List<Dog> getDog(Dog dog) {
		return this.dogs;
	}

	// updating a dog by replacing the old one with a new one, based on the index
	// number
//	@PutMapping("/update/{id}")
	public Dog updateDog(@PathVariable int id, @RequestBody Dog dog) {
		this.dogs.remove(id);
		this.dogs.add(id, dog);
		return this.dogs.get(id);
	}

	// listing all of the dogs and printing them out
	// @GetMapping("listAllDogs")
	public List<Dog> listAllDogs() {
		for (Dog d : dogs) {
			System.out.println(d.toString());
		}
		return this.dogs;
	}

	// creating a new dog and returning it on the response part in postman
	// @GetMapping("/getDog")
	public Dog getDog() {
		return new Dog("Falafel", "Collie", 3, "Ball");
	}

}
