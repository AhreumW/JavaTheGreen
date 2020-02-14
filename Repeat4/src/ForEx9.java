/**
 * + 다중for문에서 위치에 따른 break의 차이 익히기 
 * 	for(){
 * 		for(){
 * 			1. break;
 * 		}
 * 		2. break;
 * 	}
 */

public class ForEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		continue문
//		진짜 특별한 경우 아니면 가능한 안쓰는게 좋음
		
		
		for(int i =0; i<=10; i++) {
			if(i % 3 == 0) {
				System.out.println("짝");
				continue;			//밑의 코드와 상관없이 처음으로 건너뜀
			}
			System.out.println(i);
		}
		
		
	}

}
