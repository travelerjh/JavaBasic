package basic04;

public class d402Array {
	public static void main(String []args) {
		int i;
		String s; 
		String [] arr = {"홍","길 ","동"};
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		*/
		arr[0]="고";
		for (i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}
}
