/**
 * 
 * @author TJ
 * 1~100의 범위에서 홀수만 더한다. 
 * 단, 10번 더했다면 10번까지 더한 값을 출력한다. 
 * =======================
 * 1번째 누적값 : 0 + 1 = 1
 * 2번째 누적값 : 1 + 3 = 4
 * 		:
 * 
 */

public class ForTest14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int limit = 100;	//숫자 범위
		int sum = 0;		//합
		int cnt = 0;		//더한 횟수
		
		System.out.println("=======홀수누적값 계산기=======");
		System.out.println("\t 누적값 + 홀수값 = 합계");
		
		for(int i = 0; i <= limit; i++) {
			if(i % 2 == 1){
				cnt++;
				System.out.print(cnt + "번째 누적값 : "+ sum +" + "+ i +" = ");
				sum = sum + i;
				System.out.println(sum);
				
				if(cnt == 10) {
					break;
				}
			}
		}
		
		System.out.println();
		System.out.println("1부터 "+limit+ "까지의 숫자중 "+cnt+"개의 홀수 누적값의 총합은 "+ sum+"입니다.");
		
		
	}

}
