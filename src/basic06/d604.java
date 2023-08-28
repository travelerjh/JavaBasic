package basic06;
public class d604 {
	public static void main(String[] args) {
		Car2  c2= new Car2();
		c2.run();
	}
}
	
class Car1{
	String right="밝기";
	String handle="핸들";
	int ball =4;

	void run() {
		System.out.println("달린다");
		System.out.println(right);
		System.out.println(handle);
		System.out.println(ball);
	}
}


class Car2 extends Car1{
}