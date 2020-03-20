package com.tg.subject;

public class MathL {
	
	private String name = "";
	private int score = 0;
	public MathL() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MathL(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "MathL [name=" + name + ", score=" + score + "]";
	}
	
}
