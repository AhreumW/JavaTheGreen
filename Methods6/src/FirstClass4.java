//MethodFlowTest4.java와 함께 참고
public class FirstClass4 {

	void firstMethod() {
		secondMethod();
	}
	
	void secondMethod() {
		System.out.println("secondMethod() 시작");
		thirdMethod();
		System.out.println("secondMethod() 수행");
	}
	
	void thirdMethod() {
		System.out.println("thirdMethod() 수행");
	}
	
}
