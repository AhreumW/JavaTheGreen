/**
 * 
 * @author TJ
 * 100, 81, 100, 100, 93, 17
 * 81.83333333333.....
 * 총점과 평균을 구하시오. 
 * 평균은 소수점 3째자리에서 반올림하시오.
 * 총점	: 평균 
 * ??	: ???
 * 
 */

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		int[] scoreArr = new int[5];
		int[] scoreArr = {100, 81, 100, 100, 93, 17};
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<6; i++) {
			sum = sum + scoreArr[i];
		}
		
		avg = sum / 6.0 ;	//81.83333...
		//avg = 81.8399; 	//반올림될 경우
		avg = (int)(avg * 100 + 0.5) /100.0; 		//반올림을 위해 + 0.5	(ex 8183.x vs 8184.x)
		
		System.out.println("총점\t:\t평균");
		System.out.println(sum+"\t:\t"+avg);
	}

}
