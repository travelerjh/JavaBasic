package basic01;

import java.util.Scanner;

public class D1B {
	// 클래스 영역 : 맴버변수 , 맴버함수만 올수 있다.
	static void who() {
		System.out.printf("\n너 누구니?");
	}
	
	static void iam(int no) {
		System.out.printf("\n 난 %d 번째 난쟁이야 ",no+1);
		System.out.println();
		
	}
	
	public static void main(String[] args) {

//		who(); iam(1);
//		who(); iam(2);
//		who(); iam(3);
//		who(); iam(4);
//		who(); iam(5);
//		who(); iam(6);
//		who(); iam(7);		
//		who();
//		Scanner sc = new Scanner(System.in);
//		int i= sc.nextInt();
//		iam(i);
//		
		for (int i=0;i<=6 ;i++) {
			iam(i);
	}

		
		
	}
}