package basic04;

public class d409kimchi {

	static void buyk() {
		System.out.println("구매 할께요 ");
	}
	
	String chong ="총각김치 ";
	String mul ="물김치";
	String bea="배추김치";
	String pa="파김치";
	
	void buy(){
		System.out.printf("%s,%s,%s,%s",chong, mul, bea, pa);
	}	
	
	public static void main(String[] args) {

		
		d409kimchi kim = new d409kimchi();
		kim.buy();
		System.out.println("를");
		buyk();
		
	}

}
