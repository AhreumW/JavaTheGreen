
public class ForEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for문
//		표현식
//		for(1.초기화; 2.5.조건식; 4.7.증감식) {
//			3.6.조건식이 참일 때 수행될 문장들을 적는다. 
//		}
		

		// i(index)란 뜻이라서 주로 반복문에서만 쓰는 변수명
		for(int i = 0; i < 5; i++) {	// i 선언
			System.out.println(i);
		} // i 소멸
		
		
		for(int i = 1; i <= 5; i++) {	// i 선언
			System.out.println(i);
		} // i 소멸
		
		// i 재선언
		int i = 0;		
		System.out.println(i);
	}

}
