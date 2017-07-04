package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.service.MemberService;
import com.hanbit.opp.domain.MemberBean;

public class MemberServiceImpl implements MemberService {
	MemberBean session;
	//session = String a의 변수 a라 생각하고
	//member = String b의 변수 b라고 치환해서 보자

	public MemberServiceImpl() {
		session = new MemberBean();
	}

	@Override
	public String genderCalc(MemberBean member) {
		String gender = "";
		char ch = member.getSsn().charAt(7);
		switch (ch) {
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
		return gender;
	}

	@Override
	public String ageCalc(MemberBean member) {
		int age = 0;
		String sYear = member.getSsn().substring(0, 2);
		int year = Integer.parseInt(sYear);
		int gap = 17 - year;
		age = (gap >= 0) ? 2017 - (year + 2000) + 1 : 2017 - (year + 1900) + 1;
		return String.valueOf(age);
	}

	@Override
	public String join(MemberBean member) {
		String result = "환영합니다 회원이 되셨습니다!";
		session = member;
		return result;
	}

	@Override
	public String login(MemberBean member) {
		/*String result = "";
		if (session.getPwd().equals(member.getPwd()) && session.getId().equals(member.getId()))
			result = member.toString()+"("+setGender(session)+","+setAge(session)+")";
		else if (!session.getId().equals(member.getId()))
			result = "아이디가 맞지 않습니다";
		else
			result = "비밀번호가 맞지 않습니다"; 
		return result;*/
		
		return (session.getPwd().equals(member.getPwd()) && session.getId().equals(member.getId())) ?
			"로그인 성공!"+session.getName()+"("+genderCalc(session)+","+ageCalc(session)+")" : "로그인 실패";
	}

}
