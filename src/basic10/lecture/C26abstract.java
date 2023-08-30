package basic10.lecture;
public class C26abstract {
    public static void main(String[] args) {
        Dog26 d26= new Dog26();
        Cat26 c26 = new Cat26();

        d26.breath();
        c26.breath();

        Animal26 a2= new Cat26();
        a2.breath();
    }

}
// 추상클래스로 인스턴스 생성 불가
// 추상메소드를 가진 메소드는 꼭 추상 클래스가 되어야함

abstract class Animal26{
    //추상메소드
    abstract   public  void breath();

}

class  Dog26 extends  Animal26{
    //추상메서드를 꼭 재정의 해야함(override)
    @Override
    public void breath() {
        System.out.println("폐로 숨쉬다");
    }
}
class  Cat26 extends  Animal26{
    @Override
    public void breath() {
        System.out.println("아가미로 숨쉬다.");
    }
}
