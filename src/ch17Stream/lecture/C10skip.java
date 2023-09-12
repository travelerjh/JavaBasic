package ch17Stream.lecture;

import java.util.List;

public class C10skip {
    public static void main(String[] args) {
        var list = List.of(10,9,8,5,4,3,2);
/*
        list.stream().skip(3).forEach(System.out::println);
        //3번째 만큼 스킵
        System.out.println("-----------------------");

        list.stream()
                .sorted()
                .limit(4)
                .forEach(System.out::println);
*/

        //이거랑
        list.stream().skip(2).distinct().sorted().forEach(System.out::println);
        //이거랑 값이 다르게 나온다 .
        list.stream().distinct().sorted().skip(2).forEach(System.out::println);
        // 보지말고 어떻게 다르게 나오는지 알아봐







    }
}
