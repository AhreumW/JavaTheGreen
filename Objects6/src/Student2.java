import java.util.Scanner;

public class Student2 {
	
	String name = "";
	int ban = 0;
	int no = 0;
	int kor = 0;
	int eng = 0;
	int math = 0;
	
	
	Student2(){
		
	}
	
	Student2(String name, int ban, int no){
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	
	void stuInput() {
		System.out.println("학생들 정보를 입력해 주세요.");
		System.out.print("이름 : ");
		
		System.out.println();
	}
	
	void studentInfo() {		//학생정보
		System.out.println("이름 "+name+" / 반: "+ban+" / 번호: "+no);
	}
	
	void scoreInput() {		//국영수 성적입력
		Scanner scan = new Scanner(System.in);
		System.out.println(name+"의 국어성적을 입력하세요.");
		kor = scan.nextInt();
		System.out.println(name+"의 영어성적을 입력하세요.");
		eng = scan.nextInt();
		System.out.println(name+"의 수학성적을 입력하세요.");
		math = scan.nextInt();
	}
	
	int getTotal() {		//국영수 총점
		return kor + eng + math;
	}
	
	double getAverage() {		//국영수 평균
		double avg = 0;
		avg = getTotal() / 3.0;
		return (int)(avg * 100+0.5)/100.0;
	}
	
	void totalInfo() {		//학생 + 성적 정보
		System.out.println(name + "의 전체 정보입니다.");
		System.out.println("반: "+ban+" / 번호: "+no);
		System.out.println("국어 "+kor+" / 영어: "+eng+" / 수학: "+math);
		System.out.println("총점 : "+getTotal());
		System.out.println("평균 : "+getAverage());
	}
	
	
}
