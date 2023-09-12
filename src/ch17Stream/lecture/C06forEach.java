package ch17Stream.lecture;

import java.util.List;

public class C06forEach {
    public static void main(String[] args) {
        List<Integer> list = List.of(3,1,2,4,5,6) ;
        list.stream().forEach(System.out::println);
        System.out.println("--------");

        //순서 정렬
        list.stream().sorted().forEach(System.out::println);



    }

}
