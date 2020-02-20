//MethodFlowTest2.java와 함께 참고
public class FirstClass2 {

	void firstMethod() {
		secondMethod();
	}
	
	void secondMethod() {
		thirdMethod();
	}
	
	void thirdMethod() {
		System.out.println("thirdMethod() 수행");
	}
	
}
