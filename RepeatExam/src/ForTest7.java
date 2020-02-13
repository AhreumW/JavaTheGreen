import java.util.Scanner;

/**
 * 
 * @author TJ
 *  삼각형을 출력해라 
 * ================
 *      *
 *     **
 *    ***
 *   ****
 *  *****
 *     *			4 1
 *    ***			3 3
 *   *****			2 5
 *  ******* 		1 7
 * *********		0 9
 */
public class ForTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 5;
		String str = "";
		
		str ="*";	//변수사용
		
		//반대편 직각삼각형
		for(int i = 0; i < row; i++){
			for(int j = row-1; j > i; j--) {		
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {	 
				System.out.print(str);
			}
			System.out.println();
		}
		
		//정삼각형
		for(int i = 0; i < row; i++){
			for(int j = row-1; j > i; j--) {		
				System.out.print(" ");
			}
			for(int j = 0; j <= i*2; j++) {	 
				System.out.print("*");
			}
			System.out.println();
		}
		//위랑 합치면 마름모
		for(int i = row-1; i > 0; i--){
			for(int j = row-1; j >= i; j--) {		
				System.out.print(" ");
			}
			for(int j = 0; j < i*2-1; j++) {	 
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
