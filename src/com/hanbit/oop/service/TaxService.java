package com.hanbit.oop.service;

public class TaxService {
	public static final double rate = 0.097;
	public int tax(int money){
		
		
		int result = (int)(money*rate);
			
		return result;
			
	}			
}
