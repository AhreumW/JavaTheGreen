package com.tg.third;
/*
접근 제어자? (access modifier)
		접근제어자는 멤버 또는 클래스에 사용되어, 해당하는 멤버 또는 클래스를 외부에서 
		접근하지 못하도록 제한하는 역할을 한다. 
		접급 제어자가 default임을 알리기 위해 실제로 default를 붙이진 않는다. *(명시하면 에러남)
		클래스나 멤버변수, 메서드, 생성자에 접근 제어자가 지정되어 있지 않다면, 
		접근 제어자가 default임을 뜻한다. 
*/		
/*
			같은클래스		같은패키지		자손클래스		전체
public		O			O			O			O
protected	O			O			O			X
default		O			O			X			X
private		O			X			X			X

		private - 같은 클래스 내에서만 접근이 가능하다.
		default - 같은 패키지 내에서만 접근이 가능하다.	//지역변수로 많이 씀
		protected - 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근이 가능하다.
				//extend Parent로 상속받았을 때 , 메서드에서 부모클래스를 매개변수로 받는거랑 상속으로 받는 거랑 다름
		public - 접근 제한이 전혀 없다. 
*/
// 캡슐화 (encapsulation)
public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	Time(int hour, int minute, int second){	//default 묵시적 (명시적으론 쓸 수 없음)
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	//해킹 등을 막기 위한 직접적인 접근을 막고
	//보안을 지키면서 코딩을 하면서도 변수를 가져가 쓸 수 있도록
	//getter, setter 패턴을 사용	-> 캡슐화
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour){
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute){
		this.minute = minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second){
		this.second = second;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}
	
	
}
