package basic01;

import java.util.Scanner;

public class Inputdata {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a;
		String b,c;
	
		System.out.println("숫자를 입력하세요 ");
		a=sc.nextInt();
		System.out.printf("입력한 숫자는 %d 입니다.",a);
	
		System.out.println("문자를 입력하세요");
		b=sc.next();
		System.out.printf("\n입력한 문자는 %s 입니다",b);
		
		
	}
}
