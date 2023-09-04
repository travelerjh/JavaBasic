package ch16lambad.book.b6;

import ch16lambad.book.b5.Cal;

//인터페이스를 유추해서 만들어라
public class Ex {
    public  static  double calc( Cal cal){
        double x= 10;
        double y= 4;
    return  cal.cal(x,y);
    }

    public static void main(String[] args) {
        double result = calc((x, y) -> (x/y));
        System.out.println(result);
    }
}
