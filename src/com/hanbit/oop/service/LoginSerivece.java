package com.hanbit.oop.service;
public class LoginSerivece {
	public static final String USER_ID="hee";
	public static final String USER_PWD="1234";

	public String login(String id, String pwd){
		
		String result = "";
		
		
		if(!pwd.equals(USER_PWD))
			result = "비밀번호가 맞지 않습니다";
		else if(!id.equals(USER_ID))
			result = "아이디가 맞지 않습니다";
		else
			result = "로그인 성공";
		
		return result;
	}

}
