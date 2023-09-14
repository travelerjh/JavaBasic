package ch11exception.lecture;

public class C05printStackTrace {
    public static void main(String[] args) {
        System.out.println("co1");

        try {
            int i=0;
            int j=3/i;
            System.out.println("co2");
        }catch (ArithmeticException e){
            e.printStackTrace();
            // .printStackTrace();
            // 하위타입은 다가지고 있다.
            //java.lang.ArithmeticException: / by zero
            //	at ch11exception.lecture.C05printStackTrace.main(C05printStackTrace.java:9)
            // 흔적을 남기는 거



        }
        System.out.println("co3");

    }
}
