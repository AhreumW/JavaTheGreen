
public class MyCalculatorMain {
/*
*/	
	public static void main(String[] args) {
		
		MyCalculator calc = new MyCalculator();
		
		int sum = 0;
		int sub = 0;
		int mul = 0;
		double div = 0;
		
		sum = calc.add(3,5);
		sub = calc.sub(3,5);
		mul = calc.mul(3,5);
		div = calc.div(3,5);
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
	}
	
}
