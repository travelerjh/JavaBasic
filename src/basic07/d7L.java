package basic07;

import java.util.Scanner;

public class d7L {

	public static void main(String[] args) {
		
		// 입력 / 과목 
		int su, gu,i,e,socre,cnt=0;
		int soA[][] = new int[10][10];
		String mok[ ]= {" ","국","영","수","사","과","체","물"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇명을 입력 할까요 ?");
		su= sc.nextInt();

		System.out.println("몇 과목을 입력 할까요 ?");
		gu= sc.nextInt();
		
		for(i=0 ;i<su ;i++) {
			cnt++;
			for(e=0 ;e<gu;e++) {
				System.out.println(cnt+"번째  "+ mok[e+1]+ "점수를 입력하세요" );
				socre=sc.nextInt();
				soA[i][e]=socre;
			}
		}
		
		System.out.println("---------------------------------");
		
		for(i=0 ;i<su ;i++) {
			for(e=0;e<gu;e++) {	
				System.out.print(soA[i][e] +"  ");
			}

		}
	}
}
