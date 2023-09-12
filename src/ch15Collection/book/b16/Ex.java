package ch15Collection.book.b16;

import java.util.*;

public class Ex {
    public static void main(String[] args) {
        //불변 컬랙션
        List<String> list = List.of("A","B","C");
        Set<Integer> set= Set.of(1,2,3);
        Map<Integer,String > map =Map.of(1,"A",2,"B",3,"C");

        List<String> list1 =new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        List<String> list2 = List.copyOf(list1);

        Set<String> set1 =new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");
        Set<String> set2 = Set.copyOf(set1);

        Map<Integer,String> map1 =new HashMap<>();
        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"C");
        Map<Integer,String> map2 =Map.copyOf(map1);

        String[] arr= {"A","B","C"};
        List<String> list3 =Arrays.asList(arr);

    }
}
