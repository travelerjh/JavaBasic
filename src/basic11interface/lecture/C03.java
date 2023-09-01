package basic11interface.lecture;

      //  인터페이스는 하나 이상 구현 할 수 있다.



public class C03 {
    public static void main(String[] args) {
        MyClass03 m3= new MyClass03();
        m3.m();
        m3.m3();
        m3.m2();
        //형변환 가능
        MyInterface031 i1 =m3;
        MyInterface032 i2 =m3;
        i1.m();
        i2.m4();
    }
}

interface MyInterface031{
    void  m();
    void  m2();
    void  m3();

}
interface MyInterface032{
    void  m4();
    void  m5();

}

interface MyInterface033{
    void  m6();

}
class MyClass03 implements MyInterface031 ,MyInterface032, MyInterface033{
    @Override
    public void m() {
        System.out.println("MyClass03.m");
    }

    @Override
    public void m2() {
        System.out.println("MyClass03.m2");
    }

    @Override
    public void m3() {
        System.out.println("MyClass03.m3");
    }

    @Override
    public void m4() {

    }

    @Override
    public void m5() {

    }

    @Override
    public void m6() {
        System.out.println("MyClass03.m6");
    }
}