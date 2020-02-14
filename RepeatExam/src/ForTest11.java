/**
 * 
 * @author TJ
 * 중첩 while문 
 * 구구단
 * 
 * 단축키
 * ctrl + f 글찾기 교체
 */

public class ForTest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 2;
		int num2 = 1;
		int mul = 0;
		
		System.out.println("==========가로버전==========");
		//구구단 가로버전
		while(num1<=9) {
			while(num2<=9) {
				mul = num1 * num2;
				System.out.print(num1 +" * "+num2+" = " +mul+"\t");
				num2++;
			}
			num2 = 1;
			num1++;
			System.out.println();
		}
		
		
		System.out.println("==========세로버전==========");
		//구구단 세로버전
		num1 = 1;
		num2 = 2;
		mul = 0;
		while(num1<=9) {
			while(num2<=9) {
				mul = num1 * num2;
				System.out.print(num2 +" * "+num1+" = " +mul +"\t");
				num2++;
			}
			num2 = 2;
			num1++;
			System.out.println();
		}
		
		
		
		/* 해설 */
		/* 구구단 for문을 while문으로 변경해보자 */
//		String str = "";
//		int mulNum = 0;
//		//1단계 - for문 사용
//		for(int i = 1; i <= 9; i++) {
//			for (int n = 2; n <= 5; n++) {		//2단부터 5단
//				//분리설계를 잘해야 함!!
//				mulNum = n * i;		//계산식
//				str = n + " * " + i + " = " + mulNum + "\t";	//메세지
//				System.out.print(str);	//출력
//			}
//			System.out.println();
//		}
//		//2단계 - while문 사용
//		int dan = 0;
//		int n = 1;
//		dan = 2;
//		while(dan<=9) {
//			while(n<=9) {
//				mulNum = dan * n;
//				System.out.print(dan +" * "+n+" = " +mulNum+"\t");
//				n++;
//			}
//			n = 1;
//			dan++;
//			System.out.println();
//		}
		
		
	}

}
