package Test;

import java.util.Scanner;

public class Test_08 {
	char ab;
	int a;
	
	void func () {
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력해 주세요 : ");
		ab= sc.next().charAt(0);		//입력받은 값 0번째를 변환시켜라.
		a= (int)ab;						// 강제 형변환 연산자 : 변수앖에 ()괄호 안에 기본형 타입을 넣어서 변환
		System.out.printf("입력하신 알파벳은 : %s, 숫자로 형변환시 : %d 입니다.\n",ab,a);
		sc.close();
	}
	
	void intToString() {
		for(int i = 65; i<=122; i++) {
			System.out.printf("숫자 : %d 의 아스키 코드는 : %s다 \n",i,(char)i);// 숫자를 char 타입 아스키코드로 변환
		}
		
	}
	public static void main(String[] args) {
		Test_08 ts = new Test_08();
		
		ts.func();
		ts.intToString();
	}

}
