package basic04;

public class d410 {

	public static void main(String[] args) {
		d410 ins =  new d410();
		
		print();
		ins.print2();
	}
	//클래스 맴버 변수 선언
	static String name="홍길동";
	static String job= "개발자";
	static int age= 20;
	//클래스 맴버 함수 선언
	static void print() {
		System.out.printf("name : %s", name);
		System.out.printf("job : %s",job);
		System.out.printf("age : %s",age);
	}
	//인스턴스 변수 선언
	 String name2= "최재희";
	 String job2 ="개발자";
	 int age2=30;
	 //인스턴스 맴버 함수 
	void print2() {
		System.out.printf("name : %s",name2);
		System.out.printf("job : %s",job2);
		System.out.printf("age : %s",age2);
	}
	 
		
	
	
}
