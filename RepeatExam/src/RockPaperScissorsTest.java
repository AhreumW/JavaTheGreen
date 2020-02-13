import java.util.Scanner;

/**
 * 
 * @author TJ
 * 가위바위보 게임
 */
public class RockPaperScissorsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int user = 0;	//사용자 선택
		int com = 0;	//컴퓨터 선택

		int gameCnt = 0; //게임 횟수
		int cnt = 0;	 //카운팅
		
		int win = 0;	//승
		int tie = 0;	//무
		int loss = 0;	//패
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가위바위보 몇 판 하시겠습니까?");
		gameCnt = scan.nextInt();
		
		for(int i = 0; i<gameCnt; i++) {
			cnt++;
			System.out.println(cnt+"째판");
			System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.");
			user = scan.nextInt();
			
			
			com = (int)(Math.random() * 3 ) + 1 ;
			System.out.println("컴퓨터도 선택했습니다.");
			
			String userChoiceStr = "";
			switch (user) {
				case 1:
					userChoiceStr = "가위";
					break;
				case 2:
					userChoiceStr = "바위";
					break;
				case 3:
					userChoiceStr = "보";
					break;
				default:
					userChoiceStr = "반칙";
					break;
			}
			String comChoiceStr = "";
			switch (com) {
				case 1:
					comChoiceStr = "가위";
					break;
				case 2:
					comChoiceStr = "바위";
					break;
				case 3:
					comChoiceStr = "보";
					break;
				default:
					break;
			}
			
			System.out.println("당신은 " + userChoiceStr + "입니다.");
			System.out.println("com은 "+ comChoiceStr + "입니다.");
			
			String msgstr = ""; 
					
			switch(user - com) {
				case 2: case -1:			// 1-2 ,2-3 ,3-1
					msgstr = "당신이 졌습니다.";
					loss++;
					break;
				case 1: case -2:			// 1-3 ,2-1 ,3-2
					msgstr = "당신이 이겼습니다.";
					win++;
					break;
				case 0:
					msgstr = "비겼습니다.";
					tie++;
					break;
				default:
					msgstr = "반칙을 쓰셨으므로 반칙패하셨습니다.";
					loss++;
					break;
			}
			
			System.out.println(msgstr);
			System.out.println();
			
		}
		
		System.out.println("결과 : 총 "+win+"승 "+tie+"무 "+loss+"패 입니다.");
		
		
	}

}
