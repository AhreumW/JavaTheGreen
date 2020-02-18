import java.util.Scanner;

/**
 * @author TJ
 * 내 풀이 
 * 
 * 국영수 3과목에 대해 5명의 성적이 있다.
 * 각 총점과 평균을 구하고 
 * 가장 높은 학생의 번호를 출력하시오.
 * ==============================
 * 국어 영어 수학
 *1 100 100 100
 *2 20	20	20
 *3 30	30	30
 *4 40	40	40
 *5 50	50	50
 *
 * 수석학생 : 1번 학생
 * 총점 : 300
 * 평균 : 100.0 //소수점 첫째자리만 표현 둘째자리는 버린다. 
 */

public class ArrayTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] scoreArr = new int[5][3];	//학생수 과목수
		
		Scanner scan = new Scanner(System.in);
		
		for(int i =0; i<scoreArr.length; i++) {
			System.out.println((i+1)+"번째 학생 국영수 점수를 순서대로 입력하시오");
			for(int j =0; j<scoreArr[i].length; j++) {
				scoreArr[i][j] = scan.nextInt();
			}
		}

		/* 
		 * 입력, 출력,
		 * 총점, 평균 등  
		 * 로직을 분리시켜야 재사용성이 높아짐 
		*/
		int[] sum = new int[5];
		double[] avg = new double[5];
		int first = 0;
		// 총점 구하기	
		for(int i =0; i<scoreArr.length; i++) {
			for(int j =0; j<scoreArr[i].length; j++) {
				sum[i] = sum[i] + scoreArr[i][j];
			}
			//수석학생 번호 구하기
			if(sum[first] < sum[i]) {
				first = i;
			}
			System.out.println((i+1)+"번 학생 총점 : " + sum[i]);	
		}
		
		//평균 구하기 
		for(int i =0; i<scoreArr.length; i++) {
			avg[i] = sum[i] / 3.0;
			avg[i] = (int)(avg[i] * 10)/10.0;
		}

		//학생들의 과목 점수 리스트 출력
		System.out.println("번호\t국어\t영어\t수학");
		for(int i =0; i<scoreArr.length; i++) {
			System.out.print(i+1);
			
			for(int j =0; j<scoreArr[i].length; j++) {
				System.out.print("\t"+ scoreArr[i][j]);
			}
			System.out.println();
		}
		
		
		System.out.println("수석학생 : "+ (first+1)+"번 학생");
		System.out.println("총점 : "+ sum[first]);
		System.out.println("평균 : "+ avg[first]);
		
		
		
	}

}
