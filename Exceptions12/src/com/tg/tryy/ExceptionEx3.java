package com.tg.tryy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자만 입력");
		int n = 0;
		
		//개발자가 의도를 가지고 예외처리
		//n에 대해서 오류가 발생하면 n을 0으로 놓자.or n을 자신의 값으로 두자.
		try {
			n = scan.nextInt();
		}catch(InputMismatchException e) {
			System.out.println(e);
			e.printStackTrace();		//에러 추적
			System.out.println("예외메시지 : "+ e.getMessage());	
//			System.out.println("error");	//에러메세지를 띄우는 경우도 있지만
//			n = 0;
			n = -1;
//			등등 자신의 조건에 따라 n을 치환하게 된다.
		}
		
		System.out.println(n);
	}
}
