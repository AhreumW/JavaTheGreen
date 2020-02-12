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
		
		
		System.out.println("당신은" + user + "입니다.");
		System.out.println("com은"+ com + "입니다.");
		
		String msgstr = ""; 
				
		switch(user - com) {
			case 2: case -1:
				msgstr = "당신이 졌습니다.";
				break;
			case 1: case -2:
				msgstr = "당신이 이겼습니다.";
				break;
			case 0:
				msgstr = "비겼습니다.";
				break;
		}
		
		System.out.println(msgstr);
		
	}

}
