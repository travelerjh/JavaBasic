package ch13.book.b5;

import basic11interface.book.b4.B;

public class Ex {
    public  static  <T> Box<T> boxing(T t){
        Box<T> box = new Box<>();
        box.setT(t);
        return box;
    }

    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        int inVal = box1.getT();
        System.out.println(inVal);

        Box<String> box2 = boxing("홍길동");
        String val =box2.getT();
        System.out.println(val);
    }
}
