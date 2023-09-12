package ch15Collection.book.b8;

import java.util.HashSet;
import java.util.Set;

public class Ex {
    public static void main(String[] args) {
        Set<Student> st = new HashSet<>();
        st.add(new Student("길동",1));
        st.add(new Student("길동",1));
        st.add(new Student("동",2));
        st.add(new Student("길",3));
        st.add(new Student("옥자",4));

        st.removeIf( e->e.equals(new Student("옥자",4)));


        System.out.println(st.size());

        for(Student s :st ){
            System.out.println(s.name);
        }


    }
}
