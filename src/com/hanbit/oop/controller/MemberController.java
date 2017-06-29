package com.hanbit.oop.controller;

import java.util.Scanner;

import com.hanbit.oop.service.MemberService;

public class MemberController {
	public static void main(String[] args){
		MemberService m1 = new MemberService();
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("0.system off | 1.join | 2.login\n"+"원하는 서비스의 번호를 입력하세요:");
			switch (scan.next()) {
			case "0":
				System.out.println("시스템을 종료합니다.");
			return;
			case "1":
				System.out.println("이름을 입력하세요");
				String name = scan.next();
				m1.setName(name);
				System.out.println("아이디를 입력하세요");
				String id = scan.next();
				m1.setId(id);
				System.out.println("비밀번호를 입력하세요");
				String pwd = scan.next();
				m1.setPwd(pwd);
				System.out.println("주민번호 입력하세요");
				String ssn = scan.next();
				m1.setSsn(ssn);
				m1.setGender(ssn);
				System.out.println("회원가입 성공!");
			break;
			case "2":
				System.out.println("아이디를 입력하세요");
				String loginId = scan.next();
				m1.setLoingId(loginId);
				System.out.println("비밀번호를 입력하세요");
				String loginPwd = scan.next();
				m1.setLoingPwd(loginPwd);
				m1.setLogin();
				System.out.println(m1.getLogin());
			break;

			default:
			break;
			}
			
		}
	}

}
