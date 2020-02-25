
public class Student{

	StudentVo stu = new StudentVo();
//	int sum = 0;
//	double avg = 0;
	
	Student() {
	}
	
	Student(StudentVo s) {
		s = new StudentVo();
	}
	
	
	int getTotal() {
		int sum = 0;
		sum = stu.getKor()+ stu.getEng() + stu.getMath();
		return sum;
	}
	

	double getAverage() {
		double avg = 0;
		double result = 0;
		avg = getTotal() / 3;
		result = (int)(avg/100+ 0.5) * 100.0;
		return result;
	}
	
}
