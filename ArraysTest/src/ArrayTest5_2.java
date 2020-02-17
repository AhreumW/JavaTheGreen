import java.util.Scanner;

/**
 * @author TJ
 * 사용자의 숫자를 입력받는다.
 * 
 * 순서는 국어, 영어, 수학이다. 
 * 국영수 중에 점수가 제일 높은 순으로 출력해라. 
 * 단, 3과목의 점수는 배열 변수 하나에 담겨있다.
 * ===================
 * 100 81 93
 * 
 * 100 93 81
 */
public class ArrayTest5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		int[] scoreArr = new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 영어 수학 점수를 차례로 입력해주세요.");
		
//		//입력한 값 점수배열로 저장
//		for(int i =0; i<3; i++) {		
//			scoreArr[i] = scan.nextInt();
//		}
//		
		
		scoreArr[0] = 15;
		scoreArr[1] = 11;
		scoreArr[2] = 1;
		scoreArr[3] = 3;
		scoreArr[4] = 8;
		
		//배열 출력
		System.out.print("정렬 전 :");
		for(int i =0; i<scoreArr.length; i++) {		
			System.out.print(" "+ scoreArr[i]);
		}
		System.out.println();
		
		
		// 정렬 후 
		// 100 90 80 : 내림차순
		// 기본 정렬 (각자 다 돌음)
		int change = 0;
		int tempScore = 0;
		for(int i = 0; i < scoreArr.length; i++) {	
			for(int n = 0; n < scoreArr.length; n++) {	
				if(scoreArr[i] > scoreArr[n]) {
					tempScore = scoreArr[i];
					scoreArr[i] = scoreArr[n];
					scoreArr[n] = tempScore;
					change++;
				}
				cnt++;
				System.out.println();
				System.out.println("횟수 : "+ cnt);
				//System.out.println(scoreArr[i] + " : "+ scoreArr[n]);
				//한번 수행하면 어떻게 될까?
				for(int k =0; k<scoreArr.length; k++) {		
					System.out.print(" "+scoreArr[k]);
				}
			}//내부 for end
		}//바깥 for end
		
		System.out.println();
		System.out.println("교환횟수 : "+ change);
		System.out.print("점수 정렬한 값 :");
		for(int i =0; i<scoreArr.length; i++) {		//정령한 점수 출력
			System.out.print(" "+scoreArr[i]);
		}
		
		
	}

}
