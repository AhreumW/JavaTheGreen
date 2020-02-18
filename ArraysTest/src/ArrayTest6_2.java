/**
 * @author TJ
 * 친구풀이
 * 
 * ArrayTest6에서 
 * 먼저 대입시키고 섞는 방식으로 바꿔봄
 * 
 * numberArr에 5, 4, 3, 2, 1를 넣는다. 
 * 이 값을 섞어서 출력한다.
 * 단, 배열 변수를 하나 더 생성한다. 
 * ================
 * 초기값 : 5, 4, 3, 2, 1
 * 셔플값 : ...
 */
public class ArrayTest6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numberArr = {5,4,3,2,1};
		int[] changeArr = new int[5];
		int tempNum = 0;
		int n = 0;
		
		for(int i =0; i<numberArr.length; i++) {
			tempNum = numberArr[i];
			changeArr[i] = tempNum;
		}

		//셔플 배열에 넣어주기.**
		//조건이 i < number.length일 때
		//랜덤만 섞는 애를 change에 넣는게 아니라 number에 넣어야 한다.
		//number[n]는 순서를 바꾸는 것이고 (그냥 자리만 바꾸는 것임) **
		//change[n]으로 하면 중복되는 number[]를 넣게 된다. 
		for(int i =0; i<changeArr.length; i++) {
			n = (int)(Math.random() * changeArr.length);	
				
			//뒤섞기
			tempNum = changeArr[i];
			changeArr[i] = changeArr[n];
			changeArr[n] = tempNum;
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
