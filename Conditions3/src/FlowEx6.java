import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//다중 if문, 중첩 if문
		int score = 0;
		String grade = "N";		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		score = scan.nextInt();

		
		if(score >= 90) {
			grade = "A";
			if(score >= 98) {
				grade += "+";
			}
		}else if(score >= 80) {				
			grade = "B";
			if(score >= 88) {
				grade += "+";			//사실 +=보단
			}else if(score < 84) {
				grade = grade + "-";	//이게 더 가독성이 높음
			}
		}else if(score >= 70) {
			grade = "C";
		}else {
			grade = "F";
		}
		
		System.out.println("당신의 점수는 "+score);
		System.out.println("학점은 "+grade+"입니다.");
		
	
		
	}

}
