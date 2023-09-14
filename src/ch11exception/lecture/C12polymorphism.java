package ch11exception.lecture;

public class C12polymorphism {
    public static void main(String[] args) {

        // 상위 타입을 잡으려면 조심하자


        try {
            //ClassNotFoundException
            //NullPointerException
            //AruthmeticException
        }catch (ClassCastException e){
            //이러면 예외처리 실패
            //순서대로 처리
            //RuntimeException 여기서 잡힌다.
            // 코드 실행 안됨
            //순서를  위로 올리면 된다 .]


            // 상위 버전으로 예외 처리
        }catch (RuntimeException e){
            //NullPointerException
            //AruthmeticException
            // 이 두개 예외처리

/*
        }catch (ClassCastException e){
            //이러면 예외처리 실패
            //순서대로 처리
            //RuntimeException 여기서 잡힌다.
            // 코드 실행 안됨
            //순서를  위로 올리면 된다 .]
  */

        }

    }
}
