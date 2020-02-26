
public class HashCodeEx1 {

	public static void main(String[] args) {
		
//		문자열 비교 - equals
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
//		== :. 주소값 비교 , new로 서로다른 객체가 만들어짐
		System.out.println("abc" == "abc");		//true - 상수풀 영역
		System.out.println("abc" == str1);		//false
		System.out.println(str1 == str2);		//false
		System.out.println(str1.equals(str2));	//true
//		.equals()은 해쉬코드를 비교해서 같으면 true가 나오는 것
		
//		.hashCode() : Object에서 상속받은 메서드
		System.out.println("abc".hashCode());		//상수풀 intern pool관련
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
//		.identityHashCode() : 실 주소 값, 유일값
		System.out.println(System.identityHashCode(str1));	
		System.out.println(System.identityHashCode(str2));
	}

}
