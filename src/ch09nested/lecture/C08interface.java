package ch09nested.lecture;

public class C08interface {

}
class My081 implements  MyClass08.NestedInterface{
    @Override
    public void method2() {
        System.out.println("m2");
    }
}


class  MyClass08{
    interface  NestedInterface{
        //public final static field 도 쓸수 있고
        //public abstrcat instance method (); 추상메소드
        //클래스 안에 인터페이스를 만들었다면
        //그건 그 클래스 안에서 쓰려고 만들었따.

        void  method2(); // 추상메서드의 몸통을 구현 해야한다.
                         // 오버라이딩!!!


        default void method1(){
            class ConcreteClass implements NestedInterface{

                @Override
                public void method2() {

                }

                @Override
                public void method1() {

                }
            }
            ConcreteClass c= new ConcreteClass();
            c.method2();
        }


    }
}
