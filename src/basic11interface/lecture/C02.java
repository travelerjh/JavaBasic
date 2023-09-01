package basic11interface.lecture;

public class C02 {
    public static void main(String[] args) {
        Myclass021 m21= new Myclass021();
        Myface02 m22 = m21;

        System.out.println(System.identityHashCode(m21));
        System.out.println(System.identityHashCode(m22));

        Myface02 m23 =new Myclass021() ;
        System.out.println(System.identityHashCode(m23));

        Myface02 m24 =new Myclass022();
        System.out.println(System.identityHashCode(m24));
        m24.method1();
        m24.method2();
    }
}
interface  Myface02{
    abstract public  void method1(); //인터페이스에 있는 추상메소드

    public abstract void method2(); //

}
//추상메소스가 있는 상위타입을 받으면
//추상클래스가 되지 않기 위해
// 추상 메소드를 꼭 구현해야한다.

class Myclass021 implements Myface02{
    @Override
    public void method1() {
        System.out.println("021");
    }

    @Override
    public void method2() {
        System.out.println("022");
    }
}

class Myclass022 implements Myface02{
    @Override
    public void method2() {
        System.out.println("0222");
    }

    @Override
    public void method1() {
        System.out.println("0221");
    }
}