import java.util.Scanner;

/**
 * 
 * @author TJ
 * 음수 양수 구분 프로그램
 * 사용자가 입력한 숫자에 대해 판단해준다. 
 * 4번 시도할 수 있다. => 4번 시도후 프로그램 종료 
 * ===================================
 * 사용자가 입력한 숫자 ?
 * 음수
 * or
 * 양수 
 */
public class ForTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		double inputNum = 0;
		int limitNum = 3; //제한 횟수
		int cnt = 0; // 횟수 카운팅
		
		System.out.println("음수 양수 구분 프로그램 ("+limitNum+"회 제한)");
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < limitNum; i++) {
			
			System.out.println("숫자를 입력해주세요.("+(limitNum-cnt)+"회 남았습니다.)");
//			inputNum = scan.nextInt();
			inputNum = scan.nextDouble();
			
			cnt++;
			
			if(inputNum > 0) {
				System.out.println("입력하신 "+ inputNum + "은(는) 양수입니다.");
			}else if(inputNum < 0) {
				System.out.println("입력하신 "+ inputNum + "은(는) 음수입니다.");
			}else if(inputNum == 0) {
				System.out.println("0은 양수 음수에 포함되지 않습니다.");
			}else {
				System.out.println("숫자를 다시 확인해주세요.");
			}
			System.out.println();
		}
		
		if(cnt == limitNum) {
			System.out.println("다시 찾고 싶다면 프로그램을 재실행시켜주십시오.");
		}
		
	}

}
