
public class StudentVo {
	
	private String name;	//학생이름
	private int ban;	//반
	private int no;		//번호
	private int kor;	//국어점수
	private int eng;	//영어점수
	private int math;	//수학점수 
	
	
	public StudentVo() {
		super();
	}

	public StudentVo(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

	
	@Override
	public String toString() {
		return "StudentVo [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}
	
	
	

}
