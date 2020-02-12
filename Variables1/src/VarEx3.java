
public class VarEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		형변환 type casting
//		byte < short < int < long
//		1		2		4		8

		int score = (int)85.8;
		double dscore = 85.8;
		byte b = (byte)score;	//byte : -128~127		
		
		System.out.println(score);
		System.out.println(dscore);
		System.out.println(b);
		
	}

}
