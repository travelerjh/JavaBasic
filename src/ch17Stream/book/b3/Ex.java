package ch17Stream.book.b3;

import java.util.Arrays;
import java.util.List;

public class Ex {
    public static void main(String[] args) {
    List<Member> list = Arrays.asList(
            new Member("홍길동",30),
            new Member("신용권",40),
            new Member("김자바",26)
    )            ;


    list.stream().map(x->x.getAge()+x.getName()).forEach(System.out::println);
        System.out.println("나이들의 합");
        Integer reduce = list.stream().map(m -> m.getAge()).reduce(0, (r, s) -> r + s);
        System.out.println(reduce);

        System.out.println("가장 많은 나이 구해서 출력");
        Integer reduce1 = list.stream().map(m -> m.getAge()).reduce(Integer.MIN_VALUE, (r, s) -> Math.max(r, s));
        System.out.println(reduce1);
        System.out.println("가장 적은 나이 구해서 출력");
        Integer reduce2 = list.stream().map(m -> m.getAge()).reduce(Integer.MAX_VALUE, (r, s) -> Math.min(r, s));
        System.out.println(reduce2);
    }
}
