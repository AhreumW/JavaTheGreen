
public class OperatorEx9 {

	public static void main(String[] args) {

//		삼항 연산자
		
		int x = 10;
		int y = -10;
		
		int absX = 0;
		int absY = 0;
		
//		(조건식) ? 식1 : 식2 
//		조건이 true이면 식1
//		조건이 false이면 식2
		absX = (x >= 0) ? x : -x;
		absY = (y >= 0) ? y : -y;
		
		System.out.println("x의 절대값은 " + absX);
		System.out.println("y의 절대값은 " + absY);
		
		
		String str ="";
		
		str = "문자열이다아아";
		System.out.println(str);
		
	}
}
