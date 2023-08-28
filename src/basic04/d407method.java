package basic04;

public class d407method {

	//클래스 변수 ---> 스테틱영역에 저장 (정적영역)
	static String name1 ="홍길동"; 					     // 클래스 맴버변수 선언
	static void sogae1() {         						// 클래스 맴버 함수
		System.out.printf("나는 %s입니다 .",name1);
	}
	
	String name2 ="이동수";
	void sogae2() {                                   // 인스턴스 맴버변수
		System.out.printf("나는 %s입니다 .",name2);     // 인스턴스 맴버 함수
		
	}
	
	public static void main(String[] args) {  	
		System.out.println("클래스 변수 출력"+ name1);
		sogae1();

		
		//인스턴스 변수를 사용하기 위해서 클래스를 만들어 
		//객채를 생성한다.
		// 결론 	
		d407method ins= new d407method();		
		
		
		
		System.out.println("클래스 변수 출력"+ ins.name2); 	//  <-------- 인스턴스 맴버 변수라 못찍음
		ins.sogae2();
		
	}
}
