package ch11exception.lecture;

public class C06finally {
    public static void main(String[] args) {
        // 예외가 발생하던 안하던 실행되는 코드
        System.out.println("co1");
        try {
            int i=0;
            int j=3/i;
            System.out.println("co2");
        }catch (ArithmeticException e){
           // e.printStackTrace();
            System.out.println("co3");
        }finally {
            //예외 발생과 관계없이 발생하는 코드 finally

            System.out.println("co4 반드시 발생되느 코드드");

       }


        System.out.println("co5");



    }
}
