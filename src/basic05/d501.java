package basic05;

public class d501 {
	
	//소리 내는 친구들 알아보자 
	
	static String so="야용";

	
	static void sori(String sound ) { //클래스 맴버 변수(클래스 영역)	
		System.out.printf("%s의 특징",sound);	
	}
	//내부 클래스는 static 을 준다.
	
	static class Cat { //내부 클래스   
		               // 맴버 변수와 맴버 함수가 가능하다.
		 //Cat클래스맴버 변수  (속성)
		static void catM(String name) { //cat 클래스 맴버 함수(메서드)
			System.out.printf("전달받은소리 %s %s \n",name, so); 	
		}
	}
	
	
	static class Lion{
		static String sori = "어흥";
		static void lionM(String name) {
			System.out.printf("%s %s \n" ,name,sori);
		}
	};
	
	
	
	static class Dog {
		static String dogs ="멍멍";
		static void dogM(String dogname) {
			System.out.printf("%s %s",dogname,dogs);
		}
	}
	

	public static void main(String[] args) {
		   Cat.catM("고양이");
		   Lion.lionM("호랑이");
		   Dog.dogM("말티즈");
		   
	}
}
