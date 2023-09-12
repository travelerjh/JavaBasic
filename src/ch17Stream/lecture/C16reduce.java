package ch17Stream.lecture;

import java.util.List;
import java.util.Optional;

public class C16reduce {
    public static void main(String[] args) {
        var list = List.of(6,4,2,7,9,1);
        list.stream().reduce(Integer.MIN_VALUE, (r,s)->Math.max(r,s));



        //optaional 이 필요함
//        var list2 = List.of();
//        list2.stream().reduce(Integer.MIN_VALUE, (r,s)->Math.max(r,s)); //r,s 오류



    }
}
