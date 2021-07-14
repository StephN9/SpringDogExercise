package com.bae.dogs.data;

public class Dog {

	private String name;
	private String breed;
	private int age;
	private String toy;

	public Dog(String name, String breed, int age, String toy) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.toy = toy;
	}

	public Dog() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getToy() {
		return toy;
	}

	public void setToy(String toy) {
		this.toy = toy;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + ", toy=" + toy + "]";
	}

}
