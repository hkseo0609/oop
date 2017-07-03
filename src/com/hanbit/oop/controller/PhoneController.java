package com.hanbit.oop.controller;

import com.hanbit.oop.inheritance.AndroidPhone;
import com.hanbit.oop.inheritance.CellPhone;
import com.hanbit.oop.inheritance.IPhone;
import com.hanbit.oop.inheritance.Phone;
import javax.swing.*;
public class PhoneController {
	public static void main(String[] args){
		Phone p1 = new Phone();
		CellPhone nokia = new CellPhone();
		IPhone iPone = new IPhone();
		AndroidPhone android = new AndroidPhone();
		while(true){
			switch(JOptionPane.showInputDialog("0.끊기  1.집전화  2.휴대폰  3.아이폰  4.갤럭시노트")){
			case "0":
				JOptionPane.showMessageDialog(null,"전화를 끊습니다.");
			return;
			case "1":
				p1.setName(JOptionPane.showInputDialog("통화할 상대방 이름을 입력하세요."));
				p1.setPhoneNo(JOptionPane.showInputDialog("통화할 상대방 전화번호를 입력하세요."));
				p1.setBrand(JOptionPane.showInputDialog("통화할 상대방 전화기 브랜드를 입력하세요."));
				p1.setCall(JOptionPane.showInputDialog("통화할 내용을 입력하세요."));
				JOptionPane.showMessageDialog(null, p1.toString());
			break;
			case "2":
				nokia.setPortable(true);
				nokia.setName(JOptionPane.showInputDialog("통화할 상대방 이름을 입력하세요."));
				nokia.setPhoneNo(JOptionPane.showInputDialog("통화할 상대방 전화번호를 입력하세요."));
				nokia.setBrand(JOptionPane.showInputDialog("통화할 상대방 전화기 브랜드를 입력하세요."));
				nokia.setCall(JOptionPane.showInputDialog("통화할 내용을 입력하세요."));
				JOptionPane.showMessageDialog(null, nokia.toString());
			break;
			case "3":
				iPone.setName(JOptionPane.showInputDialog("상대방 이름을 입력하세요."));
				iPone.setPhoneNo(JOptionPane.showInputDialog("상대방 전화번호를 입력하세요."));
				iPone.setData(JOptionPane.showInputDialog("문자 내용을 입력하세요."));
				JOptionPane.showMessageDialog(null, iPone.toString());
			break;
			case "4":
				android.setName(JOptionPane.showInputDialog("상대방 이름을 입력하세요."));
				android.setPhoneNo(JOptionPane.showInputDialog("상대방 전화번호를 입력하세요."));
				android.setSize(JOptionPane.showInputDialog("핸드폰이 몇인치인지 입력하세요"));
				android.setData(JOptionPane.showInputDialog("문자 내용을 입력하세요."));
				android.setAppl(JOptionPane.showInputDialog("사용할 어플을 입력하세요"));
				JOptionPane.showMessageDialog(null, android.toString());
			break;
			}
		}
		
	}

}
