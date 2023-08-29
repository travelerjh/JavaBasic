package basic10;

public class c08static {
    public static void main(String[] args) {
        //MyClass08 o1 = new MyClass08();


        //스테틱 맴버는 인스턴스를 생성할 필요가 없다.
        // 클래스 이름은로 바로 접근하세요
        MyClass08.name ="spring";
        MyClass08.printName();

    }
}

class MyClass08 {
    // 스테틱  맴버
    // 클래스에 관한 정보

    static  String name;

    static  void printName(){
        System.out.println("name = " + name);
    }


}