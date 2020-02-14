
public class ForEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		while문 
//		표현식
//		while(조건식) {
//			조건식의 연산결과가 참(true)인 동안, 반복될 문장들을 적는다.
//		}
		
		int count = 0;
		
		while(count <= 10) {			//조건식을 빠져나가지 못하면 무한루프에 빠짐
			System.out.println(count);
			count++;					
		}
		
		System.out.println("프로그램 종료");
		
	}

}
