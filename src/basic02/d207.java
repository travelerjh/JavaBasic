package basic02;

import java.util.Scanner;

public class d207 {
	public static void main(String[] args) {
//
//		char c , d;
//		c= 'A';
//		d= '홍';
//		System.out.println(c);
	
		String str;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<130 ; i++) {
			System.out.printf("\n숫자 : %d",i);
			System.out.printf("숫자 : %c",(char)i);
			if(i%10==0) {
				System.out.println("\n");
				str= sc.nextLine();
				if(str.equals("")) {
					continue;
				}else {
					break;
				}
			}
			
		}
		
		
	}
	
}
