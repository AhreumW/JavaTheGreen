
/**
 * 
 * @author TJ
 * ================================
 * 10까지의 합 : 55
 * for문
 */
public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("이건 범위제한으로써의 변수 ");
		int sum = 0;
		int startNum = 1;
		int lastNum = 10;
		
		for(int i = startNum ; i<= lastNum ; i++) {
			//System.out.print(sum + " + " + i + " = ");
			sum = sum + i;
			//System.out.println(sum);
		}
		System.out.println(startNum+"부터 "+ lastNum + "까지의 합: "+ sum);
		
		
		System.out.println();
		System.out.println("카운트 변수(횟수만) 사용했을 때 ");
		//위와의 차이는 cnt값을 누적으로 계속 저장이 된다는 것~!!
		sum = 0;
		int cnt = 0;
		for(int i = 1 ; i<= 15 ; i++) {
			sum = sum + i;
			cnt++;			
		}
		System.out.println(cnt + "번 수행한 합: "+ sum);
		
		
		System.out.println("2차 사용 -> cnt는 누적용으로써의 변수");
		for(int i = 1 ; i<= 15 ; i++) {
			sum = sum + i;
			cnt++;			
		}
		System.out.println(cnt + "번 수행한 합: "+ sum);
		
		
		System.out.println();
		System.out.println("변수를 만들때 용도 차이를 잘 이해해야한다.");
	}

}
