package ch09nested.book.d4;

public class A {
    //A의 인스턴스 필드와 메소드
    int i;
    void m1(){
        System.out.println(i);
    }
    
    //A의 스테틱 필드와 메소드
    static  int x;
    static  void  m2(){}

    //인스턴스의 맴버 클래스
    class B{
        void  m(){
            i=10;
            m1();
        }
    }

    static  class C{
        void m(){
            x=20;
            m2();
        }
    }



}
