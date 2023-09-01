package basic10.book.b8;

public class Bus extends  Vehicle{
    @Override
    public void v() {
        super.v();
        System.out.println("버스로 달리는 기능 변경");
    }
}
