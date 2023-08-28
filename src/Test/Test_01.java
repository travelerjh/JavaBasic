package Test;

public class Test_01 {

	static String a = "100";
	static String b = "200";
	
	static void calc() {
		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		System.out.printf("%d + %d = %d ", aa, bb, aa+bb);
	}
	public static void main(String[] args) {
		/*
		String a = "100";
		String b = "200";
		
		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		System.out.println(aa*bb);
		*/
		
		//calc();
		
		Test_01 test = new Test_01();
		test.calc();
		
	}

}
