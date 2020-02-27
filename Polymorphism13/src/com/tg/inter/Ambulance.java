package com.tg.inter;


public class Ambulance implements Car{

	@Override
	public void sound() {
		System.out.println("삐뽀삐뽀");
	}

	@Override
	public void work() {
		System.out.println("구조구조구조");
	}

	
}
