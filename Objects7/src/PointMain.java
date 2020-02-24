
public class PointMain {

	//main은 static 메서드라 super나 this 사용이 불가하다. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p = new Point(7,4);
		Point3D p3 = new Point3D(1,2,3);
		
		
		
		String resultStr = "";
		
		resultStr = p.getLocation();
		System.out.println(resultStr);
		
		resultStr = p3.getLocation();
		System.out.println(resultStr);

	}

}
