package ch18io.lecture;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C14write {
    public static void main(String[] args) {
        String file = "C:/Temp/out7.txt";
        try {
            Writer w = new FileWriter(file);
            char[] chars={'손','흥','민','이','강','인'};
            w.write(chars);
            w.write(chars,0,3);
            w.write(chars,4,2);

            w.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
