package ch12.book.d3;

public class Ex {
    public static void main(String[] args) {
        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");

        if (s1.hashCode() == s2.hashCode()) {
            if (s1.equals(s2)) {
            System.out.println("동등객채");
            } else {
            System.out.println("데이터가 다름으로 동등객채 아님");
          }
        }else {
        System.out.println("해시코드가 달르므로 등등객채 아님 ");
    }
}
}
