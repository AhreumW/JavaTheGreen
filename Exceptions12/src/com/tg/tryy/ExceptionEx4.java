package com.tg.tryy;

public class ExceptionEx4 {
	
//	try - catch문 흐름
	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);	
			System.out.println(4);		
		} catch(ArithmeticException e) {	//여기서 수행되면 try-catch문 빠져나감
			System.out.println("ArithmeticException");
			e.printStackTrace();
		} catch(Exception e) {			
			System.out.println("Exception");		
		}
		//Exception e ->ArithmeticException e로 쓰면 컴파일에러에 걸림
		//Exception이 상위클래스이므로 시행순서에 따라 ArithmeticException 밑에 위치한다.
		System.out.println(6);
		
		
		
	}

}
