/**
 * @author TJ
 * 선생님 해설
 * 
 * numberArr에 5, 4, 3, 2, 1를 넣는다. 
 * 이 값을 섞어서 출력한다.
 * 단, 배열 변수를 하나 더 생성한다. 
 * ================
 * 초기값 : 5, 4, 3, 2, 1
 * 셔플값 : ...
 */
public class ArrayTest6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numberArr = new int[5];
		int[] newNumArr = new int[5];
		
		//초기화
		for(int i = 0; i<newNumArr.length;i++) {
			numberArr[i] = i+1;
		}
		
		newNumArr = numberArr;
		System.out.println("numberArr 출력");
		for(int i = 0; i<numberArr.length;i++) {
			System.out.println(numberArr[i]);
		}
		System.out.println("newNumArr 출력");
		for(int i = 0; i<newNumArr.length;i++) {
			System.out.println(newNumArr[i]);
		}
		
		/*
		 * 여기서의 주의사항 **
		 * newNumArr = numberArr;
		 * 그냥 대입해버리면
		 * 주소값이 같아져서 
		 * newNumArr를 변경했을 때 
		 * 원본인 numberArr도 바뀌는 것을 조심해야 한다.~!!
		*/
		newNumArr[0] = 10;
		System.out.println();
		System.out.println("원본지키기");
		System.out.println("numberArr 출력");
		for(int i = 0; i<numberArr.length;i++) {
			System.out.println(numberArr[i]);
		}
		System.out.println("newNumArr 출력");
		for(int i = 0; i<newNumArr.length;i++) {
			System.out.println(newNumArr[i]);
		}
		
	}

}
