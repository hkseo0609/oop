package com.hanbit.oop.service;
public class LeapyearSerivece {
	public String leapyear(int year){
		/*연도를 4개로 나눈값이 0이라면 윤년일수 있다.
		그러나 해당 연수가 100으로 나누어 떨어지면 평년이다.
		2000년은 4로 나눈값이 0이라서 윤년일 수 있는데 
		다시 이 값이 100으로 나눠 떨어지면 평년
		평년이라해도 다시 400으로 나눠 떨어지는 연도는 윤년이다. */
		

		String result = "";
		
		/*if((year%4)==0){
			if((year%100)==0)
				result = "평년";
			else 
				result = "윤년";
		}
		else {
			if((year%400)==0)
				result = "윤년";
			else
				result = "평년";
		}
		
		System.out.print(result); */
		
		
		if(((year%4)==0 && (year%100)!=0) || (year%400)==0)
			result = "윤년";
		else
			result = "평년";
		
		System.out.print(result);
		
		return result;
		
	
	}	

}
