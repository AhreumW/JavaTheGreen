/**
 * @author TJ
 * 치환 테스트
 */
public class ArrayTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myNum = 10;
		int youNum = 0;
		int tempNum = 0;

//		youNum = myNum;
//		myNum = youNum; 
//		치환
		tempNum = myNum;
		myNum = youNum;
		youNum = tempNum;
		
		
		System.out.println("myNum: "+ myNum);
		System.out.println("youNum: "+ youNum);
	}

}
