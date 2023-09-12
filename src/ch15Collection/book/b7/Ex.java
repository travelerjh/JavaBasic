package ch15Collection.book.b7;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class Ex {
    public static void main(String[] args) {

        Set<Member> m = new HashSet<>();
        m.add(new Member("홍길동",30));
        m.add(new Member("홍길동",30));
        m.add(new Member("김민재",30));


        m.removeIf(e->e.equals(new Member("김민재",30)));


        System.out.println(m.size());//2가 아니고 1임 equals를 사용해서 !

    }
}
