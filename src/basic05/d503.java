package basic05;

public class d503 {

	public static void main(String[] args) {
		Car car = new Car() ;
		//car 객채가 생성되었다.
		// car에 들어있는게 없다.
		//car 생성자가 있는지 확인 
		Car2 car2 = new Car2("제네시스",4000);
		Car3 car3 = new Car3("포르쉐","red",200);
				
	}	
}

class Car{
	int speed;
	Car(){
		System.out.println("Car 클래스에 생성자가 만들어 졌습니다. \n");
	}
};

class Car2{
	Car2(String n , int a){  //클래스 이름과 똑같으면 생성자
		System.out.printf("%s 의  cc는 %dcc 입니다. \n",n,a);
	}
}

class Car3{
	String name ;
	String color ;
	int speed;
	
	Car3(String n, String c , int s){
		this.name = n;
		this.color = c;
		this.speed =s;
		System.out.printf("%s의 속도는 %d 이고 컬러는 %s 이다" ,n,s,c);
	}
	
}






