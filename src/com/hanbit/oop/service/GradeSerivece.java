package com.hanbit.oop.service;

import com.hanbit.opp.domain.GradeBean;

public class GradeSerivece {

	public int totalCalc(GradeBean g){
		return g.getKor()+g.getEng()+g.getMath();
	}
	public int avgCalc(int total){
		return total/3;
	}

	public String gradeCalc(int avg){
		String grade = "";
		switch(avg/10){
			case 10 : 
				grade = "장학금";
			break;
			case 9 : 
				grade = "A학점";
			break;
			case 8 : 
				grade = "B학점";
			break;
			case 7 : 
				grade = "C학점";
			break;
			case 6 : 
				grade = "D학점";
			break;
			case 5 : 
				grade = "F학점";
			break;
			default:
				grade = "학사경고";
			break;
		}
		return grade;
	}
}
