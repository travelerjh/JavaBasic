package basic04;

import java.util.Scanner;

public class d405 {

	public static void main(String[] args) {
		// 입력 횟수를 입력해서 그 횟수 만큼 배열을 선언 하여 그곳에 입력된 점수를 출력
		Scanner sc= new Scanner(System.in);
		System.out.println("몇개의 점수를 입력 할건가요 ? : ");
		int[] jumsuA= new int [sc.nextInt() ];
			
		for(int i=0; i<jumsuA.length; i++) {
				
					System.out.printf("점수 입력 :");	
					jumsuA[i]=sc.nextInt();
			}
			for (int i = 0; i<jumsuA.length; i++) {
			System.out.printf("점수 %d",jumsuA[i]);
			}	
	
	
	
	}
}
