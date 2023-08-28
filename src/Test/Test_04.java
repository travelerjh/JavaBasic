package Test;

public class Test_04 {
	static String name, department, position;
	static int sal;
	static void pr() {
		name = "이효리";
		department = "개발부";
		position = "대리";
		
		System.out.println("이름 : " + name);
		System.out.printf("부서 : %s\n", department);
		System.out.print("직위 : " + position +"\n");
		
	}
	static int pr2() {
		sal = 1500000;
		return sal;
	}
	
	public static void main(String[] args) {
		pr();
		pr2();
		System.out.println("급여 : "+sal+"원");
	}

}
