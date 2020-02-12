import java.util.Scanner;

/**
 * 
 * @author TJ
 * 성적 처리 프로그램
 * 90점 이상이면 A학점
 * 80점 이상이면 B학점
 * 70점 이상이면 C학점
 * 그 외는 F학점 
 * =====================
 * 당신의 점수는 70
 * 당신의 학점은 C입니다.
 */
public class FlowTest5 {

	public static void main(String[] args) {
		

		int score = 0;
		char grade = 'N';		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		score = scan.nextInt();

		
		if(score >= 90) {
			grade = 'A';					//syso가 아닌 변수 사용으로 코드 깨끗해짐(가독성 up)
		}else if(score >= 80) {				//어차피 1단계 후 패스되니까 < 90 조건 안써도 됨
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else {
			grade = 'F';
		}
		
		System.out.println("당신의 점수는 "+score);
		System.out.println("학점은 "+grade+"입니다.");
		
	}

}
