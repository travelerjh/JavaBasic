package basic11interface.lecture;


// public default   void  m2() {
public class C11default {
    public static void main(String[] args) {
        Myc011  mc = new Myc011();
        mc.m2();
    }

}
interface My11{
    public abstract   void m1();
    public default   void  m2() {
        // 100개 있었다 .너무 불편하다
        // 다똑같은 일을한다면
        System.out.println("My11.m2");

    }
}

class Myc011 implements My11{

    @Override
    public void m1() {
        System.out.println("Myc011.m1");
    }
}
class Myc012 implements My11{

    @Override
    public void m1() {
        System.out.println("Myc012.m1");
    }
}


