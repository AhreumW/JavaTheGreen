
public class TestClass {

	/*
//	클래스(static) 메서드 vs 인스턴스 메서드
	void instanceMethod() {	// 인스턴스 메서드
		
	}
*/

	static void instanceMethod() {	// 인스턴스 메서드
		
	}
	
	static void staticMethod() { // static 메서드
		
	}
	
	void instanceMethod2() {	// 인스턴스메서드
		instanceMethod();	// 다른 인스턴스메서드를 호출한다.
		staticMethod();		// static 메서드를 호출한다. 
	}
	
	static void staticMethod2() { // static 메서드
//		instanceMethod();	//에러!! 인스턴스메서드를 호출할 수 없다.	
		instanceMethod();	//static void instanceMethod()로 변경
		staticMethod();		//static 메서드는 호출할 수 있다. 
	}
	
//	수행순서에 따라 static이 가장 먼저 이루어진다. 
//	그래서 인스턴스를 먼저 생성할 수 없다. 
}
