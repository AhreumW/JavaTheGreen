/**
 * @author TJ
 * 
 */
//배열 - 관련있는 것들의 묶음
public class ArrayEx11 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//다차원 배열
		//2차원 배열
		int[][] scoreArr = new int[3][3];
		/*
		 * 	scoreArr = 0*1000 주소값이 연결
		 * 
				0*1000 
			[	0*2000	]	->	0*2000 [ 0	| 1	| 2	]
			[	0*3000	]	->	0*3000 [ 0	| 1	| 2	] 
			[	0*4000	]	->	0*4000 [ 0	| 1	| 2	] 
			
		*	scoreArr[1][2]는 
		*	0*1000 -> 0*3000 -> [2] 순서로 찾아감
		*/
		for (int i = 0; i < scoreArr.length; i++) {
			for (int n = 0; n < scoreArr.length; n++) {
				scoreArr[i][n] = (i+1) * 10;
			}
		}
		
		for (int i = 0; i < scoreArr.length; i++) {
			for (int n = 0; n < scoreArr.length; n++) {
				System.out.print(scoreArr[i][n]+", ");
			}
			System.out.println();
		}
		
		scoreArr[2][2] = 100;
		System.out.println(scoreArr[2][2]);
		
	
	}	

}