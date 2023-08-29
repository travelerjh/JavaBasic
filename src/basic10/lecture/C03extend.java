package basic10.lecture;

public class C03extend {
    public static void main(String[] args) {

    SubMyclass sb= new SubMyclass();
    sb.name="w";
    sb.printName();

    }
}

class Myclass {
    String name;
    void printName() {
        System.out.println("name = " + name);
    }
}

class SubMyclass extends  Myclass{
     // myclass의 클래스를 상속 받았다.

}