package com.tg.test;

import java.util.ArrayList;

import com.tg.service.ScoreManager;
import com.tg.student.StudentVo;
import com.tg.subject.Subject;

public class SchoolManagerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subject subjectObj = new Subject("국어", 50);
		Subject subjectObj2 = new Subject("영어", 80);
		Subject subjectObj3 = new Subject("수학", 70);
		
		ArrayList<Object> subjectList = new ArrayList();
		
		subjectList.add(subjectObj);
		subjectList.add(subjectObj2);
		
		System.out.println(subjectList);
		
		StudentVo studentVo = new StudentVo(1, "정의광");
		
		System.out.println(studentVo);
		
		ScoreManager scoreManager = new ScoreManager();
		
		scoreManager.studentInfo(studentVo, subjectList);
		
		//변수의 재활용
		studentVo = new StudentVo(2, "박성욱");
		subjectObj = new Subject("국어", 60);
		subjectObj2 = new Subject("영어", 70);
		subjectObj3 = new Subject("수학", 50);
//		subjectList.clear(); //subjectList에 있는 내용 모두 삭제 (잘안씀)
//		대신 new로 다시 선언
		subjectList = new ArrayList();
		subjectList.add(subjectObj);
		subjectList.add(subjectObj2);
		subjectList.add(subjectObj3);
		
		scoreManager.studentInfo(studentVo, subjectList);
		
		studentVo = new StudentVo(3, "김윤진");
		subjectObj = new Subject("국어", 70);
		subjectObj2 = new Subject("영어", 80);
		subjectObj3 = new Subject("수학", 50);
		subjectList = new ArrayList();
		subjectList.add(subjectObj);
		subjectList.add(subjectObj2);
		subjectList.add(subjectObj3);
		
		scoreManager.studentInfo(studentVo, subjectList);
		
		studentVo = new StudentVo(4, "윤형식");
		subjectObj = new Subject("국어", 60);
		subjectObj2 = new Subject("영어", 90);
		subjectObj3 = new Subject("영어", 90);
		subjectList = new ArrayList();
		subjectList.add(subjectObj);
		subjectList.add(subjectObj2);
		subjectList.add(subjectObj3);
		
		scoreManager.studentInfo(studentVo, subjectList);

	}

}
