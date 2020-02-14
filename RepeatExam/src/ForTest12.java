import java.util.Scanner;

/**
 * @author TJ
 * 스마트 구구단
 * 사용자가 원하는 단만 출력하는 프로그램
 * 사용자가 0을 누르면 종료한다.
 * 2 * 1 = 2 2* 2 = 4 ...
 */
public class ForTest12 {
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int find = 2;		//검색할 단 2
		int num = 1;
		int mul = 0;		//결과 1
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("몇 단을 검색해보시겠습니까?(종료는 0)");
		find = scan.nextInt();
		
		System.out.println("======="+find+"단=======");
		//구구단 
		while(find != 0) {
			//while(num<=20) {		//for문 써도 됨
			for(num = 1; num <= 20; num++) {	
				mul = find * num;
				System.out.print(find +" * "+num+" = " +mul+"\t\t");
				if(num % 5 == 0) {
					System.out.println();
				}
				//num++;	//while문일 경우 사용
			}
			
			num = 1; //초기화			
			System.out.println("\n");
			System.out.println("원하시는 단을 입력해주세요.(종료는 0)");
			find = scan.nextInt();
			if(find != 0) {
				System.out.println("======="+find+"단=======\t");
			}
		}
		System.out.println("구구단이 종료되었습니다.");
		
		scan.close();
	}

}
