package ch09nested.book.d6;

public class AA {
    void useB(){
        class B{
            //필드
            int f1 =1;
            static  int f2 =2;
            //생성자
            B(){
                System.out.println("B생성자 실행");
            }
            void  method1(){
                System.out.println("Bm1 실행");
            }
            static  void  m2(){
                System.out.println("Bm2 실행");
            }
        }
        // 로컬 객체 생성
        B b = new B();
        System.out.println(b.f1);
        b.method1();

        System.out.println(B.f2);
        B.m2();

    }



}
