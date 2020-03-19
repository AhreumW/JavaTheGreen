package list.arraylist.add_get;
import java.util.ArrayList;

public class ExArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] numArr = new int[10];
		ArrayList list = new ArrayList(10); //list인터페이스를 구현함
		//명명 규칙! numList, nameList 형태로 뒤에 List로 줄것!
		//가변: 10이라는 숫자는 사실 큰 의미가 없다. 10개 이상으로 값을 추가해도 알아서 늘어난다
		//숫자를 빼는 것이 좋다
		//배열 대신 쓸 것!
		//ArrayList에는 객체(object) 타입으로 값이 들어간다.
		//즉, 리스트에 숫자를 넣었다 해도, int로 출력하고 싶다면 형변환을 해줘야한다.
		
//		for (int i = 0; i < numArr.length; i++) {
//			numArr[i] = i + 1;
//		}
		
		//순서 보장
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
//		for (int i = 0; i < numArr.length; i++) {
//			System.out.println(numArr[i]);
//		}
		
//		list.get(0);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//1~9까지 숫자 그리고 2~3까지 숫자가 들어있는 애들을 각각 곱한 값을 출력하시오
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		for (int i = 0; i < 9; i++) {
			list1.add(i + 1);
		}
		
		
		

	}

}
