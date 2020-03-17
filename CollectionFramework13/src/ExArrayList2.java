import java.util.ArrayList;

public class ExArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList OneList = new ArrayList();	//1~9까지 
		ArrayList TwoList = new ArrayList();	//2~3까지
		
		
		for(int i = 0; i< 9; i++) {
			OneList.add(i+1);
		}
		for(int i = 0; i< 2; i++) {
			TwoList.add(i+2);
		}
		
		
		for(int j = 0; j< OneList.size(); j++) {
			System.out.print( OneList.get(j)+" ");
		}
		System.out.println();
		for(int j = 0; j< TwoList.size(); j++) {
			System.out.print( TwoList.get(j)+" ");
		}
		System.out.println();
		
//		ArrayList OneList로 선언하면
//		int num = OneList.get(0);에서
//		type Missmatch가 뜬다 , OneList.get(0)가 오브젝트를 반환시킨다. 
//		-> int num = (int)OneList.get(0); 형변환을 해주어야 한다. 
//		모두 int형으로 받겠다는, ArrayList<Integer> OneList로 선언해주어도 문제가 해결된다. 
		
		int result = 0;
		for(int i =0; i<OneList.size(); i++) {
			for(int j = 0; j< TwoList.size(); j++) {
				result = (int)OneList.get(i) * (int)TwoList.get(j);
				System.out.println(OneList.get(i)+ " * " + TwoList.get(j)+ " = "+ result);
			}
		}
		
		
	}

}
