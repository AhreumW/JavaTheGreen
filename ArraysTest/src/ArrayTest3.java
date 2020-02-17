/**
 * @author TJ
 * 최대값 , 최소값 구하라
 * + 수행 횟수를 줄이는 것이 포인트
 * ======================
 * 최대값 : 100
 * 최소값 : 33
 * 
 * 최대값의 위치는 5
 * 최소값의 위치는 4 
 */
public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		최소값 & 최대값 찾기 
		
		int[] scoreArr = {79, 88, 91, 33, 100, 55, 95};

		// 1. maxNum = 0으로 하면 의미없는 행동이 하나 추가된 것과 같음
		int maxNum = scoreArr[0];		//최대값		
		int minNum = scoreArr[0];		//최소값
		
		int maxIndex = 0;		//최대값 위치 
		int minIndex = 0;		//최소값 위치
		
		/*
		// 2. maxNum = scoreArr[0]은 자기자신을 비교하는 의미없는 행동이 추가됨. 		
		for(int i = 0; i < 7; i++) {
			if(maxNum < scoreArr[i]) {
				maxNum = scoreArr[i];
				maxIndex = i+1;
			}
			if(minNum > scoreArr[i]) {
				minNum = scoreArr[i];
				minIndex = i+1;
			}
		}
		*/
		// 3. [1]부터 시작하면 자기자신을 비교 안 함.
		for(int i = 1; i < 7; i++) {
			if(maxNum < scoreArr[i]) {
				maxNum = scoreArr[i];
				maxIndex = i+1;
			}
			if(minNum > scoreArr[i]) {
				minNum = scoreArr[i];
				minIndex = i+1;
			}
		}
		
		 
		System.out.println("최대값: " + maxNum);
		System.out.println("최소값: " + minNum);
		System.out.println();
		System.out.println("최대값의 위치는: " + maxIndex+"번째");
		System.out.println("최소값의 위치는: " + minIndex+"번째");
	}

}
