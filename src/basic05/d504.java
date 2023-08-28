package basic05;

public class d504 {
		  //person 이란 클레스에서 홍길동을 소개하는 생성자를 만드세요 
	     // 홍길동 직업 나이 , 이동수 소개 
	public static void main(String[] args) {

		Person hong = new Person("홍길동","도적",30);
		Person hong2 = new Person("홍홍홍","도둑놈",50);
		
		
		Person2 go = new Person2("고길동","집주인",51);
		
		hong.hong();
	}
}

class Person{
	String n;
	String j;
	int a;
	
	Person(String n, String j,int a){
//		this.n=n; 
//		위에꺼 없으면 값이 NULL로 나온다.
		this.n=n; 
		this.j=j;
		this.a=a;
		System.out.printf("이름 은 : %s 직업은 : %s 나이는 : %d 입니다 \n", n , j, a);
	}
	void hong(){
		System.out.printf("내이름은 %s 입니다 \n",n );
	}
}

class Person2{
	String n;
	String j;
	int a;
	Person2(String n, String j,int a){
		this.n=n;
		this.j=j;
		this.a=a;
		System.out.printf("이름 :%s 직업 : %s 나이 : %d \n",n,j,a);
	}
	
	
}


