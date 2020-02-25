package edu.tg.util;

public class Point {
	
	int x; 
	int y;
	
	public Point(){	//자식클래스 생성자에서 super()
		
	}
	
	Point(int x, int y){	//자식클래스 생성자에서 super(1,4)
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x : " + x + ", y : "+ y; 
	}
}
