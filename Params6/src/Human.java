
public class Human {

	String gender = "";
	String hair = "";
	int height = 0;
	
	Human(){
		
	}
	
	Human(String g, String ha, int h){
		gender = g;
		hair = ha;
		height = h;
	}
	
	void HumanInfo(){
		System.out.println("제 친구는 "+gender+"이고,");
		System.out.println(hair +" 헤어스타일이며," );
		System.out.println("키는 "+height+"입니다.");
		System.out.println("=================");
	}
	
}
