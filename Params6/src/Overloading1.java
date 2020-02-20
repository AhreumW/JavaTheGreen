
public class Overloading1 {
/*
	오버로딩(Overloading)
	같은 클래스 내에서 서로 구별될 수 있는 방법이 필요했음
	한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것을 메서드 오버로딩이라 한다. 
	
	오버로딩 조건
	1. 메서드 이름이 같아야 한다.
	2. 매개변수의 개수 또는 타입이 달라야 한다. 
	3. 매개변수는 같고 리턴타입이 다른 경우는 오버로딩이 성립되지 않는다. 
	(리턴타입은 오버로딩을 구현하는데 아무런 영향을 주지 못한다.)

	ex) 두 함수는 매개변수 타입과 개수 일치해서 오버로딩 되지 않는다. 
		int add(int a, int b){	
			return a;
		}
		long add(int x, int y){		//long 상관 X
			return (long)x + y;		//리턴타입은 아무런 영향 X
		}
	
	ex) 두 함수는 오버로딩 된다. - 파라미터 순서에 따라 다른 변수이므로 타입이 다르다. 
		int add(int a, String b){	
			return a;
		}
		int add(String a, int b){	
			return a;
		}
	
	-> 대표적인 오버로딩 메서드로 system.out.print()가 있다. :파라미터 변수 별로 다 있음
*/	
	
	
	
}
