package com.hanbit.oop.service;
public class GradeSerivece {
	//filed
	private int kor, eng, math, total, avg;
	private String grade, name, major;
	public void setName(String name){
		this.name = name;
	}
	public void setMajor(String major){
		this.major = major;
	}
	public void setKor(int kor){
		this.kor = kor;
	}
	public void setEng(int eng){
		this.eng = eng;
	}
	public void setMath(int math){
		this.math = math;
	}
	public void setTotal(){
		this.total = kor+eng+math;
	}
	public void setAvg(){
		this.avg = total/3;
	}
	
	//getter는 this 생략 가능 / 이유: 값이 없으면 가까운 필드값을 찾기 때문에
	public int getKor(){
		return this.kor;
	}
	public int getEng(){
		return this.eng;
	}
	public int getMath(){
		return this.math;
	}
	public int getTotal(){
		return this.total;
	}
	public int getAvg(){
		return this.avg;
	}
	public String getName(){
		return this.name;
	}
	public String getMajor(){
		return this.major;
	}
	public void setGrade(){
		setTotal();
		setAvg();
		switch(avg/10){
			case 10 : 
				this.grade = "1년 장학금";
			break;
			case 9 : 
				this.grade = "1학기 장학금";
			break;
			case 8 : 
				this.grade = "3학점 이수";
			break;
			case 7 : 
				this.grade = "2학점 이수";
			break;
			case 6 : 
				this.grade = "2학점 이수";
			break;
			case 5 : 
				this.grade = "재수강";
			break;
			default:
				this.grade = "학사 경고";
			break;
		}
		
	}
	public String getGrade(){
		return this.grade;
	}
	public String toString(){
		return "------------------------------\n"
				+"이름	전공	   성적\n"
				+name+"\t"+major+"\t"+grade+"\n"
				+"------------------------------\n";
	}

}
