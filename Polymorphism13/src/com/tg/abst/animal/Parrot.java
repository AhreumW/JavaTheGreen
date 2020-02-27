package com.tg.abst.animal;

public class Parrot extends Animal{

	int wing;
	
	@Override
	void run() {
		System.out.println("앵무새는 뛰지 못합니다.");
	}
	
}
