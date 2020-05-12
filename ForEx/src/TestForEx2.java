import java.sql.Array;
import java.util.ArrayList;

public class TestForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		월화수목금토일 리스트에 담고 출력
		
//		String[] dayArr = {"월","화","수","목","금","토","일"};
//
//		for(int i=0; i<dayArr.length; i++) {
//			System.out.println((i+1)+" "+dayArr[i]);
//		}
//		
//		System.out.println();
//		
//		int count = 0;
//		for(String dayStr : dayArr) {
//			count++;
//			System.out.println(count+" "+dayStr);
//		}
	
		ArrayList<String> dayList = new ArrayList<String>();
		
		dayList.add("월");
		dayList.add("화");
		dayList.add("수");
		dayList.add("목");
		dayList.add("금");
		dayList.add("토");
		dayList.add("일");

		for(int i=0; i<dayList.size(); i++) {
			System.out.println((i+1)+" "+dayList.get(i));
		}
		
		System.out.println();
		
		int count = 1;
		for(String dayStr : dayList) {		//index가 없기때문에 일반 for문보다 활용도가 낮다. 
			System.out.println(count+" "+dayStr);
			count++;
			
//			다른사람코드, indexOf 사용, 단 indexOf는 count보다 느리다.
//			System.out.println((dayList.indexOf(dayStr)+1)+" "+dayStr);
		}
		
		
		
	}

}
