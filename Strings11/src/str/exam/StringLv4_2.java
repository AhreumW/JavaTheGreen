package str.exam;

//어떤 글자든 원하는 키워드를 원하는 갯수 만큼만 변경해준다
//ex:
//문자열은 재밌네요의 문짝입니다 안녕하세요 자바의 문자열 요~? 자바에서 문자열은 중요한가요 요!?
//위의 문장에서 문자열 2개를 객체로 바꾼다면  
//객체은 재밌네요의 문짝입니다 안녕하세요 자바의 객체 요~? 자바에서 문자열은 중요한가요 요!?
//위의 문장에서 문자열 3개를 인스턴스로 바꾼다면  
//인스턴스은 재밌네요의 문짝입니다 안녕하세요 자바의 인스턴스 요~? 자바에서 인스턴스은 중요한가요 요!?
public class StringLv4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "문자열은 재밌네요의 문짝입니다 안녕하세요 자바의 문자열 요~? 자바에서 문자열은 중요한가요 요!?"; // 기준
		String changeStr = "";          // 결과
	
		String findStr = "문자열";	//찾는 문자열
		String replaceStr = "객체";	//변경된 문자열
		int replaceNum = 2; 	//변경을 원하는 개수
		int idx =0;				//findStr의 위치


		if(replaceNum != 0) {
			//처음 findStr의 인덱스값을 찾아서 replaceStr로 대체시킴.
			idx = originStr.indexOf(findStr);
			changeStr = originStr.substring(0,idx) + replaceStr
						+ originStr.substring(idx+findStr.length(),originStr.length());
			
			//변경된 changeStr을 바탕으로 (replaceNum-1)번 더 반복 
			for(int i =0; i <= (replaceNum-1)-1 ; i++){	
				idx = changeStr.indexOf(findStr);
				 
				changeStr = changeStr.substring(0,idx) + replaceStr
						+ changeStr.substring(idx+findStr.length(),changeStr.length());
				//System.out.println(changeStr);
			}
		}else if(replaceNum == 0){	//바꾸고 싶지 않을 때 
			changeStr = originStr;
		}
		
		System.out.println(originStr);
		System.out.println(changeStr);
		

		
		
		
	}

}
