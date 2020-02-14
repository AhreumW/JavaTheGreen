import java.util.Scanner;

/**
 * @author TJ
 * 주제 : 1과 100사이의 숫자 중 정답맞추기
 *
 * 단계별 검증 작업
 * 순서도 
 *
 * 시작!		
 * 정답 숫자			int answer = 정답숫자; 
 * 맞는지 확인		boolean check = 맞는지 확인;
 * 축하 메세지 		String conMsg = "축하해 맞췄어";
 * 실패 메세지		String failMsg = "힣힣 틀렸당";
 * 유저가 선택한 숫자		in userSelectNum = 유저선택숫자;
 * 
 * 정답 숫자를 정한다.	Answer = 50;
 * 정답을 맞춰볼래?		
 * 사용자가 값을 입력한다. 	userSelectNum = 숫자입력
 * 			
 * 조건 
 * 일치하는가? y/n		y면 출력	
 * 			n이면 이전으로 되돌아감 syso(failMsg); 
 * 
 * 메세지 출력 		syso(conMsg);
 * 종료 
 * 
 */
public class ForTest13 {
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userSelectNum = 0;
		int answer = 0;
		//false라면 재시도, true라면 성공
		boolean check = false;					//기본값은 결과에 영향을 주지않도록 설정
		Scanner scan = new Scanner(System.in);
		
		
		answer = (int)(Math.random() * 100) + 1; 			//행동이 먼저
		System.out.println("상대방이 숫자를 선택했습니다.");		//출력이 나중
		System.out.println("1~100 사이니 맞춰보세요.");
		
		check = true;
		while(check) {			//while(!check) { 이렇게하면 속도가 빠르지만 수업에선 X
			System.out.print("1과 100사이의 정수를 입력하세요.>> \t ");
			userSelectNum = scan.nextInt();
			
			if(userSelectNum > answer) {
				System.out.println("더 작은 수로 다시 시도해주세요.");
			}else if(userSelectNum < answer) {
				System.out.println("더 큰 수로 다시 시도해주세요.");
			}else if(userSelectNum == answer) {
				System.out.println("와우 정답입니다.");
				check = false;
			}
		}
		
		
		
		
	}

}
