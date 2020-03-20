package com.tg.test;

import com.tg.service.ScoreManager;
import com.tg.student.StudentVo;
import com.tg.subject.EnglishL;
import com.tg.subject.KoreaL;
import com.tg.subject.MathL;

public class SchoolManagerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EnglishL englishL = new EnglishL("영어", 80);
		System.out.println(englishL);
		KoreaL koreaL = new KoreaL("국어", 90);
		System.out.println(koreaL);
		MathL mathL = new MathL("수학", 100);
		System.out.println(mathL);
		
		StudentVo studentVo = new StudentVo(1, "원아름", koreaL, englishL, mathL);
		
		EnglishL englishL2 = new EnglishL("눈높이영어", 95);
		System.out.println(englishL);
		KoreaL koreaL2 = new KoreaL("눈높이국어", 80);
		System.out.println(koreaL);
		MathL mathL2 = new MathL("눈높이수학", 90);
		System.out.println(mathL);
		
		StudentVo studentVo2 = new StudentVo(2, "박상아", koreaL2, englishL2, mathL2);
		
		System.out.println(studentVo);
		System.out.println(studentVo2);
		
		ScoreManager scoreManager = new ScoreManager();
		
		scoreManager.setScoreTotal(studentVo);
		scoreManager.studentInfo(studentVo);
		
		scoreManager.setScoreTotal(studentVo2);
		scoreManager.studentInfo(studentVo2);

	}

}
