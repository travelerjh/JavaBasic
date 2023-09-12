package ch17Stream.lecture;

import java.util.List;

public class C05termial {
    public static void main(String[] args) {
        List<String> list =List.of("css","html","java");
         long count =list.stream().count(); // count는 스트림의

        System.out.println(count);


    }
}
