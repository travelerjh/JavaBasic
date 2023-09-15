package ch18io.book.b6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex {
    public static void main(String[] args) throws  Exception{

        String oF="C:/Temp/test1.jpg";
        String tF="C:/Temp/test2.jpg";

        InputStream is= new FileInputStream(oF);
        OutputStream os = new FileOutputStream(tF);

        byte[] data = new byte[3];
        while (true){
            int num= is.read(data);
            if(num==-1){break;}
            os.write(data,0,num);
        }
        os.flush();
        os.close();
        os.close();

        System.out.println("복사가 잘되었습니다.");
    }
}
