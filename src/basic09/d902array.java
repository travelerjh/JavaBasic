package basic09;

public class d902array {

	public static void main(String[] args) {
		// 배열 참조 타입
		// 기본타입 = 메모리 값에 5를 넣는다.
		int a=5;
		int b=a;
		
		System.out.println(a);
		System.out.println(b);
		
		int[] c= {3,4,5};
		int[] d=c;
		
		System.out.println(c[1]);
		System.out.println(d[1]);
		
		//인스턴스의 값이 달라지니 d도 55로 변화한다.
		c[2]=55;
		System.out.println(c[2]);
		System.out.println(d[2]);  //5? 55?   = 당근 55가 나온다.
		
		
		// 참조 타입 = 메모리 값에 주소를 넣는다.
		
		
		

	}

}
