package basic11interface.book.b1;

public class Audio implements RemoteContrl{
    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다.");
    }
}
