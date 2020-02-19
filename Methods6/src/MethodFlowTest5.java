/** 
 * 
 * @author TJ
 * 디버그
 * 실행순서를 확인할 수 있음(증명)
 */
//FirstClass5.java와 함께 참고
public class MethodFlowTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstClass5 cs = new FirstClass5();
		
		FirstClass5 ccss = new FirstClass5();
// 중단점 breakPoint	
// resume(F8)로 바로 건너감
		cs.firstMethod();
		
		ccss.fourth();
		
	}

}
