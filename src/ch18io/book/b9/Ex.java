package ch18io.book.b9;

import java.io.*;

public class Ex {
    public static void main(String[] args)throws Exception {

        write ("문자 변환 스트림 사용합낟.");
        String data = read();
        System.out.println(data);
    }

    public  static  void write(String str) throws  Exception{
        OutputStream os = new FileOutputStream("C:/Temp/test.txt");
        Writer w = new OutputStreamWriter(os);
        w.write(str);
        w.flush();
        w.close();
    }
    public static String read()throws  Exception{
        InputStream is =new FileInputStream("C:/Temp/test.txt");
        Reader reader =new InputStreamReader(is);

        char[]data = new  char[100];
        int num = reader.read(data);
        reader.close();
        String str =new String (data,0,num);
        return str;
    }


}
