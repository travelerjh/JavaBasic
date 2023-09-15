package ch18io.lecture;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C06write {
    public static void main(String[] args) {
        String path ="C:/Temp/out3.txt";
        OutputStream os = null;
        try {
            os = new FileOutputStream(path);

            byte[] b ={65,66,67,68,69};

            os.write(b);
            os.write(b,0,3); //65,66,67
            os.write(b,2,2);//67,68
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
