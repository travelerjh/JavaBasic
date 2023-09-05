package ch16lambad.lecture;

import java.util.stream.IntStream;

public class C12Cont {
    public static void main(String[] args) {
        System.out.println("for 문사용");
        for (int i =1 ;i <10; i++){
            Student s = new Student(i);
            System.out.println(s);
        }
        System.out.println("스트림사용");
        IntStream.range(1,10).mapToObj(Student::new).forEach(System.out::println);



    }
}

//

class Student{
    private int number;

    Student(int number){
        this.number=number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                '}';
    }
}


