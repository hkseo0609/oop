package com.hanbit.oop.service;

public class OodsumSerivece {
	public int odd(int oddsum){
		
		int[] arr = new int[oddsum];
		for(int i=0; i<oddsum; i++){
			arr[i] = i+1;
		}
		
		int sum=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2!=0)
				sum += arr[i];
		}
		
		return sum;
	}
		
}
