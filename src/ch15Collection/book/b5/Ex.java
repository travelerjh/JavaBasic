package ch15Collection.book.b5;

import java.util.HashSet;
import java.util.Set;

public class Ex {
    public static void main(String[] args) {
        Set<String> set =new HashSet<>();
        set.add("java");
        set.add("css");
        set.add("html");
        set.add("Spring");
        int i = set.size();
        System.out.println(i);

    }
}
