package basic05;

import java.util.Scanner;

public class d5051{
	 

	
	Scanner sc= new Scanner(System.in);
	
	
	String[] nameA = {"홍길동","이동수","김철수","이다혜","강수정" };
	int[] ageA = {10,20,30,40,50};
	String[] telA = {"010-5146-8004","010-5146-8214","010-5614-2345","010-5348-6462","010-11497-8312" };

	int count=0;
	void line() {
		System.out.println("-------------------------------------");
	} 

	void search() {
		System.out.println("찾고자 하는 사람의 이름을 누르세요 ");
		String hong =sc.next();
		
	
		for(int i=0; i<nameA.length ; i++) {
		if(hong.equals(nameA[i])) {
			System.out.println(nameA[i]+"\t"+ageA[i]+"\t"+telA[i]);
		 }
	   }

	}	
	
	void searchPrint() {
		System.out.println("데이터 출력");
		line();
		System.out.println("이름   나이       전화");
		line();
		for(int i=0;i<nameA.length;i++) {
			System.out.println(nameA[i]+"\t"+ageA[i]+"\t"+telA[i]);
		}
		while(true) {
		search();
		
		System.out.println("찾고자하는 사람이 또 있나요 ?[Y/N]");

		String y =sc.next();
		if(y.equals("y")) {
			continue;
		}else {
			 System.out.println("그만실행하겠습니다");
			break;
		}
		
		
		}

	}
}
