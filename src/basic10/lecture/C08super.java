package basic10.lecture;

public class C08super {
    public static void main(String[] args) {
        SubMy08 sub08 = new     SubMy08();
        sub08.method1();
    }
}
class  My08{
    void method1(){
        System.out.println("부모메소드!");
    }
}
//super가 하는 일 부모의 맴버에 접근하는 키워드
class SubMy08 extends  My08{
    @Override
    void method1() {
        System.out.println("자식메소드!");
        super.method1();
    }
}



