/**
 * 
 * @author TJ
 * 100, 81, 100, 100, 93, 17
 * 81.83333333333.....
 * 총점과 평균을 구하시오. 
 * 평균은 소수점 3째자리에서 반올림하시오.
 * 총점	: 평균 
 * ??	: ???
 * 
 */

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		int[] scoreArr = new int[5];
		int[] scoreArr = {100, 81, 100, 100, 93, 17};
		int sum = 0;		// int / int =int
		//기본값 사용 권장 : double 		//float는 앱이나 do-while경우에 씀
		double avg = 0;		// int / double = double
		
		for(int i=0; i<6; i++) {
			sum = sum + scoreArr[i];
		}
		
		/*
		 * 컴퓨터는 타입을 먼저 파악하게 된다.
		 * 타입 / 타입 
		 * 정수 / 정수 = 정수 
		 * 정수 / 실수 = 실수
		 */
		avg = sum / 6.0 ;	//81.83333...
		//avg = 81.8399; 	//반올림될 경우
		avg = (int)(avg * 100 + 0.5) / 100.0; 		//반올림을 위해 + 0.5	(ex 8183.x vs 8184.x)
		//변수랑 나누는거랑 float이든 double이든 맞춰야함.
		//f, d는 일치 안시키면 부동소수점때문에 다른값이 나오기 쉬움
		
		/* 
		 * 생각방식 (-> 증명에 특화)
		 * 
		 * avg = sum;	//평균
		 * 두자리 숫자까지 구할 로직 => 자릿수 올리기
		 * 반올림 처리
		 * 실수부 버리기
		 * 자릿수 되돌리기 => 소수점 셋째 자리에선 반올림 결과
		 * */
		
		
		System.out.println("총점\t:\t평균");
		System.out.println(sum+"\t:\t"+avg);
	}

}
