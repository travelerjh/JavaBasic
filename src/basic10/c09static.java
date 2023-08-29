package basic10;

import static basic10.Myclass05.model;

public class c09static {
    public static void main(String[] args) {
        Myclass09 o1 = new Myclass09();

    }
}

class Myclass09 {
    String name; // 인스턴스 필드
    static String moedl;   // 스테틱 필드

    void print() {
        //인스턴스 맴버 끼리 접근 가능
        System.out.println("name = " + name);

        System.out.println("model = " + moedl);
    }

    static void printModel() {
        System.out.println("model = " + model);

        //  이거는 안됨
//        System.out.println("name = " + name);

    }


}