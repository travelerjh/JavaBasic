package basic09;

public class d901reference {

	public static void main(String[] args) {
		
		int a =5;  // a라는 저장공간이 생기고 저장공간에 5가 들어간다.
		int b = a;
		
		String c = "java";
		String d = c;
		//c라는 객채가 가르키고 있는 객채 
		//d라는 객채가 가르키고 있는 객채
		//c와 d 는 같다.
		System.out.println(a==b); //a와b  = true
		System.out.println(c==d); //c와d  = true
		
	}
}
