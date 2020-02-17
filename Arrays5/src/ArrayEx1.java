
public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score1 = 0;
		int score2 = 0;
		int score3 = 0;
		int score4 = 0;
		int score5 = 0;
		
		System.out.println(score1);
		System.out.println(score2);
		System.out.println(score3);
		System.out.println(score4);
		System.out.println(score5);
		
		System.out.println("==========배열 시작==========");
		
//		배열(Array) : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
//		표현식 
//		타입[] 변수이름;
		int[] scoreArr = null;	// 선언문, 기본값 : null
		scoreArr = new int[5];	// **	//scoreArr에 int[5]의 주소값이 들어옴
		scoreArr[0] = 1;
		
		System.out.println(scoreArr);		//주소값
		System.out.println(scoreArr[0]);	//주소값에서 0번째 인덱스 값
		System.out.println(scoreArr[1]);
		System.out.println(scoreArr[2]);
		System.out.println(scoreArr[3]);
		System.out.println(scoreArr[4]);
		
		System.out.println("==========for+배열==========");
		for(int i = 0; i<5; i++) {
			scoreArr[i] = i+1;
			System.out.println("배열["+i+"] = "+scoreArr[i]);
		}
	}

}
