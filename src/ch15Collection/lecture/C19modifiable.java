package ch15Collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C19modifiable {
    public static void main(String[] args) {
        List<String> list1 = List.of("html","css","react","js");

        List<String> list2 =  new ArrayList<>(list1);


    }
}
