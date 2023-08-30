package basic10.lecture;

public class C21contructor {
    public static void main(String[] args) {
         My21 m21= new My21(23);
        m21.PrintAge();

        My21 m2 = new My21(40);
        m2.PrintAge();

    }

}
class My21{
    private int age;

    //생성자 인스턴스를 만들 때 처음 해야하는 일 ()작성
    //주로 필드 초기화 코드 작성
    My21(int age){
        this.age =age;
    }

    public void PrintAge(){

        System.out.println("age = " + age);
    }
}