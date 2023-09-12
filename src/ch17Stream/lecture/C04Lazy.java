package ch17Stream.lecture;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class C04Lazy {
    public static void main(String[] args) {
        List<String> list =List.of("a","b","c","D");
        Stream<String> stream = list.stream();
        stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                System.out.println("중간연산 실행중");
                return false;
            }
        }) //functional interface
         //최종 연산을 실행하지 않아서
        // 중간 연산자는 일하지 않음
        .count();

        System.out.println("프로그램 실행중");
    }
}
