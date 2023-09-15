package ch18io.lecture;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C04 {
    public static void main(String[] args) {
        String path = "C:/Temp/out1.txt";
        try (OutputStream os = new FileOutputStream(path)) {

            //OutputStream write
            os.write(70); //
            os.write(71);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
