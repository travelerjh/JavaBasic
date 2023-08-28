package basic04;

public class d406 {

	public static void main(String[] args) {
		//
		String s1 = "abcdefg";
		int i1 = 123456;
		double pi = 3.12345;
		
		//문자 추출 
		System.out.println("문자 추출"+s1.substring(3) ); //문자 4번째부터 출력
		System.out.println("문자 추출"+s1.substring(3,5) ); //문자 3~5전까지 추력 출력
	
		//문자열 관련 표현식
		String a1 = "컴퓨터";
		String a2 = "컴퓨터";
		System.out.println(a1.compareTo(a2)); // 같으면 0
		
		a2="학교";
		System.out.println(a1.compareTo(a2)); // a2가 크면 음수
		
		a2="가자";
		System.out.println(a1.compareTo(a2)); // a2가 작으면 양수

		System.out.println("----------------------------------------");
		
		String a3 = "컴퓨터";
		System.out.println(a3.equals("컴퓨터"));
		System.out.println(a3.startsWith("컴")); // 첫글자가 컴이면 true
		System.out.println(a3.endsWith("터")); // 끝글자가 컴이면 true

		System.out.println("----------------------------------------");
		
		String book = "1, 자바학습, 참조타입, String를 학습합니다,홍길동";
		String[] tokens= book.split(",");
		System.out.println("번호 : " +tokens[0]);
		System.out.println("제목 : " +tokens[1]);
		System.out.println("내용 : " +tokens[2]);
		System.out.println("성명 : " +tokens[3]);
		System.out.println("----------------------------------------");
		
		
		for(int i=0;i<tokens.length;i++) {
			System.out.printf("\n[%d] : %s",i,tokens[i]);
			System.out.println("----------------------------------------");
			
			
			// 배열일때만 사용 for (String str:tokens)	   for(String str : nameA)
			
			
			
			for (String str:tokens)
				System.out.println(str);
			int[]jumsu = {50,60,70};
			for(int no :jumsu) {
				System.out.println(no);
			}
		
			System.out.println("----------------------------------------");
			String[]nameA= {"홍길동","이동수","김철수"};
			 for(String str : nameA)
				 System.out.println(str);
		}	
		
		
		

		
		
	}
}
