package ch15Collection.lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C13map {
    public static void main(String[] args) {
        //map 전체 탐색
        Map<String,String> map = new HashMap<>();
        map.put("학생1","쏜");
        map.put("학생2","민");
        map.put("학생3","연아");
                //키  // 값


      Set<Map.Entry<String, String>> entry =map.entrySet();
        for (Map.Entry<String, String> en: entry){
            System.out.println(en.getValue());
        }


        Set<String> keySet=map.keySet();
        for(String k : keySet){
            System.out.println(k);
        }






















/*
        //향상된 for 문
        Set<Map.Entry<String, String>> entries = map.entrySet();// 타입이 set
        for(Map.Entry<String,String> entry : entries){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        //keySet
        System.out.println("keyset 사용헤서 전체 팀섹");
        //key 특징이 set 과 같다.
        //맵에서 key만 얻어오자 === keyset();
        Set<String> keySet = map.keySet();
        for(String key :keySet){
            System.out.println(key+map.get(key));
        }

        //forEach
        System.out.println("forEach");
        map.forEach((key,value)-> System.out.println(key+value));


*/

    }
}
