package ch15Collection.book.b3;

import java.util.List;

public class Ex {
    public static void main(String[] args) {
       BoardDAO dao = new BoardDAO();
        List<Board> list = dao.getList();

        for(Board borad : list){
            System.out.println(borad);
        }


    }




}
