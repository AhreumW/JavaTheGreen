import java.util.Scanner;

/**
 * 반복 구구단 
============
단을 입력해주세요 >> 7
*/
public class Gugudan2 {

	int dan = 0;
	String title = "";
	
	String end = "n";
	boolean repeat = true;
	

	Gugudan2(String title){
		this.title = title;
	}

	void info() {
		System.out.println(title);
	}
	
	void input(){
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 단을 입력하세요 >> ");
		dan = scan.nextInt();
		System.out.println();
	}
	
	void output() { 
		int result = 0;
		for(int i = 0; i<9 ; i++) {
			result = dan * (i+1);
			System.out.println(dan+" * "+ (i+1) +" = "+result);
		}
	}
	
	void end() {
		Scanner scan = new Scanner(System.in);
		System.out.println("종료하시겠습니까?( y / n )");
		end = scan.nextLine();
		if(end.equals("y")) {
			repeat = false;
		}else {
			repeat = true;
		}
	}
	
	
	

}
