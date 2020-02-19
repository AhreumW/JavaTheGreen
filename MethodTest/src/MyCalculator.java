/**
 * 
 * @author TJ
 * 더하기 빼기 곱하기 나누기
 * 기능 구현하기
 * 나누었을 때 소수점은 전부 표현한다. 
 */
public class MyCalculator {
	
	int add(int a, int b) {
		int sum = 0;
		sum = a + b;
		return sum;		
	}
	
	int sub(int a, int b) {
		int subNum = 0;
		subNum = a - b;
		return subNum;		
	}
	
	int mul(int a, int b) {
		int mulNum = 0;
		mulNum = a * b;
		return mulNum;		
	}
	
	double div(double a, double b) {	//int a, int b로 매개변수를 받아서
		double divNum = 0;
		divNum = a / b;					//(double)a/b로 형변환 시켰을 땐
		return divNum;					//처음 int 범위로 지정이 되었기 때문에 출력 범위의 아쉬움이 따른다. 
	}									//+ 물론 정수만 받고 실수까지 받을 수 있다는 차이도 있음.

}
