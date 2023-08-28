package basic03;

import java.util.Scanner;

public class d306 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//점수를 입력 받아서 90 이상은 최우수 80 이상은 우수 70 이상은 보통 
		// 그 외에는 "아쉽네요"를 출력하는 switch 사용한 프로그램을 작성하시오 
		Scanner sc = new Scanner(System.in);
		
		int j;
		j =sc.nextInt();
		
		switch (j/10) {
		case 10: System.out.println("최고우수"); break;
		case  9: System.out.println("최우수"); break;
		case  8: System.out.println("우수"); break;
		case  7: System.out.println("아차"); break;
		default:   System.out.println("노력하자");
		}
		
		
		int x;
		x=sc.nextInt();
		switch(x%2) {
		case 0: System.out.println("짝짝짝"); break;
		case 1: System.out.println("홀홀홀"); break;	
		}
		
		
		String e;
		e=sc.next();
		switch(e) {
		case  "a": System.out.println("최고우수"); break;
		case  "b": System.out.println("최우수"); break;
		case  "c": System.out.println("우수"); break;
		case  "d": System.out.println("아차"); break;
		default:   System.out.println("노력하자");
		}
		
		
	}

}
