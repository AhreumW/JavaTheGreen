package list.arraylist.add_get;
import java.util.ArrayList;

public class TestArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~9까지 숫자 그리고 2~3까지 숫자가 들어있는 애들을 각각 곱한 값을 출력하시오
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		int num1 = 0;
		int num2 = 0;
		int multiple = 0;
		
		for (int i = 0; i < 9; i++) {
			list1.add(i + 1);
		}
		
		for (int i = 0; i < 2; i++) {
			list2.add(i + 2);
		}
		
		for (int i = 0; i < list1.size(); i++) {
			num1 = (int)list1.get(i);
			for (int j = 0; j < list2.size(); j++) {
				num2 = (int)list2.get(j);
				multiple = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + multiple);
			}
			System.out.println();
		}
		
		System.out.println();
		

	}

}
