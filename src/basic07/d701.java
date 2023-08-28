package basic07;

public class d701 {

	public static void main(String[] args) {

		Apt ap =new Apt();
		ap.door();
		Dan da= new Dan();
		da.door();
		
		Apt apt2 = new Dan(); // Apt 타입으로 apt2 인스턴스를 만들고 Dan()형태로 객체화 시켰다.
		apt2.door();         //Dan을 덮어씌운다.
		
		Apt apt3 = new Dan();
		apt3.door();
		
		
	}
}

class Apt{
	//맴버 변수를 만들 수 있다.
	int room =3;
	//맴버 함수를 만들 수 있다.
	void door() {
		System.out.println("키");
	}
}

class Dan extends Apt{
	void door() {
		//오버라이딩! 덮어쓰기   메소드에 이름은 같지만 처리 내용만 다르다.
		System.out.println("도어락");
	}
	
	
}




