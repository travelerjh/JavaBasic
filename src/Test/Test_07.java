package Test;

import java.util.Scanner;

public class Test_07 {
	int input;
	
	void func() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 : ");
		input = sc.nextInt();
		if(input <0 || input > 100) {
			System.out.println("입력오류");
		}else {
			System.out.println("입력된 값은 : "+input);
		}
		sc.close();
	}
	public static void main(String[] args) {
		Test_07 ts = new Test_07();
		ts.func();
	}

}
