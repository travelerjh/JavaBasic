package Basic_08_Test;

public class Multi_Computer {

	public static void main(String[] args) {
		Lang lang = new Java();		// 다형성  :  Lang타입에 lang인스턴스에 Java객채가 들어감
		lang.show();
		
		
	}

}

class Lang extends Multi_Computer {
	String name;
	int page;
	int def;
	
	public void show() {
		System.out.println("------------------------------");
		System.out.println("언 어 : " + name);
		System.out.println("페이지 : " + page);
		System.out.println("난이도 : " + def);
		System.out.println("------------------------------");
	}
}

class Java extends Lang {
	public Java() {		// 생성자
		name = "자바";
		page = 200;
		def = 50;
	}
}

class JavaScript extends Lang {
	public JavaScript () {
		name = "자바스크립트";
		page = 230;
		def = 30;
	}
}