package com.hanbit.oop.service;

public class EvensumSerivece {
	public int even(int evensum){
		int[] arr = new int[evensum];
		for(int i=0; i<evensum; i++){
			arr[i] = i+1;
		}
		
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==0)
				sum += arr[i];
		}
				
		return sum;
			
	}

}
