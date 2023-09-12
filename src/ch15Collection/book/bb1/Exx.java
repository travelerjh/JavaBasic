package ch15Collection.book.bb1;

import java.util.HashSet;
import java.util.Set;

public class Exx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");

       int a= set.size();
        System.out.println(a);
    }
}
