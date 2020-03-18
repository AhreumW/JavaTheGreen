import java.util.ArrayList;
import java.util.Scanner;

public class ScanArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		앞으로 명명규칙 
//		배열은 +Arr
//		리스트는 +List 로 붙이기
		ArrayList list = new ArrayList();
		int num1 = 0;
		int num2 = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 두개 입력하세요.");
		num1 = scan.nextInt();
		num2 = scan.nextInt();

		list.add(num1);
		list.add(num2);
		
		
		int result = 0;
		result = (int)list.get(0) + (int)list.get(1);
		
		System.out.print(list.get(0) +" + "+ list.get(1) +" = ");
		System.out.println(result);
		
		
	}

}
