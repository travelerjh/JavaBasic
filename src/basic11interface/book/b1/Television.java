package basic11interface.book.b1;

public class Television implements RemoteContrl{

    @Override
    public void turnOn() {
        System.out.println("티비를 켜줘");
    }
}
