package ch11exception.lecture;

public class C17checked {
    public static void main(String[] args) {

        // Class.forName("java.lang.String");
        // forName 무슨일을 하는지는 모르겠지만 에러


        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        };


    }
}
