package list.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//리스트를 하나 더 만든다
		//2, 100을 넣고, 구구단을 만든다
		//결과를 리스트에 담는다
		
		List<Integer> list2 = new ArrayList();
		
		list2.add(2);
		list2.add(100);
		
		List<Integer> resultNumList = new ArrayList();
		
		for (int i = 0; i < list2.size(); i++) {
			for (int n = 0; n < list.size(); n++) {
				resultNumList.add(list2.get(i) * list.get(n));
			}
		}
		
		Iterator<Integer> it = resultNumList.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			
			System.out.println(obj);
		}
		
	}

}
