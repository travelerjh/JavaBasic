package ch15Collection.lecture;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C09iterator {
    public static void main(String[] args) {

        // remove 쓸때  Iterator 써야하는이유
        Set<String> set =new HashSet<>();
        set.add("j");
        set.add("a");
        set.add("v");
        set.add("a");


        //// for문 사용중에  탐색하는 중간에 제거 하면 오류가 발생한다.

        for (String em : set){
            System.out.println("em = " + em);
            if(em.equals("j")){
                set.remove("j");
            }


        }



    }
}
