import java.util.Scanner;

/**
 * 
 * @author TJ
 * 사계절 표현 프로그램
 * 
 * 숫자 월 를 입력받아
 * 봄여름가을겨울을 표시하시오. 
 */
public class FlowTest8_2 {

	public static void main(String[] args) {
		

		int month = 0;
		String season = "";
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("해당 월을 입력해주세요.");
		month = scan.nextInt();
		boolean check = true; 
		
		switch(month) {
			case 12 : case 1: case 2: 
				System.out.println("");
				break;
			case 3 : case 4: case 5: 
				System.out.println("");
				break;
			case 6 : case 7: case 8: 
				System.out.println("");
				break;	
			case 9 : case 10: case 11: 
				System.out.println("");
				break;	
		}
		
		
		
		
		
	}

}
