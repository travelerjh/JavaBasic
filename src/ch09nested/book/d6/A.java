package ch09nested.book.d6;

public class A {
    //생성자
    A(){
        //로컬 클래스 선언
        class B{}
        //로컬 객채 선언
        B b= new B();
    }

    //메소드
    void m(){
        //로컬 클래스 선언
        class B{}
        B b= new B();
    }

}
