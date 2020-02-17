
public class test {

	public static void main(String[] args) {
		int[] number = {5,6,7,0,1,6,2,1,9,5};
		/*
		for(int i =0; i<number.length; i++) {
			System.out.print(number[i] = (int)(Math.random() * 10));
		}
		System.out.println();
		*/
		for(int i =0; i<number.length; i++) {
			boolean changed = false;
			
			for(int j=0; j<number.length-1-i;j++) {
				if(number[j] >number[j+1]) {
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
					changed = true;
					//System.out.println(number[j]+" , "+number[j+1]);
				}
			}
			
			if(!changed) break;
			
			for(int k =0; k<number.length;k++) {
				System.out.print(number[k]);
			}
			System.out.println();
		}
	}
}
