package ch09nested.book.d7;

public class A {
    public void m1(int arg){
        int v=1;
        class B{
            void m2(){
                System.out.println("arg : "+arg);
                System.out.println("v : "+v);

            }
        }
        B b= new B();
        b.m2();
    }

    public static void main(String[] args) {
        A a= new A();
        a.m1(3);
    }
}
