package ch09nested.book.d12;

public class Lambda {
    public static void main(String[] args) {
        action((x, y) -> {
            int result = x+y;
            System.out.println("result = " + result);
                });
        action((x, y) -> {
            int reslut =x-y;
            System.out.println("reslut = " + reslut);
        });
    }


public static void action(Calculable calculable){
        int x= 10;
        int y= 4;
        calculable.calculate(x,y);
}


}
