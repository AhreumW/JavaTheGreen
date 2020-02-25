package com.tg.second;
/*
final? 
		- 마지막의, 변경될 수 없는 
		- final이 사용될 수 있는 곳 : 클래스, 메서드, 멤버변수, 지역변수
*/

//final class : 절대 재정의 할 수 없음, 절대 부모가 될 수 없음
final class FinalTest {		
	
//	상수 final
	final int MAX_SIZE = 100;		// _ 파스칼표기법
//	final static int fs_MAX_SIZE = 100;	 //final static -> 전체적 범위의 불변!
	
	final int max() {		//절대 재정의할 수 없는 메서드
		final int tempNum = 0;
//		MAX_SIZE = 20;		//final 변수는 절대 변경할 수 없음!
//		tempNum = 10;		//또한 마찬가지로 변경X
		return tempNum;
	}
}
