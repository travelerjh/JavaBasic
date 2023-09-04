package ch09nested.lecture;

public class C10anonymous {
    public static void main(String[] args) {
        Myclass10 o1 =new MysubClass101() ;
        Myclass10 o2 =new Myclass10(){};

    }
}
class  MysubClass101 extends Myclass10{

}

abstract class Myclass10{

}