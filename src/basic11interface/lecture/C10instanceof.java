package basic11interface.lecture;

import java.io.Serializable;

public class C10instanceof {
    public static void main(String[] args) {
        //instance of
        //연산결과는 boolean 타입
        //좌변 :참조변수
        //오른쪽 변수 : 타입 ==> 클래스가 와도 되고 인터페이스가 와도됨

        CharSequence c= "java";
        boolean r1=  c instanceof  String ; //ture
        boolean r2= c instanceof Serializable; //true
        boolean r3= c instanceof Comparable; //true


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
    }
}
