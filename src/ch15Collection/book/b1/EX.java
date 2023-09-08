package ch15Collection.book.b1;

import java.util.ArrayList;
import java.util.List;

public class EX {
    public static void main(String[] args) {
        List<Board> list= new ArrayList<>();
        list.add(new Board("제목1","내용1","글쓴이1"));
        list.add(new Board("제목2","내용2","글쓴이2"));
        list.add(new Board("제목3","내용3","글쓴이3"));
        list.add(new Board("제목4","내용4","글쓴이4"));
        list.add(new Board("제목5","내용5","글쓴이5"));

        int l  =list.size();
        System.out.println(l);

       Board board3= list.get(3);
        System.out.println("board3.getContent() = " + board3.getContent());
        System.out.println("board3.getContent() = " + board3.getSubject());
        System.out.println("board3.getContent() = " + board3.getWriter());


        list.remove(2);


        for(Board iems: list){
            System.out.println(iems.getContent() +iems.getSubject() +iems.getWriter());
        }

    }
}
