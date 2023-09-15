package ch18io.book.b2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex {
    public static void main(String[] args) {
        try {
            OutputStream os =new FileOutputStream("C:/Temp/test2.db");
            byte[] arr ={10,20,30};
            os.write(arr);
            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
