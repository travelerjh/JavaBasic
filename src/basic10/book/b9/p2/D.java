package basic10.book.b9.p2;

import basic10.book.b9.p1.A;

public class D extends A {

    public  D(){
        super(); // A에 생성자 호출
    }

    public  void method1(){
        this.fiedl ="value";
        this.method();
    }

}
