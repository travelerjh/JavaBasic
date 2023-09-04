package ch09nested.lecture;

import basic11interface.book.b4.C;

public class C05access {
    String name ="AAA";

class innerClass{
    String name ="BBB";
    void  m1(){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(C05access.this.name);
    }
}

    public static void main(String[] args) {
        C05access c5= new C05access();
        innerClass i5 =c5.new innerClass();
        i5.m1();
    }
}

