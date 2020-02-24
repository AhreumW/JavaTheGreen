/**
 * 
 * @author TJ
 * 구구단 만들기 
 * 1차원 배열
 * 결과만 1차원 배열에 넣는다. 
 * 그걸 출력한다. 
 * 
 * 2차원 배열
 * 
 * 
 */
public class GugudanExam2 {		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] mulNumArr = new int[9][9];
		/*
		2 * 1 = mulNumArr[0][0]	2 * 2 = mulNumArr[0][1]	...		2 * 9 = mulNumArr[0][8]
		3 * 1 = 2	3 * 2 = 3	...		3 * 9 = 9
		4 * 1 = 4	4 * 2 = 6	...		4 * 9 = 18
						:
		9 * 1 = 18	9 * 2 = 27	...		9 * 9 = 81
		*/
		
//		for(int i = 1; i<mulNumArr.length; i++) { //2단~9단
//			for(int j = 0; j<mulNumArr.length; j++) { // *1~9
//				mulNumArr[i][j] = (i+1) * (j+1);
//				System.out.print((i+1)+ " * " + (j+1)+ " = "+ mulNumArr[i][j] +"\t");
//			}
//			System.out.println();
//		}
		
		
//		컨펌 -> **기능의분리** 
//		값을 넣는 것고 출력하는것 분리시키기
//		나중에 기능에 따른 메서드화 시킬 수 있음~!!
		
		for(int i = 1; i<mulNumArr.length; i++) { //2단~9단
			for(int j = 0; j<mulNumArr.length; j++) { // *1~9
				mulNumArr[i][j] = (i+1) * (j+1);
			}
		}
		
		for(int i = 1; i<mulNumArr.length; i++) { //2단~9단
			for(int j = 0; j<mulNumArr.length; j++) { // *1~9
				System.out.print((i+1)+ " * " + (j+1)+ " = "+ mulNumArr[i][j] +"\t");
			}
			System.out.println();
		}
		
		
		
	}

}
