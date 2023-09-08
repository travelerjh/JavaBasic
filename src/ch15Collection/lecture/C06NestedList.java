package ch15Collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C06NestedList {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> ro1 = new ArrayList<>();
        List<Integer> ro2 = new ArrayList<>();

        ro1.add(9);
        ro1.add(5);
        ro1.add(2);
        ro2.add(10);
        ro2.add(40);
        ro2.add(70);

        list.add(ro1);

        list.add(ro2);

        System.out.println(list.get(0).get(0));
        System.out.println(list.get(0).get(1));

        System.out.println(list.get(1).get(0));
        System.out.println(list.get(1).get(1));


        list.add(ro1);

        System.out.println(list.get(2).get(0));
        System.out.println(list.get(2).get(1));

        list.get(0).set(0,99);
        System.out.println(list.get(0).get(0));
        System.out.println(list.get(2).get(0));


    }
}
