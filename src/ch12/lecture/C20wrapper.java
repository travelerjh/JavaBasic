package ch12.lecture;

import javax.swing.*;

public class C20wrapper {
    public static void main(String[] args) {
        //wrapper classs "기본타입을 감싸고 있는 클래스
        //기본타입        :byte ,short,int ,long ,doubld,float, char,blooean
        //wrapper class Byte ,Short ,Integer ,Long ,Double ,Float ,Double,Chararater,Blooean

        //boxing --> 기본타입 --->참조타입
        //unboxing --> 참조타입 --> 기본타입

        //boxing  안씀
        int i =500;
       // Integer j = new Integer(i);
        Integer k = Integer.valueOf(i);
        System.out.println(k);

        //unbxing  안씀
        Integer l= Integer.valueOf(400);
        int m = l.intValue();

        //autoBoxing
        int n =7;
        Integer w =n ;// autoBoxing


    }
}
