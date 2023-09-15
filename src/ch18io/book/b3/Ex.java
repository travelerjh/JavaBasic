package ch18io.book.b3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.temporal.Temporal;

public class Ex {
    public static void main(String[] args) {

        OutputStream os= null;
        try {
            os = new FileOutputStream("C:/Temp/test.txt");

            byte[] arr= {10,20,30,40,50};
            os.write(arr);
            os.write(arr,1,3);
            os.flush();
            os.close();
        } catch ( IOException e) {
            throw new RuntimeException(e);
        }


    }
}
