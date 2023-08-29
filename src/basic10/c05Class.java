package basic10;

public class c05Class {
    public static void main(String[] args) {
        Myclass05 o1 = new Myclass05(); // new 를 통해 인터스턴스를 만드는 코드 할당연산자에 들어가는게 주소가 들어간다.
        // 인스턴스는 클래스가 있어야한다.
        System.out.println("o1의 참조값 = " + System.identityHashCode(o1));

        o1.age =30;
        // o1.model= "java"; // 권장하지 않음

        Myclass05.model = "spring";

        System.out.println("o1.age = " + o1.age);
        System.out.println("o1.model = " + o1.model);
        Myclass05 o2 =new Myclass05();
        o2.age= 60;
        System.out.println("o2.age = " + o2.age);
        System.out.println("o2.model = " + o2.model);
    }
}
//클래스에 작성되어야하는건 속성과 기능이다
class Myclass05{
    //속성과 메소드를 묶어서 맴버라고 한다.


    //속성 field
    int age;     //인스턴스 필드

    //static field , class field , 정적 필드
    // 클레스의 속성
    // 클래스 전체에 영향을 미친다.
    static  String model; // 어떤 필드는 스테틱이 붙는다. 대장 느낌---> 일론머스크  --> X 로 트위터 변경



    //기능 메소드


}
