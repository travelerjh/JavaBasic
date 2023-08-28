package basic09;

public class d904matrix {

	public static void main(String[] args) {
		// 이차원 배열   ==  배열의 배열 
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b = a;  //타입이 같아야 변경 가능
		
		System.out.println(a[0][1]);//3
		System.out.println(b[0][1]);//3
		
		a[1][1]=2000;
		System.out.println(a[1][1]); //2000;
		System.out.println(b[1][1]); //2000;
		
		b[2][2] =999;
		System.out.println(b[2][2]);
		System.out.println(a[2][2]);
		
		b[2] = new int[] {111,222,333};
		System.out.println(b[2][2]);
		System.out.println(a[2][2]);
		
		 b= new int[][] {{1135,4565},{2123,45648}};
		System.out.println(b[0][1]);
	}
}
