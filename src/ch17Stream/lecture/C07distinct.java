package ch17Stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C07distinct {
    public static void main(String[] args) {
        //  중복 제거  구별하다 !
        List<Integer> list = List.of(1,2,5,3,2,5,12,3);  //,2,3 제거 distinct() 덕분에
/*
        long count=list.stream()
                .distinct().count();
        //최종 연산 전에 중간중간 들어가면된다.
        System.out.println(count);
*/

        long count = list.stream().distinct().count();
        System.out.println(count);
        System.out.println("-------------------------");

        list.stream().sorted().distinct().forEach(System.out::println);


    }
}
