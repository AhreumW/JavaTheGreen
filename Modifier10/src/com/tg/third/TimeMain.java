package com.tg.third;


public class TimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time time = new Time(12, 35, 30);
		
		System.out.println(time);
//		time.hour = 13; 		//private이라서 같은클래스가 아니라서 접근이 X
								//-> 직접적인 접근이 막힘.
		time.setHour(13); 		
		time.setHour(15);
		
		System.out.println(time);
		
		
	}

}
