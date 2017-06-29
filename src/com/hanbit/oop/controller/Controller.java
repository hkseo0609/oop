package com.hanbit.oop.controller;
import java.util.Scanner;
import com.hanbit.oop.service.CalcService;
import com.hanbit.oop.service.EvensumSerivece;
import com.hanbit.oop.service.GradeSerivece;
import com.hanbit.oop.service.LeapyearSerivece;
import com.hanbit.oop.service.LoginSerivece;
import com.hanbit.oop.service.OodsumSerivece;
import com.hanbit.oop.service.SsnSerivece;
import com.hanbit.oop.service.TaxService;
import com.hanbit.oop.service.TimeService;

public class Controller {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CalcService s1 = new CalcService();
		EvensumSerivece s2 = new EvensumSerivece();
		OodsumSerivece s3 = new OodsumSerivece();
		GradeSerivece s4 = new GradeSerivece();
		LeapyearSerivece s5 = new LeapyearSerivece();
		LoginSerivece s6 = new LoginSerivece();
		TaxService s7 = new TaxService();
		SsnSerivece s8 = new SsnSerivece();
		TimeService s9 = new TimeService();
		
		String result = "";

		//stream 처리
		while(true){
			System.out.println("0.SYSTEM OFF | 1.BMI | 2.Evensum | 3.Oddsum | 4.Grade \n"
					+ "5.leapyear | 6.Login | 7.TaxCalculator | 8.ssn | 9.time | 10.pulsCalc");
			System.out.print("원하시는 번호를 입력하세요 :");
			
			switch(scan.next()){
			case "0":
				System.out.print("END");
			return;
			
			case "1": 
				System.out.print("(주의:키가 179cm일 경우 1.79로 표기)\n"+"Enter height : ");
				double height = scan.nextDouble();
				System.out.print("Enter weight : ");
				double weight = scan.nextDouble();
				
				result = s1.calcbmi(height, weight);
				 
				System.out.println(String.format("나의 체질량지수(BMI) : %s",result));
			break;
			
			case "2": 
				System.out.print("짝수의 합을 구할 숫자를 입력하세요 : ");
				int evensum = scan.nextInt();
				int sum = s2.even(evensum);
				System.out.println("짝수의 합 :"+sum);
			break;
			
			case "3":
				System.out.print("홀수의 합을 구할 숫자를 입력하세요 : ");
				int oddsum = scan.nextInt();
				int sum2 = s3.odd(oddsum);
				System.out.println("홀수의 합: "+sum2);
			break;
			
			
			case "4":  
				System.out.print("이름을 입력하세요 : ");
				String name = scan.next();
				System.out.print("국어 점수 : ");
				int kor = scan.nextInt();
				System.out.print("영어 점수 : ");
				int eng = scan.nextInt();
				System.out.print("수학 점수 : ");
				int math = scan.nextInt();
				
				result = s4.grade(name, kor, eng, math);
				System.out.println(result);
			break;
			
			case "5":  
				System.out.print("연도를 입력하세요 : ");
				int year = scan.nextInt();
				
				result = s5.leapyear(year);
				System.out.println(String.format("%d는 %s입니다.",year,result));
			break;
			
			case "6":  
				System.out.print("아이디를 입력하세요 :");
				String id = scan.next();
				System.out.print("비밀번호를 입력하세요 :");
				String pwd = scan.next();
				result = s6.login(id, pwd);
				System.out.println(result);
			break;
			
			case "7":
				System.out.print("연봉을 입력하세요 : ");
				int money = scan.nextInt();
				int taxmoney = s7.tax(money);
				System.out.println(String.format("납부할 세금은 %d입니다.",taxmoney));
			break;
			
			case "8": 
				System.out.print("이름을 입력하세요 : ");
				String sname = scan.next();
				System.out.print("주민등록번호를 입력하세요 : ");		
				String snumber = scan.next();
				result = s8.ssn(sname, snumber);
				System.out.println(result);
			break;
			case "9":
				System.out.print("초를 입력하세요: ");
				int inputsecond = scan.nextInt();
				result = s9.time(inputsecond);
				System.out.println(result);
			break;
			case "10":
				System.out.print("Enter First Number :");
				int a = scan.nextInt(); 
				System.out.print("Enter Second Number :");
				int c = scan.nextInt();
				int puls= s1.calcPuls(a,c);
				System.out.println(puls);
			break;
				
			}
		}
		
	}
}

