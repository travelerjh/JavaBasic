package basic07;

import java.util.Scanner;

public class d705 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int jumA[][] = new int[10][10];
		int jumsu,i,ii,cnt=0;
		int suu , moksu;
		String[] mokA= {"","국","영","수","사","과","체"}; //맨 앞은 비워두다.
		
		
		System.out.println("몇 명 입력할껀가요 ?");
		suu =sc.nextInt();
		
		System.out.println("몇과목을 입력할껀가요 ?");
		moksu=sc.nextInt();
		
		for(i=1;i<=suu;i++) {
			cnt++;
			for(ii=1 ; ii<=moksu;ii++) {
				System.out.println("\n"+cnt+"번 "+ mokA[ii]+"어점수 :");
				jumsu=sc.nextInt();
				jumA[i][ii] =jumsu;
			}
		}
		
		System.out.println("------------");
		for(i=1;i<=suu;i++) {
			System.out.print(mokA[i]+"\t");

		}
		System.out.println();
		
		for(i=1;i<=suu;i++) {
			System.out.print(i+"번  ");
			
			for(ii=1 ; ii<=(moksu+2);ii++) {
			System.out.print(jumA[i][ii] +"   ");
			}
			System.out.println();
		}
		
		
	}
}



