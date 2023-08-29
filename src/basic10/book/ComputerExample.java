package basic10.book;

public class ComputerExample {
    public static void main(String[] args) {
        int r=10;
        Calculator ca = new Calculator();
        System.out.println("원 면적"+ca.aC(r));
        System.out.println();
        Computer com = new Computer();
        System.out.println(com.aC(r));

    }
}
