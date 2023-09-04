package ch09nested.lecture;

public class C11interface {
    public static void main(String[] args) {
        MyinterfaceClass11 m11 =new Myclass11();
        MyinterfaceClass11 m12 =new MyinterfaceClass11(){
            @Override
            public void m1() {
                System.out.println("m2");
            }
        };
        m12.m1();
        m11.m1();
    }
}
class Myclass11 implements  MyinterfaceClass11{
    @Override
    public void m1() {
        System.out.println("m1");
    }
}


interface MyinterfaceClass11{
    void m1();// 추상메소드
}
