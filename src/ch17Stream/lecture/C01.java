package ch17Stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C01 {
    //도구다 정글이네
    //필요할떄 가져다 쓰면된다.
    public static void main(String[] args) {
        //컬랙션을 만든다 . list set map

       List<String> list=  List.of("list","set","map");

       list.stream().forEach(System.out::println);

        for(String items: list){
            System.out.println(items);
        }

        Stream<String> stream =list.stream();

        // 중간연산 :intermdidate operation
        // 최종연산 :termial operation

        // 최종 연산 후 스르팀 재사용 불가
        // 최종 연산시 중간연산을 같이 처리함 나중에 한꺼번에 처리함 lazy

            stream.limit(5); //중간연산  중간에 여러번 사용가능
            stream.count(); //최종연산은 마지막 한번만 사용가능


    }
}
