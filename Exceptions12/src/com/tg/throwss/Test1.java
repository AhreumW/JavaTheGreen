package com.tg.throwss;

//try-catch, throw, throws
public class Test1 {
/*
	void method1() throws Exception{
		try {		//내부에서 처리했다 하더라도 에러가 생기면 상위로 올라가는 구조(컴파일에러)
			throw new Exception();		//exception 한번에 발생시키는 문장
		} catch (Exception e) {			//근데 만약 내부에서 잡히면 try나머지도 수행하며 상위catch는 수행하지 않음
			System.out.println("void method1() 메서드에서 예외가 처리되었습니다.");
		}
	}
*//*	
	throws?
			예외를 메서드의 throws에 명시하는 것은 
			예외를 처리하는 것이 아니라, 
			자신(예외가 발생할 가능성이 있는 메서드)을 
			호출한 메서드에게 예외를 전달하여 예외처리를 떠맡기는 것이다. 
*/	
	//예외처리 명령어 선언
	//Exception이라는 예외가 발생할수도 안할수도있는데 그 문제를 다음으로 던진다.
	void method1() throws Exception{	//스택 바로 상위로 올라감
		System.out.println("나 수행함");
		throw new Exception();
	}

}
