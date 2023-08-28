package Test;

import java.util.Scanner;

public class Test_02 {
	static int money,man, chun, bak, ship;
	
	static void celc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("화폐 출금기 입니다.");
		System.out.printf("츨금하식 금을 입력해주세요 : ");
		money = sc.nextInt();
		
		man = money/10000;
		System.out.printf("만원 : %d 장\n", man);
		money -= man*10000;
		
		chun = money/1000;
		System.out.printf("천원 : %d 장\n", chun);
		money -= chun*1000;
		
		bak = money/100;
		System.out.printf("백원 : %d 장\n", bak);
		money -= bak*100;
		
		ship = money/10;
		System.out.printf("십원 : %d 장\n", ship);
		money -= ship*10;
		
		System.out.printf("나머지 : %d 원\n", money);
		
		sc.close();
	}
	
	public static void main(String[] args) {
		celc();
	
	}

}
