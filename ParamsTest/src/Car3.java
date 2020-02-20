
public class Car3 {

	String color = "";	 	//인스턴스 변수
	String gearType = "";	 
	int door = 0;	 
/*	 
//	this에 대해 배우자
	this?
			인스턴스 자신을 가리키는 참조변수
			인스턴스의 주소가 저장되어 있다. 
			모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재한다.
*/
	Car3(String color, String gearType, int door) { 	//지역변수,매개변수
//		color = color;		//지역변수 = 지역변수  
		this.color = color;	//인스턴스변수 = 지역변수	: 대입O
		this.gearType = gearType;
		this.door = door;
		System.out.println("생성자의 주소값 : "+ this);
	}
	
//	void의 리턴 타입은 return;		
	void carInfo() {		 
		System.out.println("메서드 상의 주소값 : "+ this);
		System.out.println("my car");
 		System.out.println("색상 : "+ this.color);
 		System.out.println("기어는 : "+ gearType);
 		System.out.println("문 개수 :  "+ door);
// 		return; 	//묵시적
	}
/*	
	즉, Car3 car와 this와 메서드 상의 주소값 모두 일치한다. = 같은 애
*/	
	
	void carInfo(String color, int door) {	
		this.color = color;
		this.gearType = gearType;	//파라미터,지역변수가 명시되지 않으면 인스턴스 변수까지 올라가 찾아서 가져옴
		this.door = door;
		
		System.out.println("메서드 상의 주소값 : "+ this);
		System.out.println("my car");
 		System.out.println("색상 : "+ this.color);
 		System.out.println("기어는 : "+ this.gearType);
 		System.out.println("문 개수 :  "+ door);
	}
	

}
