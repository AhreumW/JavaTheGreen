// 클래스(static) 메서드 vs 인스턴스 메서드

/*	
 * 실행 순서		1					2						3
		static(class)		|	heap area			|	stack area  
							|						|	
	cv; 스태틱 변수 생성			|iv; 인스턴스 변수 생성		|
	staticMethod();			|instanceMethod();		| 
							|						|
	
	static메서드에서는 iv가 new가 되어서 생성됐는지 아닌지 때마다 다르니까
	아예 인스턴스변수를 사용하지 못하도록 막음. (메서드도 마찬가지로 안됨!)
		
*/	


public class TestClass2 {
	int iv;				//인스턴스 변수
	static int cv;		//스태틱 변수
	
	void instanceMethod() {		// 인스턴스메서드
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod() { 	// static 메서드
//		System.out.println(iv);		//에러. 인스턴수 변수를 사용할 수 없다. 
		System.out.println(cv);
	}

	static void staticMethod2() { 	// static 메서드
		staticMethod();
	}

}
