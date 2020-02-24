/*
	<< 오버로딩 vs 오버라이딩 >>
	오버로딩은 기존에 없는 새로운 메서드를 추가하는 것(new)	/ 같은 클래스 내 - 이름 같고 매개변수타입,개개수 달라야 함.
	오버라이딩은 상속받은 메서드의 내용을 변경하는 것(change, modify)		/ 부모자식 - 이름 같고 매개변수 같고, 반환타입 같아야함.
*/
public class Point3D extends Point{

//	Overriding
//	오버라이딩 ?
//	조상 클래스로부터 상속받은 메서드의 내용을 변경하는 것을 오버라이딩이라고 한다. 
//	상속받은 메서드를 그래로 사용하기도 하지만, 자식 클래스 자신에 맞게 변경해야하는 
//	경우가 많다. 이럴 땐 조상의 메서드를 오버라이딩한다.
	
	int z;
		
//	super() - 조상클래스의 생성자 	/(this()도 있긴 있음)
	Point3D(int x, int y, int z) {
//		super()는 항상 첫 줄에 명시해야 함 , 중간에 쓸 수 없음.
//		super();	//묵시적으로 수행되고 있었음.(항상 부모부터 수행)
		super(2,3);	//부모 Point(int x, int y)생성자가 바뀌면 super()도 바뀌어야함. 
					//최상위 Object클래스까지 불러옴
	
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
/*
	오버라이딩의 조건
	자식 클래스에서 오버라이딩하는 메서드는 부모 클래스의 메서드와 
	- 이름이 같아야 한다. 
	- 매개변수*가 같아야 한다. 
	- 반환타입*이 같아야 한다. 		-> 구현부만 다름
*/
//	String getLocation() {	//오버라이딩
//		return "x : " + x + ", y : "+ y + ", z : "+ z; 
//	}
	
	String getLocation() {	//오버라이딩 + super로 부모메서드 호출
		String msg = "";
		msg = super.getLocation();	//*****
		msg += ", z : "+ z;
		return msg; 
	}
	
}
