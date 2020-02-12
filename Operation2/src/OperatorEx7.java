
public class OperatorEx7 {

	public static void main(String[] args) {

//		논리 연산자 
		int n = 10;
		
		
		System.out.println(n >= 20 && n <= 20);
		
		System.out.println(10 >= 20 && 10 <= 20);	//어짜피 false라 뒤 조건은 죽은코드 
		System.out.println(10 >= 20 & 10 <= 20);	//앞이 false라도 뒤를 확인해보자 => &
		
		//증명
		n = 10;
		System.out.println(n++ >= 20 && n++ <= 20);
		System.out.println(n);			//11
										//즉, 뒤 n++ <= 20식 자체가 수행되지 않음
		n = 10;
		System.out.println(n++ >= 20 & n++ <= 20);
		System.out.println(n);			//12
										//즉, 뒤 n++ <= 20식 자체까지도 수행이 이루어짐
		
		n = 10;
		System.out.println(n >= 20 || n <= 20);
		
		System.out.println(10 >= 20 || 10 <= 20);	  
		System.out.println(10 >= 20 | 10 <= 20);	//앞이 true라도 뒤를 확인해보자 => |
		
		
	}
}
