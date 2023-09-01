package basic11interface.book.b8;

public class Ex {
    public static void main(String[] args) {
        Vehicle vh= new Bus();
        vh.run();
        // vh.checkFace();         //애는 안된다 .자식의 것이라 안된다.


        Bus bus=new Bus();
        bus.checkFace();
        bus.run();

    }
}

