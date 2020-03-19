package list.arraylist.casting;

import java.util.ArrayList;

public class TestArrayList6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~4까지
		//list에 담아서 모든 숫자의 총합을 구하시오
		//메인에서 메서드 만들어서, 리턴 없이 출력
		//가능한 제너릭 쓰자
		ArrayList<Integer> numList = new ArrayList();
		
		for (int i = 0; i < 4; i++) {
			numList.add(i + 1);
		}
		
		showSum(numList);

	} 
	
	public static void showSum(ArrayList<Integer> numList) {
		int sum = 0;
		
		for (int i = 0; i < numList.size(); i++) {
			sum = sum + numList.get(i);
		}
		System.out.println("총합: " + sum);
	}

}
