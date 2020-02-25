package edu.tg;		//패키지 먼저

import java.text.SimpleDateFormat;		//그 다음 import
//import java.util.Calendar;
//import java.util.Scanner;
//import java.util.Date;
//import java.util.ArrayList;
import java.util.*;			//util에 관련된 모든 클래스를 활용할 수 있음. 
// * (애스테리크) = 모든 경우

/*
 	import문
 	소스코드를 작성할 때 다른 패키지의 클래스를 사용하려면 패키지명이 포함된 클래스 이름을 사용해야 한다. 
 	하지만 매번 패키지명을 붙여서 작성하기란 여간 불편한 일이다. 클래스의 코드를 작성하기 전에 import문으로 
 	사용하고자 하는 클래스의 패키지를 미리 명시해주면 소스코드에 사용되는 클래스 이름에서 패키지명은 생략할 수 있다. 
 */
/*
	일반적인 소스파일(*.java)의 구성은 다음의 순서로 되어있다. 
	1. package문
	2. import문
	3. 클래스 선언
	
	import문 표현식
		import 패키지명.클래스명;
		or
		import 패키지명.*;
*/
public class ImportTest {

	public static void main(String[] args) {
		Date today = new Date();
		/*
		 *  원래 패키지명까지 포함된 클래스명을 써야하는데 
			java.util.Date today = new java.util.Date();
			import로 미리 명시하여 Date클래스만 쓸 수 있다. 
		*/
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd E");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println(date.format(today));
		String timeStr = time.format(today);
		System.out.println(timeStr);
		
		
		
	}
}
