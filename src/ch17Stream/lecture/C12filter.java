package ch17Stream.lecture;

import java.util.List;

public class C12filter {
    public static void main(String[] args) {
        var list = List.of(3,2,1,5,2,6,13,24,42);
        /*
        list.stream()
                .filter(e->true) //true 가 나올때만만
                .filter(e->e%2==0)   // 짝수
               .forEach(System.out::println);

        System.out.println("짝수중에 가장 작은값");
        list.stream().sorted().filter(e->e%2==0).limit(1).forEach(System.out::println);
        System.out.println("홀수 중에 가장 큰값");
        list.stream().filter(e->e%2==1).sorted((x,y)->y-x).limit(1).forEach(System.out::println);
*/

        System.out.println("짝수가 나올때");
        list.stream().distinct().sorted().filter(e->e%2==0).forEach(System.out::println);
        System.out.println("짝수중에 가장큰 값");
        list.stream().sorted((x,y)->y-x).filter(e->e%2==0).limit(1).forEach(System.out::println);
        System.out.println("홀수중에 가장 작은 값");
        list.stream().sorted().filter(e->e%2==1).limit(1).forEach(System.out::println);

    }
}
