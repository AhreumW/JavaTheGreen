
/**
 * 
 * @author TJ
 * StudentMain에서
 * info()메서드와 
 * 학생 성적을 입력받는 형식 추가
 */
public class StudentMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Student2 hong = new Student2("홍길동",2,1);
		
		
		hong.studentInfo();
		hong.scoreInput();
		
		hong.getTotal();
		hong.getAverage();
		
		hong.totalInfo();
		
		
	}

}
