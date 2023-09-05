package ch12.book.d4;

import ch12.book.d3.Student;

public class EXx {
    public static void main(String[] args) {
        Student s1= new Student(1,"길동");
        Student s2= new Student(1,"길동");

    if (s1.hashCode()==s2.hashCode()){
        if (s1.equals(s2)) {
            System.out.println("동등객채");
        }else {
            System.out.println("데이터가 다름 ");
        }
    }else {
        System.out.println("해시코드가 다르므로 동등 객채 아님ㄵ");
    }

    }
}
