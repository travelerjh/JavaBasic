package ch15Collection.book.b13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// 다시 풀어보기;!!

public class Ex {
    public static void main(String[] args) {

        Map<String ,Integer>map = new HashMap<>();
        map.put("blue",96);
        map.put("hong",86);
        map.put("white",92);

        String name=null; //  최고점수 받은 아이디
        int maxSore=0;    //  최고점수 저장하는 변수
        int totalSore=0; // 점수 함계를 저장하는 변수





















        // 여기에 코드를 작성하세요 ;
        for(Map.Entry<String,Integer> m:map.entrySet()){
            totalSore+=m.getValue();

            if(maxSore<m.getValue()){
                maxSore =m.getValue();
                name =m.getKey();
            }


        }
        System.out.println(totalSore/3);






    }
}
