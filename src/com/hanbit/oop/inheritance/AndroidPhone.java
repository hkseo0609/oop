package com.hanbit.oop.inheritance;

public class AndroidPhone extends IPhone{
	private String size, appl;
	private final static String BRAND = "갤럭시노트";
	public void setSize(String size){
		this.size = size;
	}
	public void setAppl(String appl){
		this.appl = appl;
	}
	public String getSize(){
		return size;
	}
	public String getAppl(){
		return appl;
	}
	@Override
	public String toString(){
		return String.format("%s이기때문에 %s상태로 %s에게 %s번호로 %s인치 %s를 사용해서 %s라고 %s을 전송했다.",
				KIND,super.getMove(),name,phoneNo,size,BRAND,super.getData(),appl);
	}

}
