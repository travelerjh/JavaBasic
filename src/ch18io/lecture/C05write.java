package ch18io.lecture;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C05write {
    public static void main(String[] args) {
        String path = "C:/Temp/out2.txt";
        try (OutputStream os = new FileOutputStream(path)) {
          byte[]b =new byte[100];
            os.write(b);
            os.write(b);
            os.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
