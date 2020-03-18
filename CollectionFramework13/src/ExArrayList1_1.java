import java.util.ArrayList;

public class ExArrayList1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
//		가변, 개수를 지정하지 않는다. 
		
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
		
//		데이터 추가 : list.add(i)
//		순서를 보장함
		for(int i = 0; i< 10; i++) {
			list.add(i+1);
		}
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
//		System.out.println(list.get(4));
		
//		데이터 불러오기 : list.get(i)
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
		
	}

}
