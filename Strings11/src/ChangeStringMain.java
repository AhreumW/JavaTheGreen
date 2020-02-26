//StringLv4_2 객체화
public class ChangeStringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "문자열은 재밌네요의 문짝입니다 안녕하세요 자바의 문자열 요~? "
				+ "자바에서 문자열은 중요한가요 요!?"; // 기준
		
		//"문자열" 2개 바꿈
		ChangeString cs1 = new ChangeString(originStr);
		cs1.change("문자열","객체",2);
		
		System.out.println(originStr);
		System.out.println(cs1.changeStr);
		
		System.out.println("=======================");
		
		//"문자열" 3개 바꿈
		ChangeString cs2 = new ChangeString(originStr);
		cs2.change("문자열","String",3);
		
		System.out.println(originStr);
		System.out.println(cs2.changeStr);
	}

}
