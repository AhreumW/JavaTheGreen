
public class Car {

//	색상
	String color = "";
//	변속기 종류
	String gearType = "";
//	문의 개수
	int door = 0;
	
	Car(String c, String gear, int d) {	//기능의분리 ** 여기에 syso 적지 말기!!
		//인스턴스 변수 초기화 작업	
		color = c;
		gearType = gear;
		door = d;
	}
	
	void carInfo() {		//출력은 따로~!!
		System.out.println("my car");
 		System.out.println("색상 : "+ color);
 		System.out.println("기어는 : "+ gearType);
 		System.out.println("문 개수 :  "+ door);
	}
	
}
