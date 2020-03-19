package list.arraylist.remove;
import java.util.ArrayList;
import java.util.List;

public class TestArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List strList = new ArrayList();
		
		strList.add("첫번째");
		strList.add("두번째");
		strList.add("세번째");
		strList.add("네번째");
		
		viewList(strList);
		
		removeList(strList);

	}
	
	public static void viewList(List strList) {
		String str = "";
		
		for (int i = 0; i < strList.size(); i++) {
			str = (String)strList.get(i);
			System.out.println(str);
		}
		System.out.println();
	}
	
	public static void removeList(List strList) {
//		for (int i = 0; i < strList.size(); i++) {
//			strList.remove(i);
//		}
		//삭제가 되면서 strList.size()는 계속 바뀐다.
		//배열리스트에서 하나를 삭제하면 그 바로 뒤에 오는 값으로 앞당겨 채워진다
		//즉, 배열리스트 사이즈는 줄어들고 0번째를 삭제했다면 1이였던 값이 0번째로 들어가고,
		//2번째 값이 1번째로 들어간다
		//그러므로 전부 삭제 하고 싶을 시 마지막부터 순차적으로 삭제해야한다
		
		//첫번째 부터 삭제
//		int strListSize = strList.size();
//		
//		for (int i = 0; i < strListSize; i++) {
//			strList.remove(0);
//			viewList(strList);
//		}
		//or do strList.size() + i instead of variable
		
		//마지막 부터 순차적으로 삭제하기
		//stack : push/pop
		for (int i = strList.size() - 1; i >= 0; i--) {
			strList.remove(i);
			System.out.println(strList.size());
			viewList(strList);
		}
		
		System.out.println("마지막 list 크기");
		System.out.println(strList.size());
	}

}
