import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc cal = new Calc();
		
		double num1 = 0; 
		double num2 = 0; 
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("더할 숫자 두개를 입력하세요");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		
		System.out.println(num1 +" + "+ num2 );
		System.out.println(" = " + cal.sum(num1,num2));
					
				
		
		System.out.println("나눌 숫자 두개를 입력하세요");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
			
		System.out.println(num1 +" / "+ num2 );
		System.out.println(" = "  + cal.div(num1,num2));
			  
		
	}

}
