package com.tg.tryy;

//try - catch - finally문
public class ExceptionEx5 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);	
			System.out.println(4);		
		} catch(ArithmeticException e) {	//끝나도 빠져나가지않고 finally로 
			System.out.println("ArithmeticException");
		} finally {		//try-catch문이 끝나면 무조건 finally문이 수행됨~!!(예외여부상관X)
			System.out.println(6);
			//finally : 예기치않는 종료상황에 의한 백업 등으로 쓰임
		}
		
		System.out.println(7);
		
	}
	
	
}
