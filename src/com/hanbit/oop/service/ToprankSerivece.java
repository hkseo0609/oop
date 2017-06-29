package com.hanbit.oop.service;

import java.util.Scanner;

public class ToprankSerivece {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("총 학생 수는 몇명입니까?");
		int a = scan.nextInt();
		int[] score = new int[a];
		
		for(int i=0; i<a; i++){
			System.out.print("학생의 평균 점수를 입력하세요:");
			int grade = scan.nextInt();
			score[i] = grade;
		}
		
		int sum = 0;
		for(int i=0; i<score.length; i++){
			sum += score[i];
		}
		
		int avg = sum / score.length;
		int max =0;
		int min = score[0];
		
		for(int i=0; i<score.length; i++){
			if(score[i]>max){
				max = score[i];
			}
			else if(score[i]<min)
				min = score[i];
		}
		
		System.out.print("1반의 평균 점수는: "+avg+"\n");
		System.out.print("최고 점수는: "+max+"\n");
		System.out.print("최저 점수는?: "+min+"\n");
		
		String result = "학급 평균: "+avg+"\t최고 점수: "+max+"\t최저 점수: "+min;
		
		
		
		
		
	}

}
