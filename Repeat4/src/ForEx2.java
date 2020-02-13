import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		3의 배수 찾기
		int inputNum = 0;
		int limitNum = 5; //제한 횟수
		int cnt = 0; // 횟수 카운팅
		
		System.out.println("3의 배수 찾기 프로그램 ("+limitNum+"회 제한)");
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < limitNum; i++) {
			
			System.out.println("숫자를 입력해주세요.("+(limitNum-cnt)+"회 남았습니다.)");
			inputNum = scan.nextInt();
			cnt++;
			
			if(inputNum % 3 == 0) {
				System.out.println("입력하신 "+ inputNum + "은(는) 3의 배수입니다.");
			}else {
				System.out.println("입력하신 "+ inputNum + "은(는) 3의 배수가 아닙니다.");
			}
			System.out.println();
		}
		
		if(cnt == limitNum) {
			System.out.println("다시 찾고 싶다면 프로그램을 재실행시켜주십시오.");
		}
		
		
	}

}
