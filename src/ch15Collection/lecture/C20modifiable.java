package ch15Collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C20modifiable {
    public static void main(String[] args) {
        Set<String> set = Set.of("java","String","react");
        Set<String> set2= new HashSet<>(set);
        set2.add("html");
        System.out.println(set.size());
        System.out.println(set2.size());
        System.out.println("set = " + set);
        System.out.println("set2 = " + set2);



    }
}
