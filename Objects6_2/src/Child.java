
//	자식클래스 extends 부모클래스
// 다른언어는 되지만 !!!!자바에서 부모는 유일클래스!!!!
public class Child extends Parent{
/*
	부모 자식 관계 
	= 상하관계
	= 상속관계

	조상클래스 - 부모(parent)클래스, 상위(super)클래스, 기반(base)클래스
	자손클래스 - 자식(child)클래스, 하위(sub)클래스, 파생된(derived)클래스
*/
	
	//	Parent.age도 상속받아서 Child에서도 쓸 수 있음
	String name ="";
	
	void play() {
		System.out.println("놀자~~");
	}
	
}
