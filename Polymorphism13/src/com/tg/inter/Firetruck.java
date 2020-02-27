package com.tg.inter;

import java.util.Iterator;
//import java.lang.*;		//java.lang.*는 묵시적으로 자동 import 됨


/*
	class는 extends	=>	상속한다.	=>	일반화(Generalization)
	interface는 implements	=>	구현한다.	=>	실체화(Realization)
*/	
//인터페이스는 다중상속이 가능함, 하지만 단일상속을 추구 / extends는 유일상속
public class Firetruck implements Car, Iterable{	
	
	@Override
	public void sound() {
//		NUMBER = 234;	//final은 수정 안됨. 불변
		System.out.println("왜왜왜애~앵~");
	}

	@Override
	public void work() {
		System.out.println("물대포!!!!");
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
