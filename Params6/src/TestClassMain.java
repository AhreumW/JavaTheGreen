
public class TestClassMain {

	public static void main(String[] args) {
		
		TestClass testClass = new TestClass();		// new로 생성하고 나서야 
		testClass.instanceMethod2();				//인스턴스 사용가능
		
		//static메서드는 new로 생성하지 않아도 바로 사용 가능 - static이 가장먼저 생성되기 때문
		TestClass.staticMethod();
		TestClass.staticMethod2();
		
		
		
	}
}
