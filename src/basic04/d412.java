package basic04;
public class d412 {
     
	//메서드를 클래스로 바꿔보자 !!! 
	
	static String name="홍길동"; // 클래스 맴버 변수
	static int count =0;       // 클래스 맴버 변수
	
	//클래스 안에 클래스를 만들자 
	//내부클래스 를 만들면 좋은 점이 많다.
	//클래스도 static 이 붙었다.
	
	static class Who{
		static void who() {
		  System.out.println("\n 너 누구니?");
		}
	}
	static class Iam{
		static void iam() {
			System.out.printf("난 %d번쨰 난쟁이야",++count);
		}
	}
	
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			Who.who();
			Iam.iam();
		}
		
	
		
		
	}
}