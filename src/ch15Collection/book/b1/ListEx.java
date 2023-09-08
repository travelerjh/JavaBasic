package ch15Collection.book.b1;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<ch15Collection.book.b1.List> list =new ArrayList<>();

        list.add(new ch15Collection.book.b1.List("박동식","홍길동전","전래동화"));
        list.add(new ch15Collection.book.b1.List("이동식","길동무친구","축구 "));
        list.add(new ch15Collection.book.b1.List("동길오","전주이씨","농구"));
        list.add(new ch15Collection.book.b1.List("나비여","초록나무","배구"));
        list.add(new ch15Collection.book.b1.List("조동찬","무럭마럭","야구"));

        System.out.println(list.get(0));

        int i =list.size();
        System.out.println(i);

        list.remove(3);

        for(ch15Collection.book.b1.List items : list){
            System.out.println(items);
        }







    }
}
