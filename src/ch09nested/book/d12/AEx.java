package ch09nested.book.d12;

public class AEx {
    public static void main(String[] args) {

        Anonymous a = new Anonymous();
        a.f.run();
        a.m1();
        a.m2(new Vehicle() {
                 @Override
                 public void run() {
                     System.out.println("트럭이 달립니다. ");
                 }
             }
        );

    }
}
