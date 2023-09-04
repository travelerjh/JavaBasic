package ch16lambad.lecture;

public class C09methodReference {
    public static void main(String[] args) {
        MyInterface09 o1 = (x, y) -> {};
        Myclass09 o2 =new Myclass09();
        MyInterface09 o3 =(x, y) -> x.someMethod(y);
        MyInterface09 o4 =Myclass09::someMethod;

    }
}

class  Myclass09 {
    void  someMethod(int a){

    }
}

interface  MyInterface09 {
    void method(Myclass09 x, int y);
}
