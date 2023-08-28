package basic08;

public class d0802 {

	public static void main(String[] args) {
		
		Par2 p1 = new Par2("홍길동", 10);
		Par2 p2 = new Par2("이동수", 20);
		Par2 p3 = new Par2("김철수", 30);
		
		Par2[] pars = {p1, p2, p3};
		for(int i= 0; i <pars.length; i++) {
			System.out.println(pars[i].str());
		}
		
	}

}

class Par2 {
	String name;
	int age;
	
	Par2(String name, int age) {	// 생성자
		this.name = name;
		this.age = age;	
	}
	
	String str() {		// 메소드
		return String.format("이름 : %s, 나이 : %d" , this.name, this.age);
	}
	
}
