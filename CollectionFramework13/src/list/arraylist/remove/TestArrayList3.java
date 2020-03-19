package list.arraylist.remove;

public class TestArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strArr = new String[4];
		
		strArr[0] = "첫번째";
		strArr[1] = "두번째";
		strArr[2] = "세번째";
		strArr[3] = "네번째";
		
		viewArr(strArr);
		
		System.out.println("strList 0번째를 지운다");
		System.out.println();
		
//		strArr1 = strArr2
		//이렇게는 절대 하지 말 것
		
		String[] strArr2 = new String[3];
		
		for (int i = 0; i < strArr2.length ; i++) {
			strArr2[i] = strArr[i + 1];
		}
		
		viewArr(strArr2);
		
	}
	
	public static void viewArr(String[] strArr) {
		String str = "";
		
		for (int i = 0; i < strArr.length; i++) {
			str = strArr[i];
			System.out.println(i + " : " + str);
		}
		System.out.println();
	}

}
