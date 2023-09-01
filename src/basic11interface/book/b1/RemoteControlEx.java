package basic11interface.book.b1;

public class RemoteControlEx {
    public static void main(String[] args) {
        Television tv= new Television();
        tv.turnOn();

        Audio ad= new Audio();
        ad.turnOn();
    }
}
