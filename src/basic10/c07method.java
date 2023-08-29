package basic10;

public class c07method {
    public static void main(String[] args) {
        Myclass07 o1 = new Myclass07();
        Myclass07 o2 = new Myclass07();
        o1.myMethod();
        o2.myMethod();

        o1.name = "재희";
        o2.name = "재훈";
        o1.printName();
        o2.printName();

    }
}

class Myclass07 {
    //필드랑 메서드를 묶어서 맴버라고 한다.

    //필드
    String name;

    void printName() {
        System.out.println("name :" + name);
    }

    //메소드
    void myMethod() {
        System.out.println("실행됨");
    }

}
