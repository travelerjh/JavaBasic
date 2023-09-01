package basic11interface.lecture;

//형변환

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public class C06typeConversion {
    public static void main(String[] args) {
        Integer i = 3;

        Serializable s =i;
        Comparable<Integer> com= i;


    }
}
