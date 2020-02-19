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
public class GugudanExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] mulNumArr = new int[9];
		/*
		2 * 1 = mulNumArr[0]	3 * 1 = mulNumArr[1]	...		9 * 1 = mulNumArr[8]
		2 * 1 = 2	3 * 1 = 3	...		9 * 1 = 9
		2 * 2 = 4	3 * 2 = 6	...		9 * 2 = 18
						:
		2 * 9 = 18	3 * 9 = 27	...		9 * 9 = 81
		*/
		
		for(int i=0; i<mulNumArr.length; i++) {	// *1~9
			
			for(int j=1; j<mulNumArr.length; j++) {	//2단~9단 
				mulNumArr[j] = (i+1) * (j+1);
				System.out.print((j+1)+" * "+(i+1)+" = "+mulNumArr[j]+"\t");
				
				if((j+1) % 9 == 0) {
					System.out.println();
				}
			}
		}
		
		/*
		for(int i=1; i<mulNumArr.length; i++) {
			for(int j=0; j<mulNumArr.length; j++) {
				mulNumArr[j] = (i+1) * (j+1);
				System.out.println((i+1)+" * "+(j+1)+" = "+mulNumArr[j]);
			}
		}
		*/
		
	}

}
