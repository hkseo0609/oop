package com.hanbit.oop.service;

import com.hanbit.opp.domain.MemberBean;

public interface MemberService {
	//interface에서는 abstract 키워드를 빼도 추상메소드로 인지한다.
	public String genderCalc(MemberBean member);
	public String ageCalc(MemberBean member);
	public String join(MemberBean member);
	public String login(MemberBean member);

}
