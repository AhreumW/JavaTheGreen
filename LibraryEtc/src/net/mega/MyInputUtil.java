package net.mega;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 외부 라이브러리란? - 시험문제
 * 
 * .jar 파일 만들기 
 * configure build path에서 Add External JARs로 jar파일 추가 
 * Referenced Libraries가 생김
 */
public class MyInputUtil {
	
	/**
	 * 사용자가 키보드로 입력한 숫자값을 반환한다. 
	 * @return int형
	 */
	public int getUserInputNumber() {		//라이브러리 쓰려면 public**
		//사용자가 잘 못 입력하면 0을 출력한다. 
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.println("숫자를 입력해주세요.");
		try {
			num = scan.nextInt();
		} catch (InputMismatchException e) {
			num = 0;
		}
		
		return num;
	}
	
	
}
