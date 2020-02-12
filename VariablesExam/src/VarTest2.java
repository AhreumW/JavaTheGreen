
public class VarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		jdk => 운영체제 -> jvm(자바 가상 머신)
				
		System.out.println(""+"");		//''는 안됨
		System.out.println(true +"");	//true 예약어 그대로 나옴
		System.out.println('A'+'B');	//''는 숫자끼리의 +로 인식, "A"+"B"로 해야 문자열로 나옴
		System.out.println('1'+2);			//51
		System.out.println((char)('1'+2));	//3
		System.out.println('1'+'2');
		System.out.println('J'+"ava");
//		System.out.println(ture + null);	//error
		System.out.println("ture" + null);	//truenull
//		System.out.println(null);	//error
		
		String name = "Ja" + "va";
		String str = name + 8.0;
		
//		기본값 : 0, 0.0, false, "", ' '('/u0000')
		
		System.out.println(name);
		System.out.println(str);
		//"" 빈문자 : 아무런 영향을 주지 않음.
		System.out.println(7 + 7 + "");		//14
		System.out.println("" + 7 + 7);		//7
		
		System.out.println(7 + " " == "7 ");	//true
		System.out.println(7 + " " == "7");		//false
	}

}
