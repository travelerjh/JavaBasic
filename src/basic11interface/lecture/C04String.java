package basic11interface.lecture;

import java.io.Serializable;

public class C04String {
    public static void main(String[] args) {
        String a="java";
        //스트링은 오브젝트다.
        Object o= a;
        Serializable s =a;
        CharSequence c=a;
        Comparable<String> cp=a;


    }
}
