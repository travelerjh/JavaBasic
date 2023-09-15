package ch18io.lecture;

import java.io.*;
import java.util.Scanner;

public class C03trywithresource {
    public static void main(String[] args) throws IOException {
        OutputStream op = null;
        try {
            op = new FileOutputStream("op");
            op.write(11);
            op.write(23);
            op.write(63);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            op.close();
        }
    }

    public void method2 () throws Exception {
        OutputStream os = new FileOutputStream("os");
        os.write(34);
        os.write(47);
        os.write(97);
        os.close();
    }


    public void  method3() throws Exception {
        FileOutputStream fos =new FileOutputStream("");
        FileInputStream fis= new FileInputStream("");

        fos.write(25);
        fis.read();

        fos.close();
        fis.close();
    }

    public void  m4(){
        Scanner sc =new Scanner("");
        sc.nextInt();
        sc.close();
    }





}
