//StringLv4_2 객체화
/**
 * 매개변수에 대한 설명 
 * @author TJ
 * @param changeStr : 
 * @param findStr : 
 * @param replaceStr : 
 * @param replaceNum : 
 * @param idx : 
 */
public class ChangeString {

	String changeStr = "";          // 결과
	
	public ChangeString() {
		
	}
	
	public ChangeString(String changeStr) {
		this.changeStr = changeStr;
	}
	
	
	//한 번 수행되고 버려지는 변수들은 매개변수로 하는 것이 좋다. 
	//남이 바꾸면 매개변수, 내가 바꾸면 지역변수 
	//인스턴스 변수로 지정하면 불필요한 메모리 차지
	void change(String findStr, String replaceStr, int replaceNum) {
		int idx =0;				//findStr의 위치
		
		for(int i =0; i <= (replaceNum-1) ; i++) {
			idx = changeStr.indexOf(findStr);
	//		System.out.println(idx);
			changeStr = changeStr.substring(0,idx) + replaceStr
					+ changeStr.substring(idx+findStr.length(),changeStr.length());
	//		System.out.println(changeStr);
		}
	}
	
}
