package ch11exception.lecture;

public class C07finally {
    public static void main(String[] args) {
        System.out.println("code1");

        try {
            int j =3 /3;
            System.out.println("code2");
            return;
            // 메소드 실행 한곳으로 넘어간다.
            // 그럼에도 불구 하고 실행하고 싶으면
            // finally 로 실행할수 있다.
        }catch (ArithmeticException e ) {

            System.out.println("code3");

        }finally {
        System.out.println("code4");

        }

        System.out.println("code4");



    }
}
