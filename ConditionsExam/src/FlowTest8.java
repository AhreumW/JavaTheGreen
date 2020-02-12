import java.util.Scanner;

/**
 * 
 * @author TJ
 * 사계절 표현 프로그램
 * 
 * 숫자 월 를 입력받아
 * 봄여름가을겨울을 표시하시오. 
 */
public class FlowTest8 {

	public static void main(String[] args) {
		

		int month = 0;
		String season = "";
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("해당 월을 입력해주세요.");
		month = scan.nextInt();
		
		String seasonCode = "";
		
		if(month >= 1 && month <= 12) {				// boolean 변수를 둬서 switch문에서 default인 경우로 해결시킴 
			
			if(month == 1 || month == 2 || month == 12) {
				seasonCode = "A";
			}else if(month >=3 && month <= 5) {
				seasonCode = "B";
			}else if(month >=6 && month <= 8) {
				seasonCode = "C";
			}else if(month >=9 && month <= 11) {
				seasonCode = "D";
			}
		
			
			switch (seasonCode){
				case "A":					//case 1: case 2: case 3: 같이 조건을 이어서 쓸 수 있음
					season = "겨울";
					break;
				case "B":
					season = "봄";
					break;
				case "C":
					season = "여름";
					break;
				case "D":
					season = "가을";
					break;
				default:		
					System.out.println("에러");
					break;
			}
		
			System.out.println(month+"월은 "+season+"입니다.");
		
		}else {
			System.out.println("월은 1월부터 12월까지 입니다.");
		}
		
		
		
		
	}

}
