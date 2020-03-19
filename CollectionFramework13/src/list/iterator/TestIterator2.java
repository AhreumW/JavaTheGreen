package list.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		랜덤수 출력 프로그램
//
//		6개의 숫자를 임의로 받아서 출력하시오
//		2, 4, 34, 2, 50, 1
		
		List<Integer> numList = new ArrayList();
		
		for (int i = 0; i < 6; i++) {
			numList.add((int) (Math.random() * 100) + 1);
		}
		
		Iterator<Integer> it = numList.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			
			System.out.print(obj);
			if(it.hasNext()) {
				System.out.print(", ");
			}
		}
		
	}

}
