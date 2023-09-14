package ch11exception.lecture;

public class C11polymorphism {
    public static void main(String[] args) {
        try {


        }catch (NullPointerException e){
            // 동일한 예외처리 코드
        }catch (ArithmeticException e){
            // 동일한 예외처리 코드
        }


        try {
        }catch (RuntimeException e){
            //위에 타입 보다 상위 타입 이라
            // 다형성으로 사용 가능
            //ArithmeticException,NullPointerException
            // 동일한 예외처리코드

        }




    }
}
