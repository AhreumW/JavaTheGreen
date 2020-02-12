import java.util.Scanner;

/**
 * 
 * @author TJ
 * 성적 처리 프로그램
 * 100~90점 이상이면 A학점
 * 90점미만 80점 이상이면 B학점
 * 79점이하 70점 이상이면 C학점
 * 그 외는 F학점 
 * =====================
 * 당신의 점수는 70
 * 당신의 학점은 C입니다.
 */
public class FlowTest6 {

	public static void main(String[] args) {
		

		int score = 0;
		char grade = 'N';		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		score = scan.nextInt();

		scan.close();
		
		if(score <= 100 && score >= 90) {	// && 안써도 같은 결과, 속도저하
			grade = 'A';					
		}else if(score < 90 && score >= 80) {				
			grade = 'B';
		}else if(score <= 79 && score >= 70) {
			grade = 'C';
		}else {
			grade = 'F';
		}
		
		System.out.println("당신의 점수는 "+ score);
		System.out.println("학점은 "+ grade +"입니다.");
		
	}

}
