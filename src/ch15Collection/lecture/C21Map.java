package ch15Collection.lecture;

import java.util.HashMap;
import java.util.Map;

public class C21Map {
    public static void main(String[] args) {

    Map<String, Integer> map= Map.of(
            "승민",30,
            "재훈",20,
            "민재",20
);
    Map<String,Integer> map1 =new HashMap<>(map);
    map1.put("강인",23);

        System.out.println(map1);

}

}
