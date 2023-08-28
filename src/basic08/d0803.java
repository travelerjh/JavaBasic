package basic08;

public class d0803 {

	public static void main(String[] args) {
//		String[] nameA = {"홍길동", "김철수", "김영희"};
//		int[] ageA = {10,20,30};
//		String[] parA = {"pa1","pa2","pa3"};
//		
//		for(int i = 0; i< nameA.length; i++) {
//			Par3 pa = new Par3(nameA[i], ageA[i]);
//		}
		
		Par3 pa = new Par3("홍길동", 10);
		
		String str = pa.returnStr();
		System.out.println(str);
		
	}
}

class Par3{
	String name;
	int age;
	
	Par3(String a, int b) {
		this.name = a;
		this.age = b;
	}
	
	String returnStr() {
		return String.format("이름 : %s, 나이 : %d",name,age);
	}
	
}
