/**
 * @author TJ
 * 1단계 버블정렬
 */
public class ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArr = {15, 11, 1, 3, 8};
		
		System.out.println("초기값");
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]+" ");
		}
		
		int cnt = 0;
		int change = 0;
		int tempNum = 0;
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr.length-1-i; j++) {
				cnt++;
				if(numArr[j] > numArr[j+1]) {
					tempNum = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tempNum;
					change++;
				}
			}
		}
	
		System.out.println();
		System.out.println("교환횟수 : "+ change);
		System.out.println("총 수행횟수 : "+ cnt);
		System.out.println("정렬 후 ");
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]+" ");
		}
		
	}
	

}
