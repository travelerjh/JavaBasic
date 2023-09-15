package ch18io.lecture;

import java.io.*;

public class C10copy {
    public static void main(String[] args) {
        String src = "C:/Temp/out3.txt";
        String des = "C:/Temp/out3_copy.txt";
        try {
            InputStream is = new FileInputStream(src);// 읽고
            OutputStream os = new FileOutputStream(des);// 쓰고
  /*
            byte [] b= new byte[3];
             int len1 = is.read(b) ;// 읽고
            os.write(b,0,len1); //쓰고

            int  len2 = is.read(b);
            os.write(b,0,len2);

            int  len3 = is.read(b);
            os.write(b,0,len2);
*/

            // 귀찮게 반복하지 말고 while 문돌리자

            byte [] b= new byte[3];
            int len=0;
            while ((len=is.read(b))!=-1){
                os.write(b,0,len);
            }

        }
     catch (IOException e){
            e.printStackTrace();
    }

    }
}
