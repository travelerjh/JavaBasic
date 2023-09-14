package ch18io.lecture;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class C02io {
    //스트림이 열리면
    // 꼭 닫아줘야 한다.
    // 제일 중요
    public static void main(String[] args) throws Exception {
        //OutputStream : 바이트 단위 출력 스트림
        //데이터를 내보냄
        // 나가는 것과 관련된 메소드가 잇을거다.
        OutputStream os =new FileOutputStream("out.txt");
        os.write(7);
        os.write(27);
        os.write(67);

        os.close();

    }
}
