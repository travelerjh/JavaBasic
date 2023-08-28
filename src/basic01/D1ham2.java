package basic01;

import java.util.Scanner;

public class D1ham2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int no ,str;
		int a=5000;
		int b=6000;
		int c=7000;
		
		System.out.println("메뉴선택 프로그램");
		System.out.println("1.불고기 버거");
		System.out.println("2.치즈 버거");
		
		no= sc.nextInt();
				
		if(no==1) {
			System.out.printf("1.불고기 버거를 선택했습니다.");
			System.out.println("\n숫자를 입력하세요");
			str= sc.nextInt();
			System.out.printf("\n 총%d개를 주문하셨군요",str);
		    int hap=str*a;
			System.out.printf("\n주문하신 불거기버거는 총%d 개 , 총 %d 값입니다.",str, hap);
		}
		if(no==2) {
			System.out.printf("2.치즈버거를 선택했습니다.");
			System.out.println("\n숫자를 입력하세요");
			str= sc.nextInt();
			System.out.printf("\n 총%d개를 주문하셨군요",str);
		    int hap=str*b;
			System.out.printf("\n주문하신 불거기버거는 총%d 개 , 총 %d 값입니다.",str, hap);
		}
		
		else {
			System.out.println("다시 메뉴를 선택해주세요 ");
		}
	}
}
