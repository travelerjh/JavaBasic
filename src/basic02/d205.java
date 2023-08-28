package basic02;

import java.math.BigDecimal;

public class d205 {
	public static void main(String[]args) {
			
		double dou1 = 12.53;
		double dou2 = 35.45;
		System.out.println(dou1+dou2);

		//BigDecimal  소수점에 정확한 숫자를 뽑아낼때 사용
		
		BigDecimal big1 = new BigDecimal("100.12345");
		BigDecimal big2 = new BigDecimal("10");
		System.out.println(big1.add(big2));
		System.out.println(big1.subtract(big2));
		System.out.println(big1.multiply(big2));
		System.out.println(big1.remainder(big2));
		
		int compare = big1.compareTo(big2);
		System.out.println("같으면 0 다르면 1"+compare);
		
		
	}
	
}
