package str.exam;

public class StringLv3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "자바를 자바라"; // 기준
		String changeStr = ""; // 결과
		String tempStr = "";	//바꿀 값
		
		tempStr = "자바";		
		int idx = originStr.lastIndexOf(tempStr);
		//1. tempStr의 위치 확인
		System.out.println(idx);	//4
		//2. tempStr의 길이 확인 
		System.out.println(tempStr.length());	//2	
		//3. 확인된 위치와 길이로 원하는 범위만 조합 
		changeStr = originStr.substring(0,idx) + "잡아" 
					+ originStr.substring(idx+tempStr.length(),originStr.length());
		
		
		// 자바를 자바라를 자바를 잡아라로 변경하여 출력하시오
		System.out.println(originStr);
		System.out.println(changeStr);

	}

}
