public class ForEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		다중 for문
//		2 * 1 = 2   2 * 2 = 4   2 * 3 = 6  ,,, 2 * 9 = 18
//		3 * 1 = 3   3 * 2 = 6   3 * 3 = 9  ,,, 3 * 9 = 27
//						:
//		9 * 1 = 9   9 * 2 = 18   9 * 3 = 27  ,,, 9 * 9 = 81
				
				
//		구구단
		System.out.println("구구단을 외자!");
		
		String str = "";
		int mulNum = 0;
		
		for(int i = 2; i <= 9; i++) {
			for (int n = 1; n <= 9; n++) {
				//분리설계를 잘해야 함!!
				mulNum = i * n;		//계산식
				str = i + " * " + n + " = " + mulNum + "\t";	//메세지
				System.out.print(str);	//출력
			}
			System.out.println();
		}
		
	}

}
