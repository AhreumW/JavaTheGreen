package com.tg.tryy;

public class ExceptionEx2 {
	
//	try - catch문 흐름
	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);	//0으로 나누어서는 안된니다.(에러)
			System.out.println(4);		//건너뛰고 바로 catch문으로
		} catch (ArithmeticException e) {
			System.out.println(5);		//에러발생시 이곳으로 옴
		}
		System.out.println(6);
		
		
		
	}

}
