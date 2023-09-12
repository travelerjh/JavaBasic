package ch17Stream.lecture;

import java.util.List;

public class C11sorted {
    public static void main(String[] args) {
        var list = List.of(21,125,13,4,5,6,7,3);
        System.out.println("가장 작은수 출력");
        list.stream()
                .sorted((x,y)->y-x)// 작은순으로 정렬
                .forEach(System.out::println);

        System.out.println("가장 큰 수 출력");
        list.stream().sorted().limit(1).forEach(System.out::println);


    }
}
