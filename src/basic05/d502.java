package basic05;

public class d502 {

	// 맴버 변수 speed; 
	// 맴버 함수 run;
	// 내부 클래스 Bus , Car 
	// 맴버 변수 : speed, 맴버함수 busR , carR
	
	static class Bus{
		static String busS= "20km";
		static void busR(String name) {
			System.out.printf("%s 의 속도는 %s 입니다. \n",name,busS);
		};	
	}
	
	static class Car{
		static String CarS="50km";
		static String Sonata= "소나타";
		static void carR() {
			System.out.printf("%s의 속도는 %s 입니다.", Car.Sonata ,CarS);
		}
	}
	
	
	
	
	public static void main(String[] args) {

		Bus.busR("타요");
		Car.carR();
		
		
	}
}
