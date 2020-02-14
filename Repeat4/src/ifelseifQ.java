/**
 * 	다음 조건에서
 * 	else와 같은 
 * 	else if의 조건을 구하시오
 * 
 *  드모르간의 법칙같은데...
 */

public class ifelseifQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str = "n";
		
		if(!(Str=="y"||Str == "n")) {
			System.out.println("하하하");
		}else {									//else와 같은 else if의 조건을 구하시오
			System.out.println("ㅇ");
		}
		
		//우리 팀 1차 답
		if(!(Str=="y"||Str == "n")) {
			System.out.println("하하하");
		}else if(Str=="y"||Str == "n") {		//80점 정답
			System.out.println("ㄹ");
		}
		
		//우리 팀 2차 답
		if(!(Str=="y"||Str == "n")) {
			System.out.println("하하하");
		}else if( !(Str=="y" && Str == "n") ) {		//100점 정답		
			System.out.println("ㄹ");
		}
		
		/* 해설 */
		if(!(Str=="y"||Str == "n")) {
			System.out.println("하하하");
		}else if( !(Str !="y" && Str != "n") ) {		//100점 정답		
			//!가 ()내부를 다 부정시킴	//== -> != , || -> && 
			System.out.println("ㄹ");
		}
		
	}

}
