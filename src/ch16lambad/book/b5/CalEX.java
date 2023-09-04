package ch16lambad.book.b5;

public class CalEX {
    public static void main(String[] args) {
        Person p = new Person();
        p.action((x, y) -> {
            double result = x + y;
            return result;
        });
        p.action((x, y) -> (x + y));
        p.action((x, y) -> sum(x , y));
    }
    public static double sum(double x, double y){
        return  (x+y);
    }
};
