package basic10.book.b8;

public class Taxi extends Vehicle {
    @Override
    public void v() {
        super.v();
        System.out.println("택시로 달리는 기능변경");
    }
}
