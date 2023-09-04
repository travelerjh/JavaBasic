package ch09nested.book.d5;

public class A {
    String f = "A-f";
    void m(){
        System.out.println("A.m");
    }
    class B{
        String fb= "B-f";

        void  m(){
            System.out.println("B.m");
        }
        void print(){
            System.out.println(this.fb);
            this.m();
        }
    }
void useB(){
        B b= new B();
        b.print();
}

    public static void main(String[] args) {
        A a= new A();
        B b =  a.new B();
        a.useB();
        b.print();
    }

}
