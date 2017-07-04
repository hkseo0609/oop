package com.hanbit.oop.controller;

import javax.swing.JOptionPane;
import com.hanbit.oop.service.AdminService;
import com.hanbit.oop.serviceImpl.AdminServiceImpl;
import com.hanbit.opp.domain.MemberBean;

public class AdminContoller {
	public static void main(String[] args){
		String sCount = JOptionPane.showInputDialog("관리자님 총 회원수를 입력하세요");
		AdminService service = new AdminServiceImpl(Integer.parseInt(sCount));
		MemberBean member = null;
		String sList = "";
		String nList="";
		
		while(true){
			switch(JOptionPane.showInputDialog("0.END  1.ADD  2.COUNT  3.LIST  4.FINDbyid  5.FINDbyname  6.pwdUPDATE")){
			case "0":
				JOptionPane.showConfirmDialog(null, "종료합니다.");
			return;
			case "1":
				member = new MemberBean();
				String[] arr = (JOptionPane.showInputDialog("NAME/ID/PASSWORD/SSN")).split("/");
				member.setName(arr[0]);
				member.setId(arr[1]);
				member.setPwd(arr[2]);
				member.setSsn(arr[3]);
				service.addMember(member);
				JOptionPane.showMessageDialog(null, "회원가입 성공!");
			break;
			case "2":
				JOptionPane.showMessageDialog(null, service.countMembers());
				
			break;
			case "3":
				MemberBean[] list = service.getMembers();
				JOptionPane.showMessageDialog(null, "1번째"+list[0]);
				JOptionPane.showMessageDialog(null, "2번째"+list[1]);
				
				for(int i=0; i<list.length; i++)
					sList += list[i].toString()+"\n";
				JOptionPane.showMessageDialog(null, sList);
				//JOptionPane.showMessageDialog(null, service.getMembers());
			break;
			case "4":
				//service.findByid(JOptionPane.showInputDialog("검색할 아이디를 입력하세요"));
				JOptionPane.showMessageDialog(null, service.findByid(JOptionPane.showInputDialog("검색할 아이디를 입력하세요")));
			break;
			case "5":
				MemberBean[] list2 = service.findName(JOptionPane.showInputDialog("검색할 이름을 입력하세요"));
				if(list2.length==0){
					nList ="이름이 없습니다.";
				} else{
					for(int i=0; i<list2.length; i++)
						nList += list2[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, nList);
				//JOptionPane.showMessageDialog(null, service.findName(JOptionPane.showInputDialog("검색할 이름을 입력하세요")));
			break;
			case "6": 
				MemberBean bean = new MemberBean();
				bean.setId(JOptionPane.showInputDialog("ID를 입력하세요"));
				bean.setPwd(JOptionPane.showInputDialog("변경할 PWD를 입력하세요"));
				service.updatePass(bean);
			
			break;
			
			}
		
		}
		
	}

}
