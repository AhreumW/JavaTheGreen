
public class StaticMethod {

/*
	static 메서드
	
	스태틱 메서드가 먼저 생성되고 그 후에 인스턴스 메서드 생성
	스태틱메서드 내에서 -> 인스턴스 메서드, 인스턴스 변수는 -> 에러
	스태틱메서드 내에서 -> 스태틱 메서드, 스태틱 변수는 -> 가능
	인스턴스메서드 내에서 -> 스태틱 메서드, 스태틱 변수는 -> 가능
	인스턴스메서드 내에서 -> 인스턴스 메서드, 인스턴스 변수는 -> 가능
	
	메인함수에서 
	클래스 변수를 가져올 때 그 클래스의 함수 바깥의 syso와 연산식들은 아예 사용 불가 -> 에러
	new로 생성하지 않고 인스턴스 변수의 메서드 사용 불가 -> 에러
	main(){
		GlobalLocalTest.localMethod(); -> 이 자체가 에러 
		GlobalLocalTest glt = new GlobalLocalTest();
		
		syso(glt.var)	 -> 에러
		syso(glt.var2)	 -> 가능
	}
	
	GlobalLocalTest(){
		int var = 3;
		static int var2 = 7;
		 
		localMethod(){
			지역변수
			syso	-> 사용가능
			연산식 	-> 사용가능
		}
		syso	-> 에러
		연산식 	-> 에러
	}
	 
	
 */
}
