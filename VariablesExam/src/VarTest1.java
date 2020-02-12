import oracle.jrockit.jfr.tools.ConCatRepository;

/* 
 * VariableExam 프로젝트명
 * 2020년을 기준으로 자신의 나이를 출력하시오. 
*/
public class VarTest1 {

	public static void main(String[] args) {
		
		int currentYear = 2020;
		int mybirthYear = 1994;

		int age = currentYear - mybirthYear + 1;
		
		
//		더하기 연산자 + 
//		1. 숫자 연산자 
//		2. 연결
//		숫자 + 숫자 = 숫자
//		숫자 + 문자 = 문자 
//		문자 + 문자 = 문자
//		문자 + 숫자 + 문자
		
//		예시)
//		System.out.println("제 나이는 "+ age + 1 + "살입니다.");
//		결과값 ) 제 나이는 271살입니다.	-> 각 숫자들이 문자로서 연결됨.
//		System.out.println("제 나이는 "+ (age + 1) + "살입니다.");
//		결과값 ) 제 나이는 28살입니다.
//		System.out.println(age + 1 + "살입니다.");
//		결과값 ) 28살입니다.
		
		System.out.println("제 나이는 "+ age + "살입니다.");
		
	}

}
