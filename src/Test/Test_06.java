package Test;

import java.util.Scanner;

public class Test_06 {
	int a,b,c;
	
	void inOut() {
		Scanner sc =new Scanner(System.in);
		System.out.print("a를 입력하세요 : ");
		a = sc.nextInt();
		System.out.print("b를 입력하세요 : ");
		b = sc.nextInt();
		
		c = a > b ? a: b;	//삼항 연산자. [조건 ? 참 : 거짓;]
		System.out.printf("두수중 큰 값은 : %d 입니다.",c);
	}
	
	public static void main(String[] args) {
		Test_06 ts = new Test_06();		// Test_06타입의 ts인스턴스에 Test_06클래스를 객체화 시킨다.
		ts.inOut();
	}

}
