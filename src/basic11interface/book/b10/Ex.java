package basic11interface.book.b10;

public class Ex {

    public static void main(String[] args) {
        //action의 공통 상위 클래스를 만들자
        // A a
        // 인터페이스는 상위 버전
     action(new B() );
     action(new C());


    }

    private static void action(A a) {
        a.m1();
     if(a instanceof C c ){
        c.m2();
     }

    }



}
