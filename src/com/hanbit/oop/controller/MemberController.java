package com.hanbit.oop.controller;

import com.hanbit.oop.service.MemberService;
import com.hanbit.opp.domain.MemberBean;
import javax.swing.*;

public class MemberController {
	public static void main(String[] args){
		MemberService m1 = new MemberService();
		MemberBean member = new MemberBean();
	
		
		while(true){
			//System.out.println("0.system off | 1.join | 2.login\n"+"원하는 서비스의 번호를 입력하세요:");
			switch (JOptionPane.showInputDialog("0.system off | 1.join | 2.login\n")) {
			case "0":
				JOptionPane.showMessageDialog(null, "시스템을 종료합니다.");
			return;
			case "1":
				member.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
				member.setId(JOptionPane.showInputDialog("아이디를 입력하세요"));
				member.setPwd(JOptionPane.showInputDialog("비밀번호를 입력하세요"));
				member.setSsn(JOptionPane.showInputDialog("주민번호를 입력하세요"));
				//setter
				JOptionPane.showMessageDialog(null, m1.join(member));
				
			break;
			case "2":
				MemberBean temp = new MemberBean();
				temp.setId(JOptionPane.showInputDialog("아이디를 입력하세요"));
				temp.setPwd(JOptionPane.showInputDialog("비밀번호를 입력하세요"));
				JOptionPane.showMessageDialog(null, m1.login(temp));;
			break;

			default:
			break;
			}
			
		}
	}

}
