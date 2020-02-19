/**
 * 
 * @author TJ
 * 
 * 출력 - ParameterTest.java와 비교
 * 	main data2.x = 10
	change data2.x: 1000
	After change
	main x = 1000

 */
public class ParameterTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Data2 data2 = new Data2();			
			int x = 0;
			
			x= 10;
			data2.x = x;
			
			System.out.println("main x = " + data2.x);
//			data2.change(data2.x); //는 에러. 파라미터가 int형
			data2.change(data2);
			
			System.out.println("After change");
			System.out.println("main x = " + data2.x);
			
			
	}

}
