package com.hanbit.oop.serviceImpl;

public class TaxService {
	public static final double rate = 0.097;
	public int tax(int money){
		
		
		int result = (int)(money*rate);
			
		return result;
			
	}			
}
