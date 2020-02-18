/**
 * @author TJ
 * 내 풀이 
 * 
 * numberArr에 5, 4, 3, 2, 1를 넣는다. 
 * 이 값을 섞어서 출력한다.
 * 단, 배열 변수를 하나 더 생성한다. 
 * ================
 * 초기값 : 5, 4, 3, 2, 1
 * 셔플값 : ...
 */

public class ArrayTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numberArr = {5,4,3,2,1};
		int[] changeArr = new int[5];
		int tempNum = 0;
		
		int[] randomArr  = new int[5];
		int n= 0;
		//random
		for(int i = 0 ; i< randomArr.length; i++) {
			randomArr[i] = i;
		}
		for(int i = 0; i<randomArr.length;i++) {		
			n = (int)(Math.random() * randomArr.length);	
			//뒤섞기
			tempNum = randomArr[0];
			randomArr[0] = randomArr[n];
			randomArr[n] = tempNum;
		}
		
		//셔플 배열에 넣어주기.
		for(int i =0; i<numberArr.length; i++) {
				changeArr[i] = numberArr[randomArr[i]];
		}
		
		

		System.out.print("초기값 : ");
		for(int i =0; i<numberArr.length; i++) {
			if(i == numberArr.length-1) {
				System.out.print(numberArr[i]);
				break;
			}
			System.out.print(numberArr[i] + ", ");
		}
		
		System.out.println();
		System.out.print("셔플값 : ");
		for(int i =0; i<changeArr.length; i++) {
			if(i == changeArr.length-1) {
				System.out.print(changeArr[i]);
				break;
			}
			System.out.print(changeArr[i] + ", ");
		}
		
	}

}
