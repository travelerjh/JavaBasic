package Test;

import java.util.Scanner;

public class Test_05 {
	static float under, height, wide;
	
	static void print() {
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변의 길이를 입력해주세요 : ");
		under = sc.nextFloat();
		System.out.print("높이 길이를 입력해주세요 : ");
		height = sc.nextFloat();
		
		wide = (under*height)/2;
		
		System.out.printf("넓이 : %.2f\n",wide);		
	}
	
	public static void main(String[] args) {
		print();
	}

}
