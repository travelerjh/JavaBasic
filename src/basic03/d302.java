package basic03;

import java.util.Scanner;

public class d302 {

	static void input_screen() {
		System.out.println("1.입력화면입니다");
	}
	static void search_screen() {
		System.out.println("2.조회화면입니다");
	}	
	static void update_screen() {
		System.out.println("3.수정화면입니다");
	}
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		int y;
		
		while (true) {
		System.out.println("작업번호를 입력하세요 ");	
		System.out.println("1.입력");
		System.out.println("2.조회");
		System.out.println("3.수정");
		System.out.println("4.출력");
		System.out.println("5.종료");
		y=sc.nextInt();
		System.out.printf("작업 번호 : %d 를 입력했습니다. \n",y );

		switch(y) { // y는 문자 ,수식
			case 1 :{
				input_screen();
				
				while(true) {
				String product,model;
				int in;
				System.out.println("\n상품명 입력하세요");
				product =sc.next();
				System.out.printf("\n 상품평 : %s",product);
				System.out.println("\n규격 입력하세요");
				in=sc.nextInt();
				System.out.printf("\n 규격 %d",in);
				System.out.println("\n 모델 입력하세요");
				model =sc.next();
				System.out.printf("\n 모델 : %s",model);
				
				System.out.printf("입력하신 상품명은 : %s 규격 %d   모델 : %s  ",product,in,model);
				
				System.out.println(" \n 다시 입력하껀가요 ? (y/n)");
				String str;
				str=sc.next();
		
				if(str.equals("y")) {
					continue;
				}else {
					break;
				}
				
				}
			}break;
			case 2 :{
				search_screen();
			}break;
			case 3 :{
				update_screen();
			}break;
			case 4 :{
				System.out.println("4.출력화면입니다"); 
			}break;
			case 5 :{
				System.out.println("5.종료화면입니다"); 
			}break;
			default: System.out.println("선택번호를 확인하고 다시 입력해주세요");
				
		}
		
		
		
		
		if(y>1 && y<7) {
			break; 
		 } else {
			System.out.println("다시 입력 하세요");
			continue;
		 }
		}

	
	}
}
