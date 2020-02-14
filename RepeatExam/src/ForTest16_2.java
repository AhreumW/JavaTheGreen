/**
 * @author TJ
 * 윤년
 * for문
 * 1~ 2020년 까지 윤년을 찾아주기 
 */
public class ForTest16_2 {
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;	//윤년
		int cnt = 0; 	//평년
		
		
		System.out.println("윤년 찾기");
		
		for(int i = 1600; i <= 2020; i++) {
			
			int four = i % 4;
			int hundred = i % 100;
			int fourHundred = i % 400;
			
			if( (four == 0 && hundred != 0) || fourHundred == 0) {	//오해의 소지가 있으므로 ()는 안푸는게 좋음
				System.out.println(i+"년은 윤년입니다.");
				count++;
			}else if( (four != 0 || hundred == 0) && fourHundred != 0 ) { //오해의 소지가 있으므로 ()는 안푸는게 좋음
				cnt++;
			}
		}
		System.out.println();
		System.out.println("총 "+(count+cnt)+"년간");
		System.out.println("윤년은 총 "+count+"번 입니다.");
		System.out.println("평년은 총 "+cnt+"번 입니다.");
	}

}
