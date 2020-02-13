import java.util.Scanner;

/**
 * 
 * @author TJ
 * 2의 배수 출력
 * 2의 배수의 합계를 구한다.
 * 범위 0~10까지 
 * ======================
 * 0 : 0
 * 2 : 2
 * 4 : 6
 * .....
 * 10 : 30
 * 
 */
public class ForTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int startNum = 0;
		int limitNum = 10;
		int cnt = 0; //2배수 카운팅
		
		System.out.println("2의 배수 합 구하기 프로그램");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("몇부터  몇까지 구하시겠습니까?(0부터 시작가능)");
		int temp1 = scan.nextInt();
		int temp2 = scan.nextInt();
		if(temp1 < temp2) {
			startNum = temp1;
			limitNum = temp2;
		}else if(temp1 > temp2) {
			startNum = temp2;
			limitNum = temp1;
		}else {
			startNum = temp1;
			limitNum = temp2;
		}
		
		System.out.println(startNum +"부터 "+limitNum+"까지 2배수의 합계를 구하겠습니다.");
		System.out.println("2배수 숫자 : 누적합계");
		
		for(int i =startNum; i<= limitNum; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
				System.out.println( i +" : "+ sum);
				cnt++;
			}
		}
		System.out.println("총합은 "+sum);
		System.out.println("합한 2의배수 갯수는 : "+cnt);
		
	}

}
