package com.hanbit.oop.service;

import com.hanbit.opp.domain.MemberBean;

public interface AdminService {
	//목록을 보여주는 list / getter
	public MemberBean[] getMembers();
	//회원수 구하는 것 / getter
	public int countMembers();
	//회원 가입(join)시키는 것 / setter
	public void addMember(MemberBean member);
	public MemberBean findByid(String id);
	public MemberBean[] findName(String name);
	//비밀번호는 개인정보니까 노출이 되면 안되니 콩깍지에 넣어서 보내기
	public void updatePass(MemberBean bean);

}
