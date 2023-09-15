package ch18io.lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C08InputStream {
    public static void main(String[] args) {
        String file ="C:/Temp/out3.txt";
        try (InputStream is = new FileInputStream(file)) {
            byte[] arr = new byte[3];
            int read1 = is.read(arr);
            int read2 = is.read(arr);
            int read3 = is.read(arr);
            int read4 = is.read(arr);
            int read5 = is.read(arr);
            System.out.println("read1 = " + read1);
            System.out.println("read2 = " + read2);
            System.out.println("read3 = " + read3);
            System.out.println("read4 = " + read4);
            System.out.println("read5 = " + read5);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
