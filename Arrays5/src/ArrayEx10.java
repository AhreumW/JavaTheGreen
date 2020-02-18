/**
 * @author TJ
 * ArrayTest6_3.java 의 연계 (수정버전)
 * 
 * 여기서의 주의사항 **
 * newNumArr = numberArr;
 * 그냥 대입해버리면
 * 주소값이 같아져서 
 * newNumArr를 변경했을 때 
 * 원본인 numberArr도 바뀌는 것을 조심해야 한다.~!!
 * (-> ArrayTest6_3.java)
 */
//배열 - 관련있는 것들의 묶음
public class ArrayEx10 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		단축키 
//		alt + 화살표 왼쪽, 오른쪽
//		=> 왼쪽 오른쪽 탭 전환
		 
		int[] numberArr = new int[5];
		int[] newNumArr = new int[5];
		
		//초기화
		for(int i = 0; i<newNumArr.length;i++) {
			numberArr[i] = i+1;
		}
		
//		newNumArr = numberArr;
		//하나의 값을 하나의 변수공간에 저장 - 값 복제
		newNumArr[0] = numberArr[0];
		newNumArr[1] = numberArr[1];
		newNumArr[2] = numberArr[2];
		newNumArr[3] = numberArr[3];
		newNumArr[4] = numberArr[4];
		
		System.out.println("numberArr 출력");
		for(int i = 0; i<numberArr.length;i++) {
			System.out.println(numberArr[i]);
		}
		System.out.println("newNumArr 출력");
		for(int i = 0; i<newNumArr.length;i++) {
			System.out.println(newNumArr[i]);
		}
		
		newNumArr[0] = 10;
		numberArr[3] = 513;
		System.out.println();
		System.out.println("원본지키기");
		System.out.println("numberArr 출력");
		for(int i = 0; i<numberArr.length;i++) {
			System.out.println(numberArr[i]);
		}
		System.out.println("newNumArr 출력");
		for(int i = 0; i<newNumArr.length;i++) {
			System.out.println(newNumArr[i]);
		}
	
	}	

}