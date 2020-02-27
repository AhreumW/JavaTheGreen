package com.tg.polymorphism;

/*
참조변수의 형변환(Casting)
	기본형 변수와 같이 참조변수도 형변환이 가능하다. 
	단, 서로 상속관계에 있는 클래스 사이에서만 가능하기 때문에 
	자식타입의 참조변수를 부모타입의 참조변수로, 
	부모타입의 참조변수를 자식타입의 참조변수로 형변환만 가능하다. 
*/
public class CarTest {

	public static void main(String[] args) {
/*		
		down casting
		큰 그릇 -> 작은 그릇 : 손실이 일어난다, 감안하고 하겠다는 의지 표명 -> 명시적 형변환 (생략불가)
		up casting
		작은 그릇 -> 큰 그릇 : 모두 담을 수 있다. -> 묵시적 형변환 (생략가능)
*/
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		Ambulance a = new Ambulance();
		//Ambulance와 FireEngine은 서로 아무 관계가 없으므로 캐스팅이 안된다.(부모자식X,자바는 형제도 없음)
//		fe = (FireEngine)a;	
//		a = (Ambulance)fe;
		
		car = fe;		 //(Car)fe; 묵시적 형변환, 업캐스팅 
		fe2 = (FireEngine)car;	//명시적 형변환, 다운캐스팅 
		
		fe.water();
		car = fe;
//		car.water();	//car엔 .water()없음, 즉 접근X
		car.drive();
		
		fe2 = (FireEngine)car;
		fe2.water();
		
//		int a = 0; 
//		double b;
//		b = a;
//		a= (int) b;
	}
}
