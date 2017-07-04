package com.hanbit.oop.service;

import com.hanbit.opp.domain.GradeBean;

public interface GradeService {
	public int totalCalc(GradeBean g);
	public int avgCalc(int total);
	public String gradeCalc(int avg);

}
