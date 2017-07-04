package com.hanbit.oop.controller;


import com.hanbit.oop.service.GradeService;
import com.hanbit.oop.serviceImpl.GradeServiceImpl;
import com.hanbit.opp.domain.GradeBean;

import javax.swing.*;

public class GradeController {
	public static void main(String[] args) {
		GradeService g1 = new GradeServiceImpl();
		GradeBean gb = new GradeBean();
		//stream 처리
		while(true){
			switch(JOptionPane.showInputDialog("0.SYSTEM OFF  1.Grade")){
			case "0":
				JOptionPane.showMessageDialog(null, "END");
			return;
			
			case "1":
				gb.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
				gb.setMajor(JOptionPane.showInputDialog("전공을 입력하세요"));
				gb.setKor(Integer.parseInt(JOptionPane.showInputDialog("국어 점수를 입력하세요")));
				gb.setEng(Integer.parseInt(JOptionPane.showInputDialog("영어 점수를 입력하세요")));
				gb.setMath(Integer.parseInt(JOptionPane.showInputDialog("수학 점수를 입력하세요")));
				JOptionPane.showMessageDialog(null, g1.gradeCalc(g1.avgCalc(g1.totalCalc(gb))));
			break;
			}
		}
	}
}

