package ch15Collection.book.b6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex {
    public static void main(String[] args) {
        Set<String> set= new HashSet<>();
        set.add("jvav");
        set.add("v");
        set.add("av");
        set.add("ase");
     Iterator<String>iterator= set.iterator();
     while(iterator.hasNext()){
         String element = iterator.next();;
         System.out.println(element);
         if (element.equals("v")){
             iterator.remove();
         }
     }
        System.out.println();
     set.remove("av");
        for (String elemnet:set){
            System.out.println(elemnet);
        }
    }
}
