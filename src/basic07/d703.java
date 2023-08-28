package basic07;

public class d703 {

	
	public static void main(String[] args) {

		Car1 car = new Bus1();
		 car.run1();
		System.out.println("------------------------");
		Car1 car2 = new Tru1();
		car2.run1();
	}
}

class Car1 {
	//맴버변수 
	String name="자동차";
	int speed = 10;
	//맴버 함수
	void run1() {
		System.out.println("무엇을 넣을까 ");
	}
}
//클래스 이름 하고  함수 이름 하고 똑같다 + 리턴값이 없다.  ==> 생성자
//맴버함수는 맴버변수를 쓸 수있다 .car를 상속 받았기 때문에 run이가능하다.
class Bus1 extends Car1{
	public Bus1() {
		name="버스";
		speed = 60;
		System.out.printf("이름 : %s \n",name);
		System.out.printf("속도 : %d \n",speed);
	}
}

class Tru1 extends Car1{
	Tru1(){
		name = "트럭";
		speed = 100;
		System.out.printf("이름 : %s \n",name);
		System.out.printf("속도 : %d \n",speed);
	}
}
