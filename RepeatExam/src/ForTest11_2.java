import java.util.Scanner;

/**
 * 
 * @author TJ
 * 중첩 while문 
 * 구구단
 * 원하는 구구단 찾기 
 */

public class ForTest11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int find1 = 2;		//검색할 단 1
		int find2 = 3;		//검색할 단 2
		int num = 1;
		int mul1 = 0;		//검색1의 결과 1
		int mul2 = 0;		//검색2의 결과 2
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("몇 단과 몇 단을 검색해보시겠습니까?");
		find1 = scan.nextInt();
		find2 = scan.nextInt();
		
		System.out.print("======="+find1+"단=======\t");
		System.out.println("======="+find2+"단=======");
		//구구단 
		while(find1 != 0 && find2 != 0) {
			while(num<=9) {
				mul1 = find1 * num;
				mul2 = find2 * num;
				System.out.print(find1 +" * "+num+" = " +mul1+"\t\t");
				System.out.println(find2 +" * "+num+" = " +mul2);
				num++;
			}
			num = 1;
			
			System.out.println();
			System.out.println("원하시는 단을 두 개 입력해주세요.(종료는 0)");
			find1 = scan.nextInt();
			find2 = scan.nextInt();
			if(find1 != 0 && find2 != 0) {
				System.out.print("======="+find1+"단=======\t");
				System.out.println("======="+find2+"단=======");
			}
		}
		System.out.println("구구단이 종료되었습니다.");
		
		scan.close();
	}

}
