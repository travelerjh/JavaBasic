package Basic_08_Test;

public class Extends_1 {

	public static void main(String[] args) {
		
		Chi my = new Chi(10,20);	// 10 : 부모 돈 , 20 : 자식의 돈
		System.out.println("홍길동 기준 - 나의 총 재산 : "+my.chi_money);
		System.out.println("홍길동 기준 - 부모의 총 재산 : "+my.p_price);		//my는 부모의 모든 것을 상속

		Chi my2 = new Chi(35,25);	// 35 : 부모 돈 , 25 : 자식의 돈
		System.out.println("이동수 기준 - 나의 총 재산 : "+my2.chi_money);
		System.out.println("이동수 기준 - 부모의 총 재산 : "+my2.p_price);		//my는 부모의 모든 것을 상속
	}

}

class ParMoney {
	int p_money;		// 입금된 부모 돈
	int p_kum=100;			// 기존 부모 재산
	int p_price;		// 늘어난 자산
	
	ParMoney(int ex1) {		// 생성자 // 10을 전달받고
		p_money = ex1;		// 부모 돈은 10
		p_price = p_money + p_kum;//부모돈 10에 + 기존재산 100 = 총 110
	}
	
}

class Chi extends ParMoney {
	int chi_money;
	int chi_kum=50;
	Chi(int ex1, int ex2){
		super(ex1);					// 10
	chi_money = ex2;				// 20
		chi_money = chi_kum + chi_money;		// 자식의 늘어난 돈	//50 + 20 총 70원
	}
}
