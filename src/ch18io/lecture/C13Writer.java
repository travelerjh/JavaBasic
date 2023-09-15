package ch18io.lecture;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.Writer;

public class C13Writer {
    public static void main(String[] args)throws Exception {
        String file1 ="C:/Temp/out5.txt";
        String file2 ="C:/Temp/out6.txt";

        OutputStream os = new FileOutputStream(file1);
        Writer writer = new FileWriter(file2);

        os.write(65);
        writer.write(65);

        // 문자 단위와 바이트 단위로 읽을때 다른다 .
        // 같다고 생각하면 안됩니다.
        // 생각하고 접근하세요
        // 영어권은 바이트 스트림을 사용하는 경우가 잇다 .


        os.write(48124);
        writer.write(48124);

        os.flush();
        writer.flush();

    }
}
