package gugudan;
import java.util.Scanner;

/**
 * 
 * @author TJ
 * 스마트 구구단
 * 
 * 시작 값 ~ 끝 값
 * 2, 4 - 4단까지만
 * EX : 2단 3단 4단
 * 4, 2 - 출력안됨
 * 한 명은 - 구구단 로직만 짠다
 * 한 명은 - 메인
 */
public class Gugudan {

	int[][] multiNumArr = new int[8][9]; // 2차원배열로 구구단 값 넣기
	int dan1 = 0; // 입력부분의 시작 값
	int dan2 = 0; // 입력부분의 끝 값
	
	
	void input() {	//아름
		Scanner scan = new Scanner(System.in);
		System.out.println("어느 단부터 어디까지 입력하실지 숫자를 두개 올려주세요.");
		dan1 = scan.nextInt();
		dan2 = scan.nextInt();
		System.out.println(dan1 +"단부터 "+dan2+"단까지 출력됩니다.");
	}
	
//	void gugudanPlay() { // 구현부분	//환상
//		if (dan1 <= dan2) {
//			for (int i = dan1; i < dan2+1; i++) {
//				for (int j = 0; j < 9 ; j++) {
//					multiNumArr[i][j] = i * (j + 1);
//				}
//			}
//		}else {
//			System.out.println("출력되지 않는다");
//		}
//		
//	}
	
	void gugudanPlay() { // 구현부분	//환상
		if (dan1 <= dan2) {
			for (int i = dan1-1; i < dan2; i++) {
				for (int j = 0; j < 9 ; j++) {
					multiNumArr[i][j] = i+1 * (j + 1);
				}
			}
		}else {
			System.out.println("출력되지 않는다");
		}
		
	}
	
	void output(){	//출력	//아름
		for(int i = dan1-1; i < dan2; i++) {
			for(int j = 0; j < 9 ; j++) {				
				System.out.print((i) +" * "+(j+2)+" = "+multiNumArr[i][j]+" ");
			}System.out.println();
		}
	}
	
//	void output(){	//출력	//아름
//		for(int i = dan1; i< (dan2+1); i++) {
//			for(int j = 0; j < 9 ; j++) {				
//				System.out.print(i +" * "+(j+1)+" = "+multiNumArr[i][j]+" ");
//			}System.out.println();
//		}
//	}
	
	
}
