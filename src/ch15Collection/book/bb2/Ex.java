package ch15Collection.book.bb2;

import java.util.HashSet;
import java.util.Set;

public class Ex {
    public static void main(String[] args) {
        Set<Member> set =new HashSet<>();
        set.add(new Member("재희", 30));
        set.add(new Member("재훈", 33));
        set.add(new Member("사라", 26));

        set.size();


        for(Member m : set){
            System.out.println(m);
        };




    }



}
