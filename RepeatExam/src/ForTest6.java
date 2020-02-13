import java.util.Scanner;

/**
 * 
 * @author TJ
 *  삼각형을 출력해라 
 * ================
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 * 
 */
public class ForTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 5;
		
//		for(int i = 0; i < row; i++){
//			for(int j = 0; j <= i; j++) {	//내부 for문 변수의 조건이 바깥 for문의 변수가 될 때 
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//역삼각형
		for(int i = row; i >= 0; i--){
			for(int j = 0; j < i; j++) {		//여기를 i--로 할 수도 있음
				System.out.print("*");
			}
			System.out.println();
		}
		
		//역삼각형2 - 다른분 코드 
		for(int i = 0; i < row; i++){
			for(int j = row; j > i; j--) {		
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//		/* 해설 */
//		//생각 1단계
//		System.out.print("*");
//		System.out.println();
//		System.out.print("**");
//		System.out.println();
//		System.out.print("***");
//		System.out.println();
//		System.out.print("****");
//		System.out.println();
//		System.out.print("*****");		
//		System.out.println();
//		
//		//생각 2단계
//		for(int i = 0; i<5; i++) {
//			for (int n = 0; n < 1; n++) {		//n <1 의 조건을 바꿔보며 규칙을 확인
//				System.out.print("*");
//			}
//			System.out.println("라인");
//		}
//		
//		//생각 3단계
//		for(int i = 0; i<5; i++) {
//			for (int n = 0; n < i+1; n++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
	}

}
