package ch11exception.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C16checkedException {
    public static void main(String[] args) {
        // 써본적이 없다 .
        // 안배운 내용 가져온다.
        // 18장에서 배울 내용

        // 생성자 썻더니 오류 발생
       // var input = new FileInputStream("file");


        //RuntimeExecption 은 예외 처리 코드 안써도 됨

        //checkedException은 꼭 작성해야됨


        try {
            var input = new FileInputStream("file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        };

    }
}
