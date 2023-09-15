package ch18io.lecture;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C15reader {
    // 문자 단위 스트림
    public static void main(String[] args) {

        String path ="C:/Temp/out7.txt";
    try{
    Reader reader =new FileReader(path);
        int read = reader.read();
        System.out.println(read);// 유니코드 출력
        char c1 = (char) read;
        System.out.println(c1);



        int read1 = reader.read();
        System.out.println(read1);//유니코드 출력
        char c2 = (char) read;
        System.out.println(c2);



        char[] chars = new  char[3];
        reader.read(chars);
        reader.read(chars);


    }catch (IOException e) {
        e.printStackTrace();
    }
    }


}
