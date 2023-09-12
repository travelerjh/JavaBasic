package ch17Stream.book.b1;

import java.util.ArrayList;
import java.util.List;

public class Ex {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홀길동");
        list.add("송흔민");
        list.add("길민재");
        list.add("길민재");
        list.add("이강노");
    list.stream().distinct().forEach(System.out::println);


        System.out.println();

        list.stream().filter(n->n.startsWith("길민재"))
                .forEach(System.out::println);
        System.out.println();


        list.stream().distinct()
                .filter(n->n.startsWith("홍"))
                .forEach(System.out::println);

    }
}
