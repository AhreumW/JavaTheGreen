public class ForTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		다중 for문
//		2 * 1 = 2   3 * 1 = 3   
//		2 * 2 = 4   3 * 2 = 6   
//						:
//		2 * 9 = 18   3 * 9 = 27    ,,, 9 * 9 = 81
				
				
//		구구단
		System.out.println("구구단을 외자!");
		
		String str = "";
		int mulNum = 0;
		
		for(int i = 1; i <= 9; i++) {
			for (int n = 2; n <= 5; n++) {		//2단부터 5단
				//분리설계를 잘해야 함!!
				mulNum = n * i;		//계산식
				str = n + " * " + i + " = " + mulNum + "\t";	//메세지
				System.out.print(str);	//출력
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i <= 9; i++) {
			for (int n = 6; n <= 9; n++) {		//6단부터 9단
				//분리설계를 잘해야 함!!
				mulNum = n * i;		//계산식
				str = n + " * " + i + " = " + mulNum + "\t";	//메세지
				System.out.print(str);	//출력
			}
			System.out.println();
		}
		
		
		
	}

}
