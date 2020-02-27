package com.tg.check;


//extends implements 다 할 수 있음
public class Firetruck implements Car{	
	
	@Override
	public void sound() {
		System.out.println("왜왜왜애~앵~");
	}

	@Override
	public void work() {
		System.out.println("물대포!!!!");
	}

	

}
