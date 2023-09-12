package ch17Stream.book.b4;

import java.util.Arrays;
import java.util.List;

public class Ex {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambaa Expressions",
                "Java8 supports lamdba expressions"
        );
        list.stream()
                .filter(n->n.contains("java")||n.contains("Java"))
                .forEach(System.out::println);
    }
}
