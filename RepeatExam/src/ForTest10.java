/**
 * 
 * @author TJ
 * 누적 활용 
 * 1~100까지 더하는데 
 * 만약 100을 넘지 않는 제일 큰 수를 출력한다.
 * =============
 * 1 - 1
 * 2 - 3
 * 3 - 6
 * 4 - 10
 *  :
 * 13 - 91
 */

public class ForTest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;
		int sum = 0;
		
		//for문
		for(int i = 1; sum < 100; i++) {
			sum = sum + i;
			if(sum < 100) {
				System.out.println(i +" - "+ sum);
			}
		}
		 
		System.out.println("======================");
		
		// while문
		sum = 0;
		while(sum < 100) {
			sum = sum + num;
			if(sum < 100) {
				System.out.println(num + " - "+ sum);
			}
			num++;
		}
		
		
		
	}

}
