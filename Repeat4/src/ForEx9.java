/**
 * + 다중for문에서 위치에 따른 break의 차이 익히기 
 * 	for(){
 * 		for(){
 * 			1. break;
 * 		}
 * 		2. break;
 * 	}
 */

public class ForEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		continue문
//		진짜 특별한 경우 아니면 가능한 안쓰는게 좋음
		
		
		for(int i =0; i<=10; i++) {
			if(i % 3 == 0) {
				System.out.println("짝");
				continue;			//밑의 코드와 상관없이 처음으로 건너뜀
			}
			System.out.println(i);
		}
		
		/*
//		조건문
		삼항 vs switch vs if 
		삼항 : 수행 속도가 제일 높다, 3가지 경우(맞다, 틀렸다, 기본)- 보기에도 단순한 경우 사용.
			 가독성이 낮다. 
		switch : 맵핑, 분기문 설정에 유용(일치화)
		if : 가장 일반적.
			if문으로 구현이 가능하다->삼항,스위치문도 구현가능하다.(역은 안될수있음)
		
//		반복문
		for vs while vs do-while
		for : 가장 쉽다, 가독성 높음, 정확한 수치, 범위를 아는 경우 사용.
		while : 무한루프, 미지의 수치(+몇 번할 지 모를 경우) 
		do-while : while과 유사
		*/
		
		
	}

}
