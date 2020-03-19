package list.arraylist.test.man;

import java.util.ArrayList;

public class ManVo {
	
	private String name = "";
	private int height = 0;
	
	public ManVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ManVo(String name, int height) {
		super();
		this.name = name;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Man [name=" + name + ", height=" + height + "]";
	}

}
