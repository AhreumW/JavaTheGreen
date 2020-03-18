import java.util.ArrayList;
import java.util.List;

public class ExArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List 부모 - ArrayList 자식
		//부타자참 : 부모타입은 자식을 참조할 수 있다.
		//한쪽을 List로 쓴다는 건 다형성을 이용하겠다는 이야기 
		List strList = new ArrayList();
		
		strList.add("첫번째");
		strList.add("두번째");
		strList.add("세번째");
		strList.add("네번째");
		
		viewList(strList);
		
		System.out.println("strList 0번째를 지운다.");
		strList.remove(0);
		System.out.println();
		
		viewList(strList);
		
	}

	public static void viewList(List strList) {
		
		String str = "";
		
		for (int i = 0; i < strList.size(); i++) {
			str = (String)strList.get(i);
			System.out.println(i+ " : " + str);
		}
		System.out.println();
		
	}
	
	
}
