
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student hong = new Student("홍길동",2,1);
		
		hong.kor = 100;
		hong.eng = 60;
		hong.math = 76;
		
		hong.getTotal();
		hong.getAverage();
		
		System.out.println(hong.name + "의 전체 정보입니다.");
		System.out.println("이름: "+hong.name+" / 반: "+hong.ban+" / 번호: "+hong.no);
		System.out.println("국어 "+hong.kor+" / 영어: "+hong.eng+" / 수학: "+hong.math);
		System.out.println("총점 : "+hong.getTotal());
		System.out.println("평균 : "+hong.getAverage());
	}

}
