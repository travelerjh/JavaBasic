package basic02;

import java.util.Scanner;

public class d209 {
	public static void main (String[]agrs) {
		
		Scanner sc = new Scanner(System.in);
		int c;
		System.out.println("몇단 찍을 까요? ");
		c= sc.nextInt();
		
		for (int i=1;i<=9;i++) {
	
			System.out.println(c*i);
		}
	}	
}
