
public class Tv {
	
	boolean power; //전원 ( on/off )
	int volume;
	String name = "Tv";
	
	void info() {
		System.out.println("==== "+name+" Information ====");
		System.out.println("전원 : " + power);
		System.out.println("볼륨 : " + volume);
	}
	
	
//	void power() {
//		power = !power;
//	}
//	
//	void soundUp() {
//		volume++;
//	}
//	
//	void soundDown() {
//		volume--;
//	}
	
	
}