package list.arraylist.test.man;

import java.util.ArrayList;

public class ManMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ManVo man1 = new ManVo("박상아", 161);
		ManVo man2 = new ManVo("원아름", 160);
		ArrayList<ManVo> manList = new ArrayList();

		manList.add(man1);
		manList.add(man2);

		System.out.println(man1);
		System.out.println(man2);
		
		int sum = 0;

		for (int i = 0; i < manList.size(); i++) {
			sum = sum + manList.get(i).getHeight();
		}

		System.out.println("사람수 : " + manList.size());
		System.out.println("키 총합 : " + sum);

	}
}
