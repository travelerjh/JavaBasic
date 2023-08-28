package basic07;

import java.util.Scanner;

public class d704 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Car_Class car_Class ; // String str 쓰겠다 라는 느낌 !!
		
		while (true){
	
		for(int i=0; i<5; i++) {
		System.out.print("1.버스냐 ?\n 2.트럭 ?\n 3.테슬라 ?\n 선택해줘! \n");
 		int input = sc.nextInt();
 		if(input == 1) {
 			car_Class= new Bus_Class();
 			car_Class.run();
 		}else if(input ==2) {
 			car_Class = new Tru_Class();
 			car_Class.run();
 		}else if(input==3) {
 			car_Class = new tesla();
 			car_Class.run();
 		}
 		System.out.println("어떻게 작업한번더 해? \n");
 		String c= sc.next();
 			if(c.equals("Y")) {
 				continue;
 			}else {
 				break;
 			}
		}
	}
	}
}

class Car_Class{
	String name;
	int speed;
	void run() {
	System.out.printf("자동차 종류:%s \n 자동차 속도 %d ",name, speed);
	}
}


class tesla extends Car_Class{
	tesla(){	
		name="모델3";
		speed =300;
	}

			
}








class Bus_Class extends Car_Class{
		Bus_Class(){
			name="버스";
			speed =60;
		}
}

class Tru_Class extends Car_Class{
	Tru_Class(){
		name="트럭";
		speed =100;
	}
}