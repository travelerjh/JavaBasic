package basic02;

import java.util.Scanner;

public class d206 {
	
	void func() {
		Scanner sc = new Scanner(System.in);
		int a ,b;
		String yn;
		while (true) {
			System.out.println("숫자를 입력하세요 :");
			a =sc.nextInt();
			System.out.println("숫자를 입력하세요 :");
			b=sc.nextInt();
			String result;
			result = a>b ? a+"가"+b +"보다작다" :  a+"가"+b +"보다크다";
			System.out.println(result);
			System.out.println("또 하실 건가요 ?");
			yn=sc.next();
			if(yn.equals("y")) {
				continue;
			}else {
				break;
			}
			
		}
		/*
		if (a<b) {
			System.out.printf(" %d가 %d 보다 큽니다 ",a,b);				
		}else if(a>b) {
			System.out.printf("%d가 %d 보다 큽니다 ",a,b);
		}else {
			System.out.printf("찾았군요 둘은 같습니다");
		}
		*/
		
		
		
		
		
	
	}
	
	
	public static void main(String[] args) {
		//  삼항 연산자 
		//  두수를 입력 받아서 큰수를 찾아내는 프로그램을 작서하라
	
		d206 d2 =new d206();
		d2.func();
		
		
		
		
		
	}
}
