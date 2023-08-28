package basic04;

public class d403 {

	public static void main(String[] args) {
		// 요일배열 반복문
		String[] day = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		for(int i=0;i<day.length;i++ ) {
			System.out.printf(day[i]);
		}
		System.out.println("----------------");
		
		
		int[] su = {1,2,3,4,5,6};
		for (int e=0 ;e<su.length;e++) {
			System.out.println(su[e]);
		}
		System.out.printf("데이터가 총 %d",su.length);
		
		
	}

}
