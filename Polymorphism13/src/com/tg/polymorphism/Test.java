package com.tg.polymorphism;
/*
다형성?(polymorphism)
		객체지향개념에서 다형성이란
		'여러가지 형태를 가질 수 있는 능력'을 의미하며
		자바에서는 한 타입의 *참조변수로 여러 타입의 객체를 참조할 수 있도록 함으로써 
		다형성을 프로그램적으로 구현하였다. 
		부모클래스 타입*의 참조변수로 자식클래스의 인스턴스를 참조할 수 있도록 하였다. 
*/		
//공통된 행동을 서로 다르게 인식하게 하기 위한 목적...?!
public class Test {

	//부모는 자식에게 멤버를 다 받을 수 있고 
	//자식은 부모가 없을수도 있는 멤버로 인한 불확실성으로 받을수 없다. 
			
	public static void main(String[] args) {

		//단축키 일괄선택 복사붙여넣기 : alt+shift+a 
		Tv remocon = new Tv();
		int i = remocon.channel;
		boolean b = remocon.power;
		remocon.channelUp();
		remocon.channelDown();
		remocon.power();
		
		CaptionTv cRemocon = new CaptionTv();
		int i2 = cRemocon.channel;
		boolean b2 = cRemocon.power;
		cRemocon.channelUp();
		cRemocon.channelDown();
		cRemocon.power();
		cRemocon.caption();
		
//		참조 변수 t가 사용할 수 있는 멤버 개수가 (CaptionTv보다)적어서 문제가 없다. 
		Tv t = new CaptionTv();
		t.channelUp();
		
//		참조변수 cTv가 사용할 수 있는 멤버 개수가 더 많아서 문제가 발생할 소지가 있다. 
//		CaptionTv cTv = new Tv();	//.caption() 없음 - error
/*		
		즉, 조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있다.
		반대로 자손타입의 참조변수로 조상타입의 인스턴스를 참조할 수 없다. 
		
		그렇다면 인스턴스의 타입과 일치하는 참조변수를 사용하면
		인스턴스의 멤버들을 모두 사용할 수 있을텐데 왜 조상타입의 참조변수를 사용해서 
		인스턴스의 일부 멤버만을 사용하도록 할까?
*/		
		
	}

}
