package com.hanbit.oop.serviceImpl;



public class SsnSerivece {
	public String ssn(String sname, String snumber){

		String sYear = snumber.substring(0,2);
		int year = Integer.parseInt(sYear);

		int age = 0;
		int gap = 17-year;
		
		if(gap>=0)
			age = 2017-(year+2000)+1;
		else
			age = 2017-(year+1900)+1; 
		
		/*삼항연산자
		age = (gap>=0) ? 2017-(year+2000)+1 : 2017-(year+1900)+1; */
		
		char ch = snumber.charAt(7);
		String gender = "";
		
		switch(ch){
			case '1':
			case '3':
				gender = "남성";
			break;
			
			case '2':
			case '4':
				gender = "여성";
			break;
			
			case '5':
			case '6':
				gender = "외국인";
			break;
			
			default:
				gender = "오류";
			break;
		}
		
		String result ="이름:"+sname+"\t성별:"+gender+"\t나이:"+age;
		
		return result;

		
	}

}
