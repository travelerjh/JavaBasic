package ch15Collection.book.b12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();
        map.put("신용재",40);
        map.put("지드랭곤",20);
        map.put("민재",10);
        map.put("흥민",20);
        map.put("두리",50);

        System.out.println(map.size());
        System.out.println();




        Set<String> keySet =map.keySet();

        Iterator<String> keyI= keySet.iterator();
        while (keyI.hasNext()){
            String k =keyI.next();
            Integer v =map.get(k);
            System.out.println(v);
        }
        System.out.println();

        Set<Entry<String,Integer>> entrySet =map.entrySet();
        Iterator<Entry<String,Integer>>entryIterator =entrySet.iterator();
        while (entryIterator.hasNext()){
            Entry<String,Integer>entry =entryIterator.next();
            String k= entry.getKey();
            Integer v= entry.getValue();
            System.out.println(v);
        }
        System.out.println();

        map.remove("신용재");
        System.out.println(map.size());
        System.out.println();


        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue()+entry.getKey());
        }


        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
        map.remove("민재");

    }
}
