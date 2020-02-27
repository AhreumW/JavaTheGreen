package com.tg.inter;
/*
	class는 extends	=>	상속한다.	=>	일반화(Generalization)
	interface는 implements	=>	구현한다.	=>	실체화(Realization)
*/
public class Firetruck implements Car{

	@Override
	public void sound() {
//		NUMBER = 234;	//final은 수정 안됨. 불변
		System.out.println("왜왜왜애~앵~");
	}

	@Override
	public void work() {
		System.out.println("물대포!!!!");
	}
	

}
