package ch15Collection.book.b2;

import basic11interface.book.b4.B;

import java.util.ArrayList;
import java.util.List;

public class Ex {
    public static void main(String[] args) {

    BoardDao dao = new BoardDao();
    List<Board> list =  dao.getBoardList();
        for (Board board:list){
            System.out.println(board);

        }

       boolean contains =  list.contains(new Board("제목1","내용1"));

       System.out.println(contains);

        System.out.println(System.identityHashCode(list.get(0)));
        System.out.println(System.identityHashCode(list.contains(new Board("제목1","내용1"))));

    }
}
