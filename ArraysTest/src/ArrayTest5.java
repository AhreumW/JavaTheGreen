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
public class ArrayTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt =0; 
		int[] scoreArr = new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 영어 수학 점수를 차례로 입력해주세요.");
		
		//입력한 값 점수배열로 저장
		for(int i =0; i<scoreArr.length; i++) {		
			scoreArr[i] = scan.nextInt();
		}
		
		//배열 출력
		System.out.print("점수 입력한 값 :");
		for(int i =0; i<scoreArr.length; i++) {		
			System.out.print(" "+ scoreArr[i]);
		}
		System.out.println();
		
		
		//점수 순서 정렬 
		int tempScore = 0;
				
		for(int i = 0; i < scoreArr.length-1; i++) {	
			for(int j = 0; j<scoreArr.length-1 ;j++) {
				if(scoreArr[j] < scoreArr[j+1]) {
					tempScore = scoreArr[j];
					scoreArr[j] = scoreArr[j+1];
					scoreArr[j+1] = tempScore;
				}
				cnt++;
				System.out.println();
				System.out.println("횟수 : "+ cnt);
				//System.out.println(scoreArr[j] + " : "+ scoreArr[j+1]);
				//한번 수행하면 어떻게 될까?
				for(int k =0; k<scoreArr.length; k++) {		
					System.out.print(" "+scoreArr[k]);
				}
			}
		}
		
		System.out.println();
		System.out.print("점수 정렬한 값 :");
		for(int i =0; i<scoreArr.length; i++) {		//정령한 점수 출력
			System.out.print(" "+scoreArr[i]);
		}
		
		
	}

}
