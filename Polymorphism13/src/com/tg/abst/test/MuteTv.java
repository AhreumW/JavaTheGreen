package com.tg.abst.test;

//상속을 받은 추상메서드는 무조건 구현시켜야한다. (MuteTv도 추상클래스가 아니라면)
public class MuteTv extends Tv{	
	
	String mute = "";
	
	@Override
	void power() {	 
		System.out.println("MuteTv");
	}
	@Override
	void info() {
		System.out.println("MuteTv");
	}
	
	void setMute() {
		
	}
}