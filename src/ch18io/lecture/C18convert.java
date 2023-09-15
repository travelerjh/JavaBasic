package ch18io.lecture;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C18convert {
    public static void main(String[] args)  throws  Exception{

        //가지고온 바이트 스트림을 문자스트림으로 형을 변환하고 싶을 때 사용

    OutputStream os = getOutputStream("C:/Temp/out8.txt");
    //os.write('손');
        OutputStreamWriter osw =new OutputStreamWriter(os); // 끝에 뭐로 끝나는지 알면된다
        osw.write('손');
        osw.write('흥');
        osw.write('민');

        osw.flush();
    }

    public static OutputStream getOutputStream(String file) throws FileNotFoundException {
        OutputStream os =new FileOutputStream(file);
        return os;
    }

}
