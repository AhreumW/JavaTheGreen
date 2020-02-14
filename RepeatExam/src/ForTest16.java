/**
 * @author TJ
 * 윤년
 * for문
 * 1~ 2020년 까지 윤년을 찾아주기 
 */
public class ForTest16 {
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		
		System.out.println("윤년 찾기");
		
		for(int i = 1600; i <= 2020; i++) {
			if((i % 4 == 0) && (i % 100 != 0)) {
				System.out.println(i+"년은 윤년입니다.");
				count++;
			}else if(i % 400 == 0) {
				System.out.println(i+"년은 윤년입니다.");
				count++;
			}
		}
		System.out.println("윤년은 총 "+count+"번 입니다.");
		
	}

}
