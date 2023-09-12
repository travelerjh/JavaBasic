package ch17Stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C02stream {
    public static void main(String[] args) {
     List<String> list = List.of("ab","dc","xy");
//        Stream<String> stream = list.stream();
//        Stream<String> stream1=stream.map(e->e+e);//중간연산
//        long count = stream1.count();// 최종연산

        list.stream()
                .map(e->e+e)                // 중간연산
                .filter(e->e.length()>1)   // 중간연산
                .count();                 // 최종연산



    }
}
