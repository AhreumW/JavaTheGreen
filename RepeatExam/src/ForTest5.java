import java.util.Scanner;

/**
 * 
 * @author TJ
 * 사각형을 출력해라 
 * ================
 *  *****
 *  *****
 *  *****
 *  *****
 * 
 */
public class ForTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length = 5;		//사각형 가로 사이즈
		int height = 4;		//사각형 세로 사이즈
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("원하는 사각형 가로길이를 입력하세요.");
 		length = scan.nextInt();
 		System.out.println("원하는 사각형 세로길이를 입력하세요.");
 		height = scan.nextInt();
 		
 		int starNum = length * height;
 		int cnt = 0;
 		
 		
 		for(int i=0; i<starNum; i++) {
 			System.out.print("*");
 			cnt++;
 			if(cnt == length) {
 				System.out.println();
 				cnt = 0;
 			}
 		}
		
 		
 		//다중 for문 써보기
 		for(int i = 0; i<height ; i++) {
 			for(int j = 0; j<length; j++) {
 				System.out.print("*");
 			}
 			System.out.println();
 		}
 		
 		
//		/* 해설 */
//		// 생각 1단계
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
//		
//		// 생각 2단계
//		for(int i = 0; i<4; i++) {
//			System.out.println("*****");
//		}
//		
//		// 생각 3단계
//		for(int i = 0; i<4; i++) {		//라인
//			for(int n = 0; n <= 5; n++) {	//표현
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
	}

}
