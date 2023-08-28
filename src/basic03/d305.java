package basic03;

import java.util.Scanner;

public class d305 {

	public static void main(String[] args) {

		// 정수를 입력하는데 1~3 사이의 숫자를 입력하세요  그외에 숫자는 "오류" 
		Scanner sc = new Scanner(System.in);
			int no = sc.nextInt();
		if(no>0 &&no<4) {
			System.out.println("잘했어");
			switch(no) { 
			case 1: {
				System.out.println("초보");
			}break;
			case 2: {
				System.out.println("중급");
			}break;
			case 3: {
				System.out.println("고급");
			}break;
			default : System.out.println("너 뭐하냐 ?");
			}
			

					
		}else {
			System.err.println("error");
		}
	
		
		
	}
}
