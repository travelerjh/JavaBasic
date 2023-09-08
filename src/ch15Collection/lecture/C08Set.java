package ch15Collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C08Set {
    //set 수학의 집합이다.
    //중복되지 않는
    // Hashset
    //
    //add
    //contain
    //remove
    //size (개수 확인)
    // !!!!!!!!!! 중복 불가  !!!!!!!
    public static void main(String[] args) {

   // Set s1 =new  S // 안된다. 인터페이스로는 객채생성안된다.
     //Hashset
    Set<String> s1= new HashSet();
    s1.add("java");
    s1.add("java"); //중복안됨
    s1.add("j");
    s1.add("a");
    s1.add("v");
    s1.add("a");

        System.out.println(s1.size());// 5x  -->4
        //있으면안한다.
        System.out.println(s1.contains("java"));
        System.out.println(s1.contains("css"));

        boolean b =s1.remove("java");
        System.out.println(b);


        //of : 새로운 수정불가 set 객채 만듬
        Set<String> s2= Set.of("css","react","html");
        //s2.add("java"); 상수라 못들어감

        //전체 탐색
        //set.get(0);// 이런거 안됨

        //향상된 for
        for(String str :s2){
            System.out.println("str");
        }

        //forEach //  존나 모르겠음
        s2.forEach(item-> System.out.println(item));


    }
}
