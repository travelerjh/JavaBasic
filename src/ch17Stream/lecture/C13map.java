package ch17Stream.lecture;

import java.util.List;

public class C13map {
    public static void main(String[] args) {
        //짝을 짖는다.
        var list = List.of(3,2,1,4,6,7);

        list.stream()
                .sorted()
                .map(x->10)
                .forEach(System.out::println);
        System.out.println("음수로 바꿔서 출력");
            list.stream()
                    .sorted()
                    .map(x->-x).forEach(System.out::println);
        System.out.println("x2 출력");
            list.stream().map(x->x*2).forEach(System.out::println);
        System.out.println("제곱 출력");
        list.stream().map(x->x*x).forEach(System.out::println);


    }
}
