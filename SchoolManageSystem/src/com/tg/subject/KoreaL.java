package com.tg.subject;

public class KoreaL {
	
	private String name = "";
	private int score = 0;

	//생성자
	public KoreaL() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KoreaL(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	//getter/setter
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

	//toString
	@Override
	public String toString() {
		return "KoreaL [name=" + name + ", score=" + score + "]";
	}
	
}
