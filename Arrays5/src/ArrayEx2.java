
public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		명명규칙 
//		변수명Arr : 배열임을 알수있도록 구분시키기
		
//		배열의 초기화
//		int[] numArr = null;		//다음과 같은 이유로 null초기화는 위험해서 잘 안 씀
//		System.out.println(numArr);			//null로 출력
//		System.out.println(numArr[0]);		//에러 - nullPointException
		int[] scoreArr = {100, 90, 80};		//for문,테스트 할 때 등 값을 알고 있을 때 
		String[] nameArr = new String[3];	//자주 씀(일반적). 선언+초기화
		
		nameArr[0] = "철수";
		nameArr[1] = "상정";
		nameArr[2] = "준표";
		
		System.out.println(scoreArr[1]);
		System.out.println(nameArr[1]);
		
		//총합을 구한다.
		int sum = 0;
		
		for (int i = 0; i < 3; i++) {
			sum = sum + scoreArr[i];
		}
		System.out.println("점수의 총합 : "+ sum);

	}

}
