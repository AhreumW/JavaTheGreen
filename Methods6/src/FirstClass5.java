//MethodFlowTest5.java와 함께 참고
public class FirstClass5 {

	void firstMethod() {
		secondMethod();
	}
	
	void secondMethod() {
		fourth();
	}
	
	void thirdMethod() {
		fourth();
	}
	
	void fourth() {
		System.out.println("fourth() 시작");
		System.out.println("fourth() 끝");
	}
	
}
