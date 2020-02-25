
public class ScoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentVo s = new StudentVo("홍길동", 2,1,100,60,76);
		Student hong = new Student(s);
		
		System.out.println(hong.getTotal());
		System.out.println(hong.getAverage());
		
	}

}
