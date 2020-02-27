package com.tg.abst.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Tv tv = new Tv();	//abstract클래스는 미완성이라 new 할 수 없음

//		MuteTv mtv = new MuteTv();	//상속을 통해 구체화.
//		mtv.power();
		
		
		CaptionTv ctv = new CaptionTv();
		ctv.power();
		ctv.info();
		
		
	}

}
