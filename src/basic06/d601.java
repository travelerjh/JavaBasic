package basic06;

public class d601 {

	static void car(int i) {
		System.out.printf("포르쉐 소개 최고속도 %d \n",i);
	} // void = 메소드다 .
	
	static void car(String name) {
		System.out.println("제품 이름은 :"+name);
	}
	static void car (int z ,int y ) {
		System.out.printf("제품 출시년도 %d :이고 부품가격은 %d 입니다 \n",z,y);
	}

	static void car (int z ,double y ) {
		System.out.printf("정수 :%d , 더블 :%f",z,y);
	}
	
	public static void main(String[] args) {
		car("911");
		car(500);
		car(2023,300);
		car(10,11.5);
		
	}
}
