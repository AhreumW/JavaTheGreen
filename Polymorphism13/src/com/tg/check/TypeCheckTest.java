package com.tg.check;

//instanceof : 참조형을 체크한다. 
public class TypeCheckTest {

	public static void main(String[] args) {
		
		Firetruck f = new Firetruck();
		
		if(f instanceof Car) {	//인터페이스도 true
			System.out.println("f는 Car의 자식이다.");
		}
		
		if(f instanceof Firetruck) {	//구현해도 true
			System.out.println("f는 Firetruck의 구현했다.");
		}
		/*
		if(f instanceof Ambulance) {	//Firetruck는 Ambulance과 관련이 없다.
			System.out.println("f는 Ambulance을 구현했다.");
		}
		*/
		if(f instanceof Object) {	//부모상속도 true
			System.out.println("f는 Object클래스의 자식이다.");
		}
		
	}
}
