package basic03;

import java.util.Scanner;

public class d30test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국영수 성적을 입력하세요
		// 총점 , 평균 구하세요 
		// ABC F 학점 구하세요 
		// 계속할껀가요 ?
		
		while (true) {
			
		
		Scanner sc= new Scanner(System.in);
		System.out.println("국어성적을 입력하세요");
		int gu=sc.nextInt();
		System.out.printf("국어성적은  %d 입니다 ",gu);
		
		System.out.println("수학성적을 입력하세요");
		int su=sc.nextInt();
		System.out.printf("수학성적은  %d 입니다 ",su);
		
		System.out.println("영어성적을 입력하세요");
		int en=sc.nextInt();
		System.out.printf("영어성적은  %d 입니다 ",en);
	
		System.out.printf("\n 당신의 국어 성적은 %d 수학 성적은 %d 영어 성적은 %d 입니다",gu,su,en);
		int hap= gu+su+en;
		System.out.println("당신의 총점은"+hap+"입니다");
		int p= hap/3;
		System.out.println("평균은"+p+"입니다 ");
		
		if(p>90) {
			System.out.println("당신은 A학점입니다."+p);
		}else if(p>70 && p<=90) {
			System.out.println("당신은 B학점입니다."+p);
		}else if(p>60 && p<=70) {
			System.out.println("당신은 C학점입니다."+p);
		}else {
			System.out.println("공부 다시하세요 "+p);
		}
	
		System.out.println("다른분의 성적도 입력하겠습니까?(Y/N)");
		String yes=sc.next();
		if(yes.equals("y")){
			continue;
		}else {
			break;
		}
		
		}
		
		
	}
}
