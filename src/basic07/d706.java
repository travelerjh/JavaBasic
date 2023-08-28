package basic07;

import java.util.Scanner;

public class d706 {

	public static void main(String[] args) {
		
//		com_su = (int)(Math.random*100+1)
// 		숫자 게임 
		 //컴퓨터 난수 입력 , 난수값, 
		//   숫자 입력
		
		System.out.println("숫자 만들기게임");
		
		int comSu ,mySu , count=0;
		
		Scanner sc = new Scanner(System.in);
		comSu = (int)(Math.random()*100+1);
		System.out.println("숫자를 입력하세요 기회는 20번 입니다");
		while(count <20) {
			mySu=sc.nextInt();
			System.out.printf("컴퓨터 난수는 %d , 플레이어의 입력값은 %d 입니다 \n",comSu,mySu);
			count++;
			if(mySu == comSu) {
				break;
			}else if(mySu < comSu) {
				System.err.println("숫자가 너무 작습니다 다시 입력하세요");
				System.out.println("다시 입력하세요");
				
			}else if(mySu > comSu) {
				System.err.println("숫자가 너무 큽니니다 다시 입력하세요");				
				System.out.println("다시 입력하세요");
			}
			
			
		}
		System.out.println("축하합니다 승리했습니다");
		
		
		
		
	}

}
