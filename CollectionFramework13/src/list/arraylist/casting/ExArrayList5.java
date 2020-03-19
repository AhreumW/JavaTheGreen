package list.arraylist.casting;

import java.util.ArrayList;

public class ExArrayList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//<String>은 특수해서 알아서 형변환이 된다.
		ArrayList<String> titleStrList = new ArrayList();
		
		titleStrList.add("인베이젼스");
		titleStrList.add("이노베이션");
		titleStrList.add("오벨리스크");
		titleStrList.add("다운풀");
		
		for (int i = 0; i < titleStrList.size(); i++) {
			System.out.println(titleStrList.get(i));
		}

	}

}
