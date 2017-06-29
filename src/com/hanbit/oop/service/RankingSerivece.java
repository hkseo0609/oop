package com.hanbit.oop.service;

import java.util.Scanner;

public class RankingSerivece {
	public static void main(String[] args){ 
		
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		String[] name = new String[3];
		for(int i=0; i<3; i++){
			System.out.print("이름을 입력하세요: ");
			name[i] = scan.next();
			System.out.print("점수를 입력하세요: ");
			arr[i] = scan.nextInt();
		}
		
		String[] result1 = new String[3];
		int[] result2 = new int[3]; 

		
		if (arr[0]>arr[1] && arr[0]>arr[2]){
			result2[0] = arr[0];
			result1[0] = name[0];
			if(arr[1]>arr[2]){
				
				result2[1] = arr[1];
				result2[2] = arr[2];
				
				result1[1] = name[1];
				result1[2] = name[2];
				
			}
			else{
				
				result2[1] = arr[2];
				result2[2] = arr[1];
		
				result1[1] = name[2];
				result1[2] = name[1];
				
			}	
		}	
		else if (arr[1]>arr[0] && arr[1]>arr[2]){
			result2[0] = arr[1];
			result1[0] = name[1];
			if(arr[0]>arr[2]){
				result2[1] = arr[0];
				result2[2] = arr[2];

				result1[1] = name[0];
				result1[2] = name[2];

			}	
			else{
				result2[1] = arr[2];
				result2[2] = arr[0];

				result1[1] = name[2];
				result1[2] = name[0];
			}
		}		
		else {
			result2[0] = arr[2];
			result2[0] = arr[2];
			if(arr[0]>arr[1]){
				result2[1] = arr[0];
				result2[2] = arr[1];
				
				result1[1] = name[0];
				result1[2] = name[1];
			}	
			else{
				result2[1] = arr[1];
				result2[2] = arr[0];
				
				result1[1] = name[1];
				result1[2] = name[0];
			}	
		} 
		
		for(int i=0; i<3; i++){
			System.out.print((i+1)+"등 이름:"+ result1[i] + " 점수: " + result2[i] +"\n");
		}
	}

}
