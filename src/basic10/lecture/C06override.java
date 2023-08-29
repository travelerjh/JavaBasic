package basic10.lecture;

public class C06override {
    public static void main(String[] args) {
        SubMy6 sb6 =new SubMy6();
        sb6.mtd10();
    }

}
class SubMy6 extends  Mc6{
    @Override //컴파일시 재정의한 메소드인지 검증함
    public void mtd10() {
        System.out.println("자식 클래스의 메소드 ");
    }
}

class Mc6{
    public void mtd10(){
        System.out.println("부모 클래스의 메소드");
    }
}
