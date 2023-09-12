package ch15Collection.lecture;

import java.util.HashMap;
import java.util.Map;



public class C12map {
    public static void main(String[] args) {
        //Map : key ,value 쌍를 저장
        //key가 중복된 entry가 있을 수 없다.

        Map<String ,String> map =new HashMap<>();
        //인스턴스를 만들려고 한다 .
        //인터페이스에서는 인스턴스를 사용할수 없으니까 HashMap 사용

        //entry == 키와 값
        // map.put(키 , 값)  == entry 를 추가하는 메소드
        map.put("student1","손");
        map.put("student2","박");
        map.put("student3","차");

        // map.put ==  entry를 교체하는 메소드
        map.put("student1","손흥민");


        // map.size  ==  entry 에 갯수 확인
        map.size();
        System.out.println(map.size());

        // map.  == entry 를 삭제하는 메소드
        map.remove("student2");

        // map.get == entry 에 value를  얻는 메소드   !!! 키를 통해서 value를 안다.
        String s =  map.get("student5");
        System.out.println("s = " + s);

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getValue()+entry.getKey());
        }


    }
}
