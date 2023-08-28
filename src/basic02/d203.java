package basic02;

public class d203 {
	int a=0;
	byte b=(byte)a;
	long kbs =10 ;
	double sbs = -3.14*10;
	
	
	void pri() {
		System.out.println(kbs);
		System.out.println(sbs);
		System.out.println();
	}

	
	public static void main(String[] args) {
	//cast 맴버변수 맴버 함수 만들수 있다.
		
		d203 cast = new d203();
		cast.pri();

	}

}
