import java.util.Scanner;

/**
 * 
 * @author TJ
 * 
 */
public class FlowTest3 {

	public static void main(String[] args) {
		
		
//		1인지 0인지 판단하는 프로그램
		
		//판단할 변수
		int input = -1;
		
//		삼항연산자를 이용해서
		
//		입력한 값이 1
//		"전원을 켰습니다."
		
//		입력한 값이 0
//		"전원을 종료합니다."
		
//		1과 그 이외의 값들을 모두 켰다에 포함 
//		0만 종료
		input = 0;
		
		System.out.println("입력하신 값은 "+input);
		
		if(input >= 1) {
			System.out.println("전원을 켰습니다.");
		}else {
			System.out.println("전원을 종료합니다.");
		}
		
		
		
	}

}
