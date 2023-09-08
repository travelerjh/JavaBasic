package ch15Collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C09set {
    public static void main(String[] args) {
        Set<String> set =new HashSet<>();
        //실제 인스턴스 메소드 호출
        // 탐색순서가 보장되지 않는다.
        set.add("java");
        set.add("민재");
        set.add("흥민");

        set.forEach(System.out::println);
    }
}
