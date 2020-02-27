package com.tg.abst.test;

public abstract class Tv {
	
	boolean power = false;
	int channel = 0;	
	
	abstract void power();	//추상화

	abstract void info();	//모든 멤버 변수 출력용
	
	
}