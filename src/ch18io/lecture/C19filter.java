package ch18io.lecture;

import java.io.*;

public class C19filter {
    public static void main(String[] args) {
        try {
            String src = "C:/Temp/out8.txt";
            InputStream is = new FileInputStream(src);
            Reader rd = new InputStreamReader(is);
            System.out.println((char) rd.read());
            System.out.println((char) rd.read());
            System.out.println((char) rd.read());
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
