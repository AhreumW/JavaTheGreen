
public class HomeMain {

 	public static void main(String[] args) {
		
 		Home home1 = new Home(3, 7, true);
 		Home home2 = new Home(1, 10, false);
 		
 		home1.homeInfo();
 		System.out.println("==============");
 		
 		home2.floor = 2;
 		home2.homeInfo();
 		
 		
	}
	
}
