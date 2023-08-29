package basic10.book;

public class Computer extends  Calculator {

    @Override
    public double aC(double r) {
        System.out.println("컴퓨터 객채의 aC() 실행");
        return Math.PI*r*r;
    }
}
