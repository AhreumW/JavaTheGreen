package com.tg.subject;

public class Subject {
	
	private String name = "";
	private int score = 0;

	//생성자
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(String name, int score) {
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

	@Override
	public String toString() {
		return "Subject [name=" + name + ", score=" + score + "]";
	}	
	
}
