
public class HumanMain {

 	public static void main(String[] args) {
		
 		Human human1 = new Human();
 		Human human2 = new Human("여자","짧은",158);
 		
 		
 		human1.gender = "여자";
 		human1.hair = "긴";
 		human1.height = 160;
 		
 		
 		human1.HumanInfo();
 		human2.HumanInfo();
 		
 		
 		
 		
	}
	
}
