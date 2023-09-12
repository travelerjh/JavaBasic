package ch15Collection.book.bb1;

import java.util.ArrayList;
import java.util.List;

public class Ex {
    public static void main(String[] args) {
        List<Board> list =new ArrayList<>();
        list.add(new Board("손흥민","토트넘"));
        list.add(new Board("김민재","뮌 헨"));
        list.add(new Board("사카","아스날"));
        list.add(new Board("호날두","나스르"));
        list.add(new Board("메시","마이에미"));

        int i =list.size();
        System.out.println(i);

        for(Board str : list){
            System.out.println(str);
        }

        System.out.println("---------------");

        list.remove(2);

        for(Board str : list){
            System.out.println(str);
        }





    }
}
