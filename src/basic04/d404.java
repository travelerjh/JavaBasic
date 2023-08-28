package basic04;

public class d404 {

	public static void main(String[] args) {
	// 번호 , 이름 , 전화 ,나이
		String [] name = {"홍길동","이동수","김철수","강수진","최영숙"};
		String [] phone= {"011-5146-8004" , "012-7162-8315" ,"013-5462-8041" ,"014-8453-5123", "015-1234-2468"};
		int [] age= {10,20,30,40,50};
		
		//방법 1
		for(int i=1; i<name.length;i++) {
			System.out.println(" 이름 : "+ name[i] +" 번호 :"+phone[i]+" 나이 : "+age[i]);
		}
		
		System.out.println("-------------------------------------------------------------");
		
		//방벙2
		System.out.println("이름 번호 나이") ;
		for(int i=1; i<name.length;i++) {
			System.out.printf( name[i]+" " + phone[i]+" " + age[i] + "\n") ;
		}

	}

}
