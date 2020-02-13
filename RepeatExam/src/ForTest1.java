
/**
 * 
 * @author TJ
 * 1부터 10까지 더하는 프로그램을 작성하시오.
 * ================================
 * 1부터 10까지의 합 : 55
 * for문
 */
public class ForTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//누적
		//1~10까지의 합
		int sum = 0;
		
		
		// i는 몇 번? 횟수로써도 쓰임 **
		for(int i = 1; i <= 10 ; i++) {
			System.out.print(i+ "번째 합: \t"+ sum);
			sum = sum + i;
			System.out.println(" + " + i + " = " + sum);	//중간검증 - 과정을 보여주면 신뢰성이 올라감
		}
		System.out.println("1부터 10까지의 합 : "+ sum);
		
		
		
		
		
		
	}

}
