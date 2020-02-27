package com.tg.polymorphism;

public class Tv {
	
	boolean power= true; 
	int channel = 0;	 
	
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	
	
}