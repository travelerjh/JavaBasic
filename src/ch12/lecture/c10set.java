package ch12.lecture;

import java.util.HashSet;

public class c10set {
 // 집합  : set
 public static void main(String[] args) {


     //set 으로 중복확인하면 된다.
     HashSet set = new HashSet();
     set.add(new Object());
     set.add(new Object());

     System.out.println(set.size());

     set.add(new String ("java"));
     System.out.println(set.size());
     set.add(new String ("java"));
     System.out.println(set.size());



 }
}
