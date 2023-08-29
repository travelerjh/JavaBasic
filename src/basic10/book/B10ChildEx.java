package basic10.book;

public class B10ChildEx {
    public static void main(String[] args) {
        B10Parent bp =new B10Child();
        bp.field1="data1";
        bp.method1();
        bp.method2();

        B10Child bc = (B10Child) bp;
        bc.field2="data2";
        bc.method3();
    }
}
