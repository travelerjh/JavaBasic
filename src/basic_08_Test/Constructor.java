package Basic_08_Test;

public class Constructor {

	public static void main(String[] args) {

		Par p1 = new Par("홍길동", 20);
		System.out.printf("이름이 : %s, 나이는 : %d(메인 클래스)\n", p1.name, p1.age);
		System.out.println("--------------------------------------");
		
		Par p2 = new Par("이동수", 30);
		String str =  p2.str();		//p2가 str을 호출한 것을 str 변수에 저장
		System.out.println(str);  	//받은 str을 출력
	}

}

//public은 자바 파일에 하나만 존재 해야한다.

class Par {
	String name;
	int age;
	Par(String name, int age){ // 클래스와 이름이 같은 함수는 생성자
		this.name = name;
		this.age = age;
	}
	
	String str() {	//void 가 아닌 String인것은 문자열로 돌려주려 함 이라서.
		System.out.printf("이름이 : %s, 나이는 : %d (외부 클래스)\n", name, age );
		return String.format("이름 : %s , 나이 : %d", name, age); 	// 문자열로 리턴
	}
}
