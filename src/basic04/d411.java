package basic04;

public class d411 {

	static void hi() {
		System.out.println("안녕 난 백설공주");
	}
	
	String nan = "난쟁이야";
	int count = 0;

	void who() {
		while (true) {
			count++;
			System.out.printf("너 누구니?\n");
			System.out.printf("난 %d번 " + nan + "\n", count);
			if (count < 10) {
				continue;
			} else {
				break;
			}

		}
	}

	public static void main(String[] args) {
		d411 bak = new d411();
		hi();
		bak.who();

	}

}
