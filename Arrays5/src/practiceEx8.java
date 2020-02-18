import java.util.Scanner;

public class practiceEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		배열[5]를 입력받게 해서 
//		입력 받은 순서 : 
//		정렬한 순서 : 
//		출력시키기 
//		버블정렬 3단계 	1. 이중 for문
//					2. 내부for문 조건에 i(바깥for문변수)빼기  
//						n < numArr[n].length-1-i 
//					3. boolean changed를 둬서 치환이 수행되지 않으면 for문 탈출시킴
			
		int[] numArr = new int[5];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 5개 입력해 주세요.");
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = scan.nextInt();
		}
			
		System.out.print("입력 받은 순서 :");
		for(int i=0; i<numArr.length; i++) {
			System.out.print(" " +numArr[i]);
		}
		
		
		//정렬시키기 
		//내림차순 : 100 90 80 
		int tempNum = 0;			//치환용 임시변수
		boolean changed = false;	//치환 확인
		
		for(int i= 0 ; i< numArr.length-1; i++) {
			changed = false;
			for(int j = 0; j< numArr.length-1-i; j++) {
				if(numArr[j] < numArr[j+1]) {
					tempNum = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tempNum;
					changed = true; 
				}
				if(changed == false) {
					break;
				}
			}
		}
		
		System.out.print("정렬한 순서 :");
		for(int i=0; i<numArr.length; i++) {
			System.out.print(" " +numArr[i]);
		}
		
	}

}
