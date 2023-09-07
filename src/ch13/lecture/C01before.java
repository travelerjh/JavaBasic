package ch13.lecture;

public class C01before {
    public static void main(String[] args) {

    Myclass01 m1 = new Myclass01();
    m1.setA("jae");
    m1.getA();

    Myclass01 m2 = new Myclass01();
    m2.setA(123);

    Object o1= m1.getA();
    Object o2= m1.getA();

    // 강제형변환 매우 위험
    String g1 = (String)o1;
    Integer g2 = (Integer)o2;


    }
}

class Myclass01{
    private Object a;

    public Object getA() {
        return a;
    }

    public  void  setA(Object a){


    }
}
