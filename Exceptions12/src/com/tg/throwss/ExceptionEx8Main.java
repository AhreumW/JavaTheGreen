package com.tg.throwss;

public class ExceptionEx8Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Test1 test1 = new Test1();
		
//		main메서드 throws Exception이면 자동적으로 상위시스템 JVM으로 가서 처리됨
//		이 경우 마지막 syso("종료됨")은 수행되지 않음
		test1.method1();	

/*
		//.method1() throws Exception는
		//호출한 곳에서 try-catch문으로 처리해야 한다. 
		try {
			test1.method1();	
			System.out.println("예외생기면 건너뜀");
		} catch (Exception e) {
			System.out.println("예외처리됨");
		}
*/		
		System.out.println("종료됨");
	}

}
