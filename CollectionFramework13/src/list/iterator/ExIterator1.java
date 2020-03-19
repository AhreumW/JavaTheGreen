package list.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExIterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//맨마지막에 사용하는 출력용 (로직 짜는 곳이 아님)
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			
			System.out.println(obj);
		}

	}

}
