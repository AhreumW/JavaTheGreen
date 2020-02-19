/**
 * 
 * @author TJ
 * 메서드 명명 규칙
 * - 변수랑 동일
 * - 첫글자 (소문자:변수,메서드 / 대문자:클래스)
 * 
 * 출력 - ParameterTest2.java와 비교
 *	main x = 10
	change x: 1000
	After change
	main x = 10
 */
public class ParameterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
			callByValue vs callByReference
			값 호출			값 참조
*/			
//			참조변수
			Data data = new Data();
//			인스턴스변수
			data.x=0;
//			지역변수
			int x = 0;
			x= 10;
			
			System.out.println("main x = " + x);
			
			data.change(x);		//단축키 - 메서드 위에서 F3누르면 선언부로 찾아감(호출)
			
			System.out.println("After change");
			System.out.println("main x = " + x);
			
			
	}

}
