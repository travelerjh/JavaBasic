package ch18io.lecture;

import java.io.*;

public class C11copy {
    public static void main(String[] args) throws Exception {
        String src= "C:/Temp/test1.jpg";
        String des= "C:/Temp/test3.jpg";
        InputStream is = new FileInputStream(src);
        OutputStream os = new FileOutputStream(des);

        byte [] by = new byte[1];
        int len =0;
        while ((len = is.read(by))!=-1){
            os.write(by,0,len);
        }
    }
}
