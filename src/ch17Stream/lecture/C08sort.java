package ch17Stream.lecture;

import java.util.List;

public class C08sort {
    public static void main(String[] args) {
        var list = List.of(3,1,2,3,5,2,1,4);
        list.stream().sorted().forEach(System.out::println); //순서대로 출력 list 니까



    }
}
