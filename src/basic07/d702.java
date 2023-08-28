package basic07;

public class d702 {

	public static void main(String[] args) {
		Bus b = new Bus();
		Tru t = new Tru();
		b.run("타요 ",10);
		t.run("볼보트럭이", 100);
		
		b.roda();
		
		
		//Car car=new Bus(); //car 타입의 카 인스턴스가 버스타입의 객체를 받는다.
		
	}

}

class Car {
	String name ;
	int speed  ;

	void run(String name , int speed){
		this.name= name;
		this.speed = speed;
		
		System.out.printf(" %s가  %d의 속도로  달린다. \n ",name, speed);
	}
	
	void roda() {
		System.out.println("오늘도 사람을 태웁니다.");
	}
	
	
}


class Bus extends Car{

}

class Tru extends Car{
	
}




