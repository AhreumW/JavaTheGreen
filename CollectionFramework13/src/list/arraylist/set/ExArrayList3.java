package list.arraylist.set;
import java.util.ArrayList;
import java.util.List;

public class ExArrayList3 {
	//메인을 우선적으로 작성
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List strList = new ArrayList();
		
		strList.add("첫번째");
		strList.add("두번째");
		strList.add("세번째");
		strList.add("네번째");
		
		viewList(strList);
		
		//수정하기
		//.set(바꿀index 위치, 바꿀값);
		strList.set(3, "4");
		
		viewList(strList);

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
