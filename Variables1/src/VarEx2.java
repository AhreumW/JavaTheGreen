
public class VarEx2 {

	public static void main(String[] args) {
//		기본형과 참조형
//		기본형(primitive type)
//		  - 논리형(boolean) : true와 false 중 하나를 값으로 가지며, 조건식과 논리적 계산에 사용된다. 
//			문자형(char) : 문자를 저장하는데 사용되며, 변수 당 하나의 문자만 저장할 수 있다. 
//			정수형(byte, short, int, long) : 정수 값을 저장하는데 사용된다. 주로 사용되는 것은 int와 long이다. 
//			실수형(float, double) : 실수를 저장하는데 사용되며, 주로 double이 사용된다. 
//		  => 기본형은 계산을 위한 실제 값을 저장한다. 
//		참조형(reference type)
//		  - 객체의 주소를 저장한다. 8개의 기본형을 제외한 나머지 타입
	
//		표현범위 
//크기(byte)  1			2		4		8
//			논리형 	- 문자형 	- 정수형 	- 실수형 
//			boolean - char  - int(4)   - float(4)
//			byte 	- short - long(8) - double(8)
			
		boolean check = false;
		char ch = 65;		// "" : 문자열 , '' : 문자
		byte bNum = (byte)128; 	//-128~127		
		int num = 100000;
		//모든 숫자는 int가 기본형
		long lNum = 0L;
		float f = 0.0f;
		double dNum = 0.0;
		
		System.out.println(check);
		System.out.println(ch);
		System.out.println(ch+1);
		System.out.println(bNum);	//-128로 출력 127 +1은 -128로 나옴
		System.out.println(num);
		System.out.println(lNum);
		System.out.println(f);
		System.out.println(dNum);
		
		
//		아스키	->	유니코드 	->  UTF-8
		
	}

}
