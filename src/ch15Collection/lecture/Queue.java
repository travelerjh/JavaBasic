package ch15Collection.lecture;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {

        // 선입선출
        //add ==> offer   .. 마지막으로 들어가고
        //remove ==> poll ..  처음 넣은게 나온다.
        //element ==> peek

        // new LinkedList === > 웬만하면 이걸로 사용

        java.util.Queue<Integer> queue =new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);

        System.out.println(queue.size());
        System.out.println("----------------------------");
        Integer item1 =queue.poll();   //1 이나옵
        Integer item2 =queue.poll();  //2가 나옴


        for (Integer i : queue){
            System.out.println(i.intValue());
        }




    }

}
