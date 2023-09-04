package ch16lambad.lecture;

public class C03parameter {
    public static void main(String[] args) {
        // 파라미터가 여러개인 경우

        Myinterface03 m3 =((x, y) -> {
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        });
    }
}

@FunctionalInterface
interface Myinterface03{
    void m1(int x, int y);
}
