package com.hanbit.oop.service;

import java.util.Scanner;

public class CalcService {
	public String calcbmi(double height, double weight){
		
		double bmi = weight / ((height)*(height));
		String result;
		
		if (bmi <= 30){
			if(bmi <= 18.5)
				result = "저체중";
			else if(bmi > 25)
				result = "과체중";
			else
				result = "정상";
		}
		
		else
			result = "비만";
		
		return result;
	}
	
	public int calcPuls(int a, int c){
		int result = a+c;
		return result;
	}
	
}	
	
	
