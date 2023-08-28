package basic02;

import java.util.Scanner;

public class d210 {

	public static void main(String[] args) {
		//영문자만 입력 가능 하고 "" 그외 문자는 "다시 입력하세요 "라는 메세지 출력해라
		//대문자 'A'65~ 'z' 91 소문자 'a'는 97 소문자 'z' 는 122
		
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("아이디를 입력하세요 ");
		str= sc.next();
		
		System.out.printf("입력된 문자열은 %s",str);
		for(int i=0;i<str.length();i++) {
			System.out.printf("[%d] 문자 :[%c] \n ",(int)str.charAt(i) ,str.charAt(i));
			if ( (int)str.charAt(i)>=65 && (int)str.charAt(i)>=97&& (int)str.charAt(i)<=122)
				System.out.println("ok");
			else {
				System.out.println("no");
			}
		}
	}
}
