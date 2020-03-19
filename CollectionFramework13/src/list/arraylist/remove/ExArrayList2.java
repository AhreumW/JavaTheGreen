package list.arraylist.remove;
import java.util.ArrayList;
import java.util.List;

public class ExArrayList2 {
	//메인을 우선적으로 작성
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List strList = new ArrayList();
		//다형성(Polymorphism) - 부타자참 부모 타입은 자식을 참고할 수 있다
		//List는 부모 (ArrayList 보다는 적은 영역을 활용한다)
		
		ArrayList backUpStrList = new ArrayList();
		
		strList.add("첫번째");
		strList.add("두번째");
		strList.add("세번째");
		strList.add("네번째");
		
		for (int i = 0; i < strList.size(); i++) {
			backUpStrList.add(strList.get(i));
		}
		
//		backUpStrList = strList
		//이렇게는 절대 하지 말 것 - 원본 유지가 안됨.
		
		viewList(strList);
		
		System.out.println("strList 0번째를 지운다");
		strList.remove(0);
		
		viewList(strList);
		
		System.out.println("백업:");
		viewList(backUpStrList);

	}
	
	public static void viewList(List strList) {
		String str = "";
		
		for (int i = 0; i < strList.size(); i++) {
			str = (String)strList.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
	}

}
