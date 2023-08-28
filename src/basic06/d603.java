package basic06;

public class d603 {

	int age = 50;
	String name="부모";
	
    d603() { //기본생성자
		System.out.println("나는 부모 생성자");
	}

    public d603(int age ,String name ) {
    	this.age =age;
    	this.name =name;
    	System.out.println("나는 매개변수 2개를 가지고 있는 부모생성자");
    	System.out.println(name+age);
    }
	
	public static void main(String[] args) {
		Hong h = new Hong( 10, "wogns");

		
	}
}

class Hong extends d603{
	 // 부모생성자를 부른다.
	Hong(int age , String name){
	super(45 ,"재훈");}
}