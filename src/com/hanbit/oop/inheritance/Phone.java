package com.hanbit.oop.inheritance;

public class Phone {
	protected String name, phoneNo, brand, call;
	public final static String KIND="집전화";
	
	
	public void setName(String name){
		this.name = name;
	}
	public void setPhoneNo(String phoneNo){
		this.phoneNo = phoneNo;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}

	public void setCall(String call){
		this.call = call;
	}
	//get
	public String getName(){
		return name;
	}
	public String getPhoneNo(){
		return phoneNo;
	}

	public String getBrand(){
		return brand;
	}
	public String getCall(){
		return call;
	}
	public String toString(){
		return String.format("%s에게 %s번호로 %s %s를 사용해서 %s이라했다.",name,phoneNo,brand,KIND,call);
	}

}
