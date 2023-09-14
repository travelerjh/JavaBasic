package ch11exception.lecture;

import java.util.List;

public class C15unchecked {
    public static void main(String[] args) {

        var list = List.of(4,5,1);
        list.get(0);
        list.get(1);
        list.get(2);

        list.get(5);  // 예외가 발생하더라고 unchecked exception 이 발생한다.

        System.out.println("프로그램 실행이 이어감");



    }
}
