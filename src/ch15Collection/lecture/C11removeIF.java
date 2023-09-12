package ch15Collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C11removeIF {
    public static void main(String[] args) {

        Set<String>set =new HashSet<>();
        set.add("j");
        set.add("a");
        set.add("v");
        set.add("a");



       // set.removeIf(e->e.equals("j"));



        /*
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String item =iterator.next();
            if(item.equals("j")){
//                set.remove("j");
                iterator.remove();

            }
        }
         */



        System.out.println(set);
    }
}
