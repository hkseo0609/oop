package com.hanbit.oop.service;
public class TimeService {
	public String time(int inputsecond){
		
		int hour = inputsecond/3600;
		int minute = (inputsecond/60)%60;
		int second = inputsecond%60;
		
		String result = inputsecond+"초는 "+hour+"시간 "+minute+"분 "+second+"초 입니다.";
	
		return result;
	}
}
