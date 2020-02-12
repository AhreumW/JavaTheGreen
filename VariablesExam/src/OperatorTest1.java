
public class OperatorTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		올림 처리
		float pi = 3.14102f;
		
//		소수점 2째자리까지 표현, 3번째 자리에서 올림처리 
//		(int)(원본값 * 자릿수 + 0.9) / 되돌릴 자릿수  => 자릿수 내림
		float shortPi = (int)(pi * 100 + 0.9) / 100f;
		
		System.out.println(shortPi);
		
		System.out.println(Math.round(pi*100)/100.0);
	}

}
