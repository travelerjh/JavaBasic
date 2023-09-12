package ch17Stream.lecture;

import java.util.List;

public class C09 {
    public static void main(String[] args) {
        var list = List.of(3,6,5,4,8,9,7,1,210);
/*
        list.stream().limit(3).forEach(System.out::println);
        //limit 는 3개
        System.out.println("----------------");
        list.stream().sorted().limit(3).forEach(System.out::println);
        //리스트에 있는 가작 작은값 3개 출력!!!!
*/

        System.out.println("중복제거하고  순서대로 만들고 5개 추출");

        list.stream().sorted().limit(5).forEach(System.out::println);



    }
}
