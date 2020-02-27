package com.tg.abst.test;

public class CaptionTv extends Tv{

	String caption = "";
	
	//재정의 어노테이션 @Override
	//추상메서드 구체화시에도 주석표시 (+가독성)
	@Override
	void power() {	//구체화
		System.out.println("CaptionTv");
	}
	
	@Override
	void info() {
		System.out.println("CaptionTv");
	}
	
	void captions() {
		
	}
	
	
}
