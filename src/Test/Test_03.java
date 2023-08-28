package Test;

import java.util.Scanner;

public class Test_03 {
	
	
	public static void main(String[] args) {
		int timer;						// 시간외수당 금액
		int overTime;					// 잔업한 시간
		int basePay;					//기본급
		double monthly;					// 월 실수령 액
		double tex;						// 세금 =>(기본급)/ 세금
	
		Scanner sc = new Scanner(System.in);
		System.out.print("기본급은 얼마 입니까? :");
		basePay = sc.nextInt();
		tex = basePay*0.1;
		System.out.print("잔업은 몇시간 하셨나요?? : ");
		overTime = sc.nextInt();
		timer = (overTime * 55000);		// 시간외 수당
		monthly = basePay+timer-tex;
		System.out.printf("실수령액은 : %s 원 입니다.",(int)monthly);
		
	}

}
