public class Student {
	
	String name = "";
	int ban = 0;
	int no = 0;
	int kor = 0;
	int eng = 0;
	int math = 0;

	Student(){
		
	}
	
	Student(String name, int ban, int no){
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	
	int getTotal() {		//국영수 총점
		return kor + eng + math;
	}
	
	double getAverage() {		//국영수 평균
		double avg = 0;
		avg = getTotal() / 3.0;
		return (int)(avg * 100+0.5)/100.0;
	}
	
	
}
