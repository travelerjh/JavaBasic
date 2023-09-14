package ch11exception.lecture;

public class C03try {
    public static void main(String[] args) {
        System.out.println("code1");
        System.out.println("code2");

        try {
            int i=0;
            int j=3/i;

        }catch (ArithmeticException e){
            System.out.println("예외발생");
            System.out.println("예외발생");

        }


        System.out.println("code3");




    }
}
