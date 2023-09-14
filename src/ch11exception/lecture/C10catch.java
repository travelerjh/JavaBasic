package ch11exception.lecture;

import java.util.concurrent.CancellationException;

public class C10catch {
    public static void main(String[] args) {
        //여러 catch 를 사용하기 힘들수도 있다.
        try {

        }catch (ArrayIndexOutOfBoundsException e){
            //예외 처리 코드

        }catch ( NumberFormatException e){
             //처리 코드
        }


        try {

        }catch (  CancellationException  | NullPointerException e){

        }


    }

}
