package list.arraylist.add_get;
import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//숫자 두개를 입력 받고 어레이리스트에 넣고 두개의 합을 구하라
		Scanner scan = new Scanner(System.in);
		
		int input1 = 0;
		int input2 = 0;
		
		System.out.println("더할 숫자 두개를 입력하세요.");
		input1 = scan.nextInt();
		input2 = scan.nextInt();
		
		ArrayList list = new ArrayList();
		
		list.add(input1);
		list.add(input2);
		
		int n1 = (int)list.get(0);
		int n2 = (int)list.get(1);
		
		int sum = 0;
		
		sum = n1 + n2;
		
		System.out.println(n1 + " + " + n2 + " = " + sum);
		
	}

}
