package ch11exception.lecture;

public class C08finally {
    public static void main(String[] args) {
        try {
            System.out.println(1);
            return;
        }finally {
            System.out.println("리턴이 있어도 무조건 실행");
        }


    }
}
