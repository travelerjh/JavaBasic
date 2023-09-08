package ch15Collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C02List {
    //List : 순서가 있음
    //     : 중복 가능
    //  선입 선출  FIFO

    public static void main(String[] args) {
        //리스트 타입의 인스턴스 (객채)
        List<String> list = new ArrayList<>();
        // CURD
        //원소 추가
        list.add("java");
        list.add("css");
        list.add("Spring");
        list.add("html");
        list.add("html"); //중복 가능
        list.add("html");
        list.add("html");

        //꺼내기
        System.out.println(list.get(0));

        //원소 확인
        int size = list.size();
        System.out.println(size);

        //지우기
        list.remove("html"); // 먼저 들어가놈 지워짐
       // list 출력
        for(String items: list ){
            System.out.println(items);
        }
        // 있는지 확인
        boolean co = list.contains("java");
        System.out.println(co);

        boolean co2 = list.contains("jquery");
        System.out.println(co2);
//
//        //전체 원소 검색
//        for (int i =0 ;i <list.size(); i++){
//            System.out.println(list.get(i));
//        }

//
//        //향상된 for 문
//         for (String item:list ){
//             System.out.println(item);
//         }
//         // forEach  ---->
//        System.out.println("foreach 메소드로 전체 탐색");
//         list.forEach(e-> System.out.println(e));
//         list.forEach(System.out::println);

    }
}