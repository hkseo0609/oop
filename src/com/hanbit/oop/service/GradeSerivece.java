package com.hanbit.oop.service;
public class GradeSerivece {
	public String grade(String name, int kor, int eng, int math){

		//definition
		int total, avg = 0; 
		String result = "";
		
		//operation
		total = kor+eng+math;
		avg = (total/3);
		
	
		switch(avg/10){
			case 10 : 
				result = "백점";
			break;
			case 9 : 
				result = "장학금";
			break;
			case 8 : 
				result = "3학점 이수";
			break;
			case 7 : 
				result = "2학점 이수";
			break;
			case 6 : 
				result = "2학점 이수";
			break;
			case 5 : 
				result = "재수강";
			break;
			default:
				result = "학사 경고";
			break;
		}
		
		String result2 = "이름: "+name+"\t"+"등급:"+result;
		
		return result2;
		
	}

}
