package ch18io.book.b7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex {
    public static void main(String[] args) {

        try {
        Writer w =new FileWriter("C:/Temp/test22.txt");
        char a= 'A';
        w.write(a);
        char b= 'B';
        w.write(b);

        char[] arr= {'C','D','E'};
        w.write(arr);

        w.write("FGH");
        w.flush();
        w.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
