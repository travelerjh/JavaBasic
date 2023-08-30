package basic10.book;

public class B12Ex {

    public static void action(B12A a){
        a.m1();

        if( a instanceof B12C C) {
            C.m2();
        }

    }
    public static void main(String[] args) {

    action(new B12A());
    action(new B12Ba());
    action(new B12C());

    }
}