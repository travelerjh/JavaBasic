package basic01;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		int su  ,f ; //변수를 사용하겠다.
		String str;
		
		System.out.println("숫자를 입력하세요 : ");
		su=scanf.nextInt();  //스캐너 다음 값에 인티저를 받겠다.
		System.out.println("값 : "+su);

		System.out.println("문자를 입력하세요 : ");
		str = scanf.next();
		System.out.println("문자 : "+ str);
	}
}	
