
public class OperatorEx10 {

	public static void main(String[] args) {

//		대입 연산자 
		int n = 0;
		//단축연산자 : 장, 속도가 빠름 / 단, 가속성이 떨어짐
		//(그래서 유지보수하는 웹에서는 잘 안씀 => n=n+3;)
		n += 3; 
		System.out.println(n);
		n *= 3; 
		System.out.println(n);
		n = 10; 
		System.out.println(n);
		n %= 3; 
		System.out.println(n);

		
	}
}
