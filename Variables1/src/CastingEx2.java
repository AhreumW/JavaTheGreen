
public class CastingEx2 {
	//단축키 
	//카피라인
	//ctrl + alt + down
	
	public static void main(String[] args) {
		
//		자동형변환
//		묵시적, 명시적 
//		1. boolean을 제외한 나머지 7개의 기본형은 서로 형변환이 가능하다. 
//		2. 기본형과 참조형은 서로 형변환 할 수 없다. 
//		3. 서로 다른 타입의 변수간의 연산은 형변환을 하는 것이 원칙이지만, 
//		      값의 범위가 작은 타입에서 큰 타입으로의 형변환은 생략할 수 있다. 
		
		int num = 0;
		long bigNum = 0;
		
//		float, double에게 0.0은 완벽한 0이 아니라 0에 무한히 가까워지는 어떠한 숫자이다. 
		float tinyNum = 0.0f;
		double d = 456789456123456789.5645432;
		
//		num = bigNum;
		bigNum = num;
		
		tinyNum = (float)0.123465789456123789;
		d = 0.123456789456123459;
		System.out.println(tinyNum);
		System.out.println(d);
		
//		tinyNum = d;
//		d = tinyNum;
		
//		같은 8바이트여도 정수 / 실수의 차이 
//		bigNum = d;
		d = bigNum;
		System.out.println(d);
		
	}

}
