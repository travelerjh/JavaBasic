package basic10.lecture;

public class C07Super {
    public static void main(String[] args) {
        SubMy07 sb07 = new SubMy07();
        sb07.method1();
    }

}

class My07{
    void method1(){
        System.out.println("부모클래스 매소드");
    }
}
class  SubMy07 extends My07{
    //불편한게 있어
    // 기존에 있는거에 뭘 더하고 싶다.
    @Override
    void method1() {
            super.method1(); // 부모클래스이 메소드를 호출
            // System.out.println("부모 클래스 메소드 기능");
            System.out.println("자식 클래스가 재정의한 메소드");
        }
}
