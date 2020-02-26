package str.exam;

public class StringLv3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "자바를 자바라"; // 기준
		String changeStr = "";          // 결과
		String findStr = "자바";			// 찾을 문자열
		
		//1. 원본 문자열을 char[]로 저장
		char[] c = new char[originStr.length()];
		for(int i=0; i<originStr.length(); i++) {
			 c[i] = originStr.charAt(i);
			 //System.out.println(c[i]);
		}
		
		//2. 임시 문자열 temp에 char[]문자 두 개씩 저장
		String temp = "";
		for(int i=0; i<originStr.length()-1; i++) {
			temp = c[i]+""+c[i+1];
			//System.out.println(temp);
			
			//3. 두 글자 temp와  findStr("자바")가 일치하는 지 확인  -> 단, 첫번째는 아니다. 
			// 위치를 찾으면 해당 c[]배열에 저장
			if(temp.equals(findStr) && (i != 0)) {
				//System.out.println("index 위치 : "+i);
				c[i] = '잡';
				c[i+1] = '아';
				break;
			}
		}
		//4. 바뀐 c[]배열을 다시 합쳐서 changeStr에 저장
		for(int i=0; i<originStr.length(); i++) {
			changeStr = changeStr + c[i] + "";
		}

		
//		자바를 자바라를 자바를 잡아라로 변경하여 출력하시오 
		System.out.println(originStr);
		System.out.println(changeStr);
		
		
	}

}
