package com.bae.dogs.service;

import java.util.List;

import com.bae.dogs.data.Dog;

public interface DogService {

	public void createDog(Dog dog);

	public List<Dog> getAllDogs();

	public Dog getDog(int id);

	public Dog replaceDog(int id, Dog newDog);

	public String deleteDog(int id);

}
