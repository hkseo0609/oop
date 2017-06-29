package com.hanbit.oop.service;

public class MemberService {
	private String id, pwd, ssn, gender, name, login, age, result, loginId, loginPwd;
	
	public void setLoingId(String loginId){
		this.loginId = loginId;
	}
	public void setLoingPwd(String loginPwd){
		this.loginPwd = loginPwd;
	}
	public void setId(String id){
		this.id = id;
	}
	public void setPwd(String pwd){
		this.pwd = pwd;
	}
	public void setSsn(String ssn){
		String sYear = ssn.substring(0,2);
		int year = Integer.parseInt(sYear);

		int gap = 17-year;
		
		if(gap>=0)
			this.age = String.valueOf(2017-(year+2000)+1);
		else
			this.age = String.valueOf(2017-(year+1900)+1); 
	}
	public void setGender(String ssn){
		char ch = ssn.charAt(7);
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
		
			
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(String age){
		this.age = age;
	}
	public void setLogin(){
		if(pwd.equals(this.loginPwd)&&id.equals(this.loginId))
			this.result = toString();
		else if(!id.equals(this.loginId))
			this.result = "아이디가 맞지 않습니다";
		else
			this.result = "비밀번호가 맞지 않습니다";
	}
	
	//get
	public String getId(){
		return this.id;
	}
	public String getPwd(){
		return this.pwd;
	}
	public String getLoingId(){
		return this.loginId;
	}
	public String getLoingPwd(){
		return this.loginPwd;
	}
	public String getSsn(){
		return this.ssn;
	}
	public String getGender(){
		return gender;
	}
	public String getName(){
		return this.name;
	}
	public String getAge(){
		return this.age;
	}
	public String getLogin(){
		return result;
	}
	public String toString(){
		return "환영합니다! "+name+"("+gender+","+age+")";
	}


}
