package com.hanbit.oop.service;

public class CalendarService {
	private int year, month, date, day;
	
	public void setYear(int year){
		this.year = year;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public void setDate(int date){
		this.date = date;
	}
	public void setDay(int day){
		this.day = day;
	}
	//get
	public int getYear(){
		return this.year;
	}
	public int getMonth(){
		return this.month;
	}
	public int getDate(){
		return this.date;
	}
	public int getDay(){
		return this.day;
	}
	public String toString(){
		return year+"년"+month+"월"+date+"일"+"  "+day;
	}

}
