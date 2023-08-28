package basic04;

public class d408method2 {

	//static 이 없어서 인스턴스 변수 
	String handle ="우회전";
	int ball= 10;
	int rotate =20;
	
	 //인스턴스 함수 
	 void  carRun() {
		 handle="90도 회전 ";
		 ball= 40;
		 System.out.printf("1코너에서 %s",handle);
		 if (ball<10) {
			 System.out.printf("1번 코너에서 %d 하세요 ",rotate);
		 }else {
			 System.out.printf("1번 코너에서 %d 하세요 ",rotate+50);
		 }
	 
	 }
	
	
	public static void main(String[] args) {

		d408method2 ins= new d408method2();
		ins.carRun();
		
	}
}
