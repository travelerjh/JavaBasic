package basic03;

import java.util.Scanner;

public class d303 {
	public static void main(String[] args) {
			
		Scanner sc= new Scanner(System.in);
		int a ;
		a=sc.nextInt();
		System.out.printf("점수를 입려하세요 : %d",a);
		if(a>90) {
			System.out.println("A");
		}else if (a>70 && a<=90) {
			System.out.println("B");				
		}else if (a>50 && a<=70) {
			System.out.println("C");				
		}else {
			System.out.println("하지마 그냥 나가");
		}
		
		
	}
}
