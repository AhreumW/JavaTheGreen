import java.util.Scanner;

/**
 *  
 */

public class ForEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		String inputStr = "";
		
		while(true) {
			System.out.println("안녕");
			System.out.println("입력>> (y는 종료야)");
			
			inputStr = scan.nextLine();
			if(inputStr.equals("y")) {	//키보드입력은 "y"==inputStr가 false임** ->즉 equals 사용
				break;
			}
			System.out.println(inputStr);
		}
		System.out.println("잘가세요.");
		
	}

}
