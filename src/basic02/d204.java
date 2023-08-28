package basic02;

public class d204 {
	public static void main(String[] args) {
		
		//형 변환 
		int a =10 ;
//		Integer aa = new Integer(10);
		Integer aa = 10;
		System.out.println("값 :"+ a );
		System.out.println("값 :"+ aa );
		
		String bb= aa.toString();
		System.out.println(bb+"        " +bb.length());
	
		Long refl = 54564242645L;
		String cc = refl.toString();
		System.out.println(cc +"   "+ cc.length());
		System.out.println("Integer.parseInt()를 사용하여 정수로 변환후 출력"+Integer.parseInt("6512"));
		
		
		String str= "45";
		System.out.println(Integer.parseInt(str));
		System.out.println(str.toString());
	}
}
 