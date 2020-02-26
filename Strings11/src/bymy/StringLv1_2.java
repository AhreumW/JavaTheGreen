package bymy;

public class StringLv1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "자바를 자바라"; // 기준
		String changeStr = "";          // 결과
		String interestingStr = "";			//대상
		
//		나 -> 불필요한 배열을 쓰게 된다. 
//		String[] temp = originStr.split("바",2);
//		System.out.println(temp[1]);
//		changeStr = "db"+temp[1];
		
		// substring - 가장작은단위의 교체기술 
		// indexOf - 위치의기준
		interestingStr = "자바";
		int index = 0;
		//자바가 있음을 증명부터~!!
		index = originStr.indexOf(interestingStr);
		System.out.println(index); 		
		
		changeStr = "db" + originStr.substring(2);
		
		//replace없이
//		자바를 자바라를 db를 자바라로 변경하여 출력하시오 
		System.out.println(originStr);
		System.out.println(changeStr);
		
		
		
	}

}
