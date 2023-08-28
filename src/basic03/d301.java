package basic03;

import java.util.Scanner;

public class d301 {
	//종합선물세트 이거 풀면됨
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);		
		while (true) {
			
			int a ,b,c ,sum, p;
			String pass;
			
			System.out.println("국어성적 입력하세요 ");
			a=sc.nextInt();
			System.out.println("영어성적 입력하세요 ");
			b=sc.nextInt();
			System.out.println("수학성적 입력하세요 ");
			c=sc.nextInt();
			sum=a+b+c;
			System.out.printf("총점은 %d 입니다 \n",sum);
			p=sum/3;
			System.out.printf("평균은 %d 입니다",p);

			System.out.println(p);
			if(p>=90) {
				System.out.println("A학점 입니다");
			} else if(p>=80 && p<90){
				System.out.println("B학점 입니다");
			}else if(p>=70 && p<80){
				System.out.println("C학점 입니다");
			}else if(p>=60 && p<70){
				System.out.println("D학점 입니다");
			}else {
				System.out.println("F학점 입니다");
			}
			pass= (p>60)?"합격":"불합격";
			System.out.println(pass);

			System.out.println("y/n 선택해 진행 할꺼야?");
			String yes ;
			yes= sc.next();
			if(yes.equals("y")) {
				continue;
				
			}else {
				break;
			}
			
		
		}
		
		
		
	
	
	}
}		
		
