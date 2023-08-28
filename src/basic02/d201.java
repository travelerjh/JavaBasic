package basic02;

import java.util.Scanner;

public class d201 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요");
		int i;
		i=sc.nextInt();
		System.out.printf("정수 %d를 입력하셨군요\n",i);
		
		String s;
		System.out.println("이번엔 단어를 입력하세요 ");
		s=sc.next();
		System.out.printf("단어 %s 를 입력하셨군요 ", s);
		
		System.out.println("이번엔 문장를 입력하세요 ");
		String p;
		p=sc.nextLine();
		System.out.printf("단어 를 입력하셧군요"+ p);

		
		
		System.out.println("\n"+p+s+i);
	}
}
