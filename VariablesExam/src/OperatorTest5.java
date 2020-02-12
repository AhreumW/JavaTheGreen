
public class OperatorTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1인지 0인지 판단하는 프로그램
		
		//판단할 변수
		int input = 0;
		
//		삼항연산자를 이용해서
		
//		입력한 값이 1
//		"전원을 켰습니다."
		
//		입력한 값이 0
//		"전원을 종료합니다."
		
		//다중 삼항 연산자 			// "는 \"로 출력시킬 수 있다. 
		String result = "";
		result = (input == 1) ? "입력하신 값은 " + input + "\n\"전원을 켰습니다.\"" 
				: (input == 0) ? "입력하신 값은 " + input + "\n\"전원을 종료합니다.\"" 
						: "입력하신 값은 " + input + "\n\"잘못입력하셨습니다.\"";
		System.out.println(result);
		
		
		/* 
		//내풀이
		String on ="";
		on = (input == 1) ? "전원을 켰습니다." : "" ;
		
		String off ="";
		off = (input == 0) ? "전원을 종료합니다." : "";
		
		System.out.println(on + off);
		*/
	}

}
