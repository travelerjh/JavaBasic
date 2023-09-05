package ch12.book.d4;

import java.util.HashSet;

public class Ex {
    public static void main(String[] args) {
        HashSet<Student> hashset =new HashSet<>();
        hashset.add(new Student("1"));
        hashset.add(new Student("1"));
        hashset.add(new Student("2"));
        System.out.println("저장된 학생수 "+hashset.size());
    }
}
