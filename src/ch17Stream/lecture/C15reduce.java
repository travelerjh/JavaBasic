package ch17Stream.lecture;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class C15reduce {
    public static void main(String[] args) {
        // 줄이다 .
        // 스트림에 온소를 모아서 하나로 만든다.
        // ..... ->  *
        // 어려운 내용 
        // 평균 최대 최소 구할때씀  최종 연산자임
        
        var list = List.of(5,1,3);
        list.stream().reduce(0,(r,e)->0);

        System.out.println("모든값 더하기");
        list.stream().reduce(0,(r,e)->r+e);
        //System.out.println(reduce1);
        list.stream().forEach(System.out::println);


        /*
        Integer.MIN_VALUE는 초기값(initial value)으로 사용됩니다.
         이 값은 연산을 시작할 때 최대값으로 고려됩니다. Integer.MIN_VALUE는 Java에서 정수형의 최소값을 나타내는 상수입니다.

        (x, y) -> Math.max(x, y)는 바이너리 연산자(binary operator)로,
                                       스트림의 요소를 최대값을 찾기 위해 비교하는 데 사용됩니다.
        x는 현재까지의 최대값이고 y는 현재 요소입니다. Math.max(x, y)는 두 값 중 큰 값을 반환합니다.

        */
        System.out.println("최대값");
        Integer reduce = list.stream().sorted().reduce(Integer.MIN_VALUE, (x, y) -> Math.max(x, y));
        System.out.println(reduce);
        /*
        System.out.println("최대값 구하기");
        Integer reduce2 = list.stream().reduce(Integer.MIN_VALUE, (x, y) -> Math.max(x, y));
        System.out.println(reduce2);

        System.out.println("최소값 구하기");
        Integer reduce3 = list.stream().reduce(Integer.MAX_VALUE, (x, y) -> Math.min(x, y));
        System.out.println(reduce3);

        //모든 문자열 연결
        var list2 =List.of("ja","va","is","g","ood");
        Optional<String> reduce4 = list2.stream().reduce((r, s) -> r + s);
        System.out.println(reduce4);
*/
    }
}
