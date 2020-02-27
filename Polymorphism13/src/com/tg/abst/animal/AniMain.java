package com.tg.abst.animal;

public class AniMain {

	public static void main(String[] args) {

		Cat cat = new Cat();
		Rabbit rabbit = new Rabbit();
		Parrot parrot = new Parrot();
		
		cat.run();
		rabbit.run();
		parrot.run();
		
	}

}
