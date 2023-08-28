package basic06;

public class d605 {
	public static void main(String[] agrs) {
		Com c = new Com();
		c.el();	
	}
}

class Elemnet {
	int weight =100;
	int power =200;
	int price =300;
	
	void el() {
		System.out.println(weight);
		System.out.println(power);
		System.out.println(price);
	}
}


class Com extends Elemnet {
}



