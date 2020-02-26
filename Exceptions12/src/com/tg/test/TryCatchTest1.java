package com.tg.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		사용자의 입력을 받아서 주사위 숫자를 맞추는 프로그램을 만드시오
//		예외 발생시 잘못입력했습니다. 
//		프로그램이 종료됩니다.
		
		int userNum = 0;	//사용자 숫자
		int diceNum = 0;	//주사위 숫자
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("주사위가 돌아갑니다.");
		diceNum = (int)(Math.random()* 6 + 1);
		//System.out.println(diceNum);		//정답 미리보기
		
		System.out.println("숫자를 입력해주세요.");
		try {
			userNum = scan.nextInt();
			if(userNum == diceNum) {
				System.out.println("숫자를 맞췄습니다.");
			}else{
				System.out.println("틀렸습니다.");
				System.out.println("정답은 : "+ diceNum);
			}
			
		} catch(InputMismatchException e) {
			System.out.println("잘못입력했습니다.");
		} finally {			//예외여부와 상관없이 마지막 프로그램이 종료.
			System.out.println("프로그램이 종료됩니다.");
		}
		
		
		
	}

}
