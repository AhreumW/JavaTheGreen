import java.util.Scanner;

/**
 * 
 * @author TJ
 * 
 */
public class RockPaperScissorsMain {

	public static void main(String[] args) {
		
		
		int user = 0;
		int com = 0;

		Scanner scan = new Scanner(System.in);
		
		
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
				break;
			case 1: case -2:			// 1-3 ,2-1 ,3-2
				msgstr = "당신이 이겼습니다.";
				break;
			case 0:
				msgstr = "비겼습니다.";
				break;
		}
		
		System.out.println(msgstr);
		
	}

}
