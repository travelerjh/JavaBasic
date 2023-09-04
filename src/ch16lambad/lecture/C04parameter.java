package ch16lambad.lecture;

import java.util.Arrays;
import java.util.List;

public class C04parameter {
    public static void main(String[] args) {


    Myclass04 m4 = (x)->{};
    // x 도 없어도됨
    Myclass04 m5 = x->{};
    //리스트
    List<String> list = List.of("j","s","c","h");
    list.forEach(e-> System.out.println("e = " + e));
    //배열
        int []arr ={1,2,3,4,5,6};
        Arrays.stream(arr).forEach(e-> System.out.println("e = " + e));
        System.out.println();


    }
}


interface  Myclass04{
    void  m1(int x);
}
