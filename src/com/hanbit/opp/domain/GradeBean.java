package com.hanbit.opp.domain;

public class GradeBean {
	private int kor, eng, math;
	private String name, major;
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
	//get
	public int getKor(){
		return this.kor;
	}
	public int getEng(){
		return this.eng;
	}
	public int getMath(){
		return this.math;
	}
	public String getName(){
		return this.name;
	}
	public String getMajor(){
		return this.major;
	}
	public String toString(){
		return "";
	}

	

}
