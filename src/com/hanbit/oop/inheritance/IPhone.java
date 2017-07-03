package com.hanbit.oop.inheritance;

public class IPhone extends CellPhone {
	private String data;
	// KIND는 스마트폰이라고 오버라이딩
	public final static String KIND ="스마트폰";
	public final static String BRAND ="아이폰";
	public void setData(String data){
		super.setPortable(true);
		this.data = data;
	}
	public String getData(){
		return data;
	}
	@Override
	public String toString(){
		return String.format("%s이기때문에 %s상태로 %s에게 %s번호로 %s를 사용해서 %s라고 문자를 전송했다.",
				KIND,super.getMove(),super.name,super.phoneNo,BRAND,data);
	}

}
