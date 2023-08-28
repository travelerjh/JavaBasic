package basic06;

public class d602 {
	//아빠가 제네시스 , 4000를 삿다 .
	// 아들이 튜닝을 했다. .

	//맴버 변수 잡자
	String name;
	int speed, price;
	
	public void setOption (int speed , int price) {
		this.speed =speed;
		this.price = price;
		//디스를 받아서 가격을 위에 인스턴스 맴버 변수에 저장 
	}

	public void total() {
		System.out.println("자동차 속도 : "+ this.speed  + "가격 :"+ this.price);
	}
	public void pandan() {
		System.out.println("자동차를 잘 샀다.");
	}
	
	
	public static void main(String[] args) {
		//찍어보자ㅣ
		Child c = new Child();
	
		c.setOption(500, 3000);
		c.total();
	//	c.total(300, 4000);
		c.pandan();
		c.r();
	}
	
	
}


class Child extends d602{  // 자식 클래스 
	
	public void r() {
		System.out.println("내가 만들었어요");
	}
	
} 




