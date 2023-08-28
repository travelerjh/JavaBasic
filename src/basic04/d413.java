package basic04;

public class d413 {
	// 치타 호랑이 사자 === 고양이과이다. 
	
	//void 는 함수 
	static void sori(String sound) {
		//클래스 맴버 함수(메서드)
	
	}
	
	
	
	static class Cat{
	//내부 클래스 	
		static String  so="야옹";    							 // Cat클래스맴버 변수
		static void cat_method(String name) {      		 	//  Cat클래스 맴버 함수
			System.out.printf( "고양이 소리 : %s \n",so);
		}
	}
	static class Tig{
	 //내부 클래스 	
		static String so="어흥";
		static void tig_method(String name) { 			     	//  tig클래스 맴버 변수 
			System.out.printf("호랑이 울음 소리 : %s \n",so);	   //   tig클래스 맴버 함수
		}
	}
	
	
	public static void main(String[] args) {
		
		Tig.tig_method("호랑이");
		Cat.cat_method("고양이");
		
		
		
	}

}
