package com.hanbit.oop.inheritance;

public class CellPhone extends Phone {
	private boolean portable;
	private String move;
	public final static String KIND ="휴대폰";
	public void setMove(String move){
		this.move = move;
	}
	//boolean 타입의 set 설정은 이렇게
	public void setPortable(boolean portable){
		if(portable){
			this.setMove("이동 가능");
		}
		else{
			this.setMove("이동 불가능");	
		}
		
		this.portable = portable;
		
	}
	public String getMove(){
		return move;
	}
	public boolean isPortable(){
		return portable;
	}
	@Override
	public String toString(){
		return String.format("%s이기때문에 %s상태로 %s에게 %s번호로 %s %s를 사용해서 %s이라했다.",KIND,move,super.name,super.phoneNo,super.brand,KIND,super.call);
	}
	

}
