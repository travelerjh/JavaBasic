package ch18io.lecture;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C12 {
    public static void main(String[] args) {

        // 문자관련된것  만만한 FileWriter

        //바이트 스트림은 그림
        // 문자 스트림은 문자

        try (Writer w = new FileWriter("C:/Temp/go.txt")) {
            w.write("안녕하세요 반가워요");

            w.flush();

        } catch (IOException e) {
         e.printStackTrace();
        }


    }


}
