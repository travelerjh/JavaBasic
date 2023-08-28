package Test;

import java.util.Scanner;

public class Test_09 {
	long ko,en,mat;
	double hap;
	double avg;
	String hak;
	
	void func () {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		ko = sc.nextLong();
		System.out.print("영어 점수를 입력하세요 : ");
		en = sc.nextLong();
		System.out.print("수학 점수를 입력하세요 : ");
		mat = sc.nextLong();
		
		hap = ko + en+ mat;
		avg = hap/3;
		if(avg >=90) {
			hak = "A";
		}else if(avg >= 80) {
			hak = "B";
		}else if(avg >= 70) {
			hak = "C";
		}else if(avg >= 60) {
			hak = "D";
		}else {
			hak = "F";
		}
		System.out.printf("국영수 총점은 : %.0f , 평균은 : %.0f , 평균학점은 : %s 입니다.\n", hap, avg, hak);
	}
	public static void main(String[] args) {
		Test_09 ts = new Test_09();
		ts.func();
	}

}
