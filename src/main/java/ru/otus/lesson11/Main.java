package ru.otus.lesson11;

import animals.Cat;
import animals.Dog;
import animals.Horse;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat("TestCat", 10, 20);
		Dog dog = new Dog("TestDog", 25, 15, 50);
		Horse horse = new Horse("TestHorse", 50, 25, 100);
		cat.swim(10);
		cat.run(0);
		System.out.println(cat.run(10) + "\n");
		cat.info();
		dog.swim(10);
		dog.info();
		horse.swim(20);
		horse.run(20);
		horse.info();
		horse.run(5);
	}
}
