import java.util.Scanner;

/**
 * 
 * @author TJ
 * 홀짝 판별 프로그램
 * if else 사용
 * 입력하신 값은 ?
 * 홀입니다.
 * or
 * 짝입니다.
 * 라고 출력
 */
public class FlowTest4 {

	public static void main(String[] args) {
		
//		if else		
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("값을 입력해주세요.");
		num = scan.nextInt();
		
		scan.close();
		
		System.out.println("입력하신 값은 ? "+ num);
		
		if(num % 2 == 1) {
			System.out.println("홀수입니다.");
		}else {
			System.out.println("짝수입니다.");
		}
		
		
	}

}
