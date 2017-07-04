package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.service.AdminService;
import com.hanbit.opp.domain.MemberBean;

public class AdminServiceImpl implements AdminService{
	//값을 공유하기 위한 생성자 설정
	MemberBean[] list, nameList;
	int addCount;
	MemberBean member;
	public AdminServiceImpl(int count) {
		addCount = 0;
		list = new MemberBean[count];

		member = new MemberBean();
	
		//list = new MemberBean[countMembers()+5]; 동적으로 받는 것
	}
	@Override
	public void addMember(MemberBean member) {
			list[addCount] = member;
			/*for(int i=0; i<(addCount+1); i++)
				System.out.println(list[i].toString());*/
			addCount++;
	}
	@Override
	public MemberBean[] getMembers() {
		return list;
	}

	@Override
	public int countMembers() {
		// TODO Auto-generated method stub
		return addCount;
	}
	@Override
	public MemberBean findByid(String id) {
		member = new MemberBean();
		for(int i=0; i<list.length; i++){
			if(list[i].getId().equals(id)){
				member = list[i];
			}			
		}
		return member;
	}
	@Override
	public MemberBean[] findName(String name) {
		int a = 0;
		for(int i=0; i<list.length; i++){
			if(name.equals(list[i].getName())){
				a++;
			}
		}
		MemberBean[] nameList = new MemberBean[a];
		int j=0;
		for(int i=0; i<list.length; i++){
			if(name.equals(list[i].getName())){
				nameList[j] = list[i];
				j++;
			}
			if(a==j)
				break;
		}
		return nameList;
	}
	@Override
	public void updatePass(MemberBean bean) {
		String update = bean.getId();
		findByid(update);
		if(bean.getId().equals(member.getId())){
			member.setPwd(bean.getPwd());
		}
		System.out.println(member.toString());

	}


}