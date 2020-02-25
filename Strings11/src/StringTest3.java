
public class StringTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//절대 원본 데이터를 변경하지 않는다. 
		String originStr = "자바를 자바라"; 	//기준
		String changeStr = ""; 				//결과
		
		//ver.1
		char ch;
		ch = originStr.charAt(originStr.length()-1);
//		changeStr = String.valueOf(ch);	//char를 String화
		changeStr = ch + "";			//이게 더 빠르고 가독성높음
		System.out.println(changeStr);
		
		//ver.2
		changeStr = originStr.substring(originStr.length()-1);
		
		//문자열 안에서 마지막 문자가 무엇인지 출력하시오.
		System.out.println(originStr);
		System.out.println(changeStr);
		
	}

}
