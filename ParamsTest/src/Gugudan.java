import java.util.Scanner;

/**
구구단이 존재한다. -> 클래스

속성
단을 입력받을 수 있다. -> 인스턴스 변수

단을 학생들이 입력할 수 있습니다. 스스로 배우는 거죠	-> 메서드
주제는 스마트 구구단이라고 한다. -> 생성자

입력된 단을 출력한다. -> 메서드
============
단을 입력해주세요 >> 7
*/
public class Gugudan {

	int dan = 0;
	String title = "";
	
	

	Gugudan(String title){
		this.title = title;
	}
	
	void info() {
		System.out.println(title);
	}
	
	void input(){
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 단을 입력하세요 >> ");
		dan = scan.nextInt();
		scan.close();
		System.out.println();
	}
	
	void output() { 
		int result = 0;
		for(int i = 0; i<9 ; i++) {
			result = dan * (i+1);
			System.out.println(dan+" * "+ (i+1) +" = "+result);
		}
	}
	
	
	
	

}
