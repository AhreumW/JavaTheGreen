/**
 * 
 * @author TJ
 * 더하기 빼기 곱하기 나누기
 * 기능 구현하기
 * 나누었을 때 소수점은 전부 표현한다. 
 */
public class MyCalculator2 {
	
	void add(int a, int b) {
		int sum = 0;
		sum = a + b;
		System.out.println(a +" + "+b + " = " + sum);
	}
	
	void sub(int a, int b) {
		int subNum = 0;
		subNum = a - b;	
		System.out.println(a +" - "+b + " = " + subNum);
	}
	
	void mul(int a, int b) {
		int mulNum = 0;
		mulNum = a * b;
		System.out.println(a +" * "+b + " = " + mulNum);
	}
	
	void div(double a, double b) {
		double divNum = 0;
		divNum = a / b;
		System.out.println(a +" / "+b + " = " + divNum);
	}
	
	void rem(int a, int b) {	//나머지연산
		int remNum = 0;
		remNum = a % b;
		System.out.println(a +" % "+b + " = " + remNum);
	}

}
