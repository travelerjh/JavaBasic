package basic11interface.book.b3;

public class SmartTvEX {
    public static void main(String[] args) {
        RemoteControl rc =new SmartTv();
        rc.turnOn();
        rc.turnOff();

        Searchable sc= new SmartTv();
        sc.search("https://www.youtube.com");
    }
}
