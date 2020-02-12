
public class OperatorEx5 {

	public static void main(String[] args) {

//		선언 방식
//		int num;		//c는 아무값이라도 들어가지만 java는 에러 
//		int num = 0;	//초기화
//		int num = 12 + 1234;	//선언과 연산 동시 - 지양, 가독성이 떨어질 수 있음
		
//		나머지 연산자 - %
		int share = 0;
		int remain = 10 % 8;
		
		share = 10 / 8;
		
		System.out.println("10을 8로 나누면, ");
		System.out.println("몫은 "+share+"이고, 나머지는 "+ remain+ "입니다.");
		
		
		
	}
}
