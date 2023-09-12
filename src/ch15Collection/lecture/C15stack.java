package ch15Collection.lecture;

import java.util.Stack;

public class C15stack {
    public static void main(String[] args) {
        //stack :last in frist out
        // push : 아이템 넣기
        // pop  아이탬 꺼내기
        // peek :  마지막 아이템 보기

        Stack<Integer> stack =new Stack<>();
        stack.push(9);
        stack.push(8);
        stack.push(7);
        stack.push(6);

        System.out.println(stack.size());

       Integer i= stack.pop(); //  마지막에 넣은수 6 그래서 6이 나옴z
        System.out.println(i);




    }
}
