package ch17Stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C03 {
    public static void main(String[] args) {
        List<String> list = List.of("java","css","spring");
        Stream<String> stream = list.stream();


        stream.count();

        stream.count(); //exception


        //최종연산이 끝난 스트림은 재사용이 불가
        // 스트림을 다시 만들어서 사용하자

        Stream<String> stream2 = list.stream();
        stream2.count();

        System.out.println("프로그램 실행중");


    }

}
