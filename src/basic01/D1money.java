package basic01;

public class D1money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 화폐 갯수 출력 
		// 23,456원

		int money=32345;
		int man,chun,bak,su,w;
		man= 32345/10000;
		chun= 2345/1000;
		bak= 345/100;
		su = 45/10;
		w= 5/1;
		
		System.out.printf("만원: %d",man);
		System.out.printf("\n천원: %d",chun);
		System.out.printf("\n백원: %d",bak);
		System.out.printf("\n십원: %d",su);
		System.out.printf("\n원: %d",w);
		
		
		
	}

}
