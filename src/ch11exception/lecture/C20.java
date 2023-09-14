package ch11exception.lecture;

public class C20 {
    public static void main(String[] args) throws  Exception {
        m1();
    }
    public static  void m1() throws  ClassNotFoundException{
        m2();
    }

    private static void m2()  throws  ClassNotFoundException{
    }
}
