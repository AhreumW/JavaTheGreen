/*
	오버라이딩
	 - 접근 제어자는 조상 클래스의 메서드보다 좁은 범위로 변결 할 수 없다. 
*/
public class Child extends Parent{

//	부모클래스Parent의 method()의 접근제어자가 public이므로
//	자식의 method() 또한 public이어야 한다.(더 작을 수 없음.)
//	void method() {		-> Error
	public void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
	
}
