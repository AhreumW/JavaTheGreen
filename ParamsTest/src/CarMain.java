
public class CarMain {

 	public static void main(String[] args) {
		
 		Car car = new Car("실버","자동", 4);		//언젠가 바뀔수 있는 
 		Car2 car2 = new Car2();					//고정
 		Car2 car3 = new Car2();
 		
 		car.color = "검파랑";
 		
// 		System.out.println("my car");
// 		System.out.println("색상 : "+car.color);
// 		System.out.println("기어는 : "+car.gearType);
// 		System.out.println("문 개수 :  "+car.door);
 		
 		car.carInfo();
 		
 		car2.carInfo();
 		car3.carInfo();
 		
 		
	}
	
}
