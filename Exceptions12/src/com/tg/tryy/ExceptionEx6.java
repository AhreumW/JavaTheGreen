package com.tg.tryy;

import net.mega.MyInputUtil;

public class ExceptionEx6 {
	
//	외부 라이브러리 사용
//jar 파일 생성할 때
//export java source file and resource 를 선택하면
//외부라이브러리의 소스코드도 볼 수 있게 된다. 
	public static void main(String[] args) {
		
		//추가한 jar파일의 메서드 사용 가능
		MyInputUtil miu = new MyInputUtil(); 
		
		int n = miu.getUserInputNumber();
			
		System.out.println(n);
		
	}

}
