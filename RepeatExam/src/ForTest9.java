/**
 * 
 * @author TJ
 * 4 - I can do it.
 * 3 - I can do it.
 * 2 - I can do it.
 * 1 - I can do it.
 * 0 - I can do it.
 */

public class ForTest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int count = 4;
		String msg = "";
		
		while(count >= 0) {
			switch(count) {
				case 4: 
					msg =" - I";
					break;
				case 3: 
					msg =" - I can";
					break;
				case 2: 
					msg =" - I can do";
					break;
				case 1: 
					msg =" - I can do it";
					break;
				case 0: 
					msg =" - I can do it~!!";	
					break;
			}
			System.out.println(count + msg);
			count--;
		}
		
		
		
	}

}
