package basic11interface.book.b11;

public interface RemoteControl {
    int MaxVol =10;
    int MinVol = 0;
    void turnOn();
    void turnOff();
    void setVol(int vol);

    default void  setMute(boolean mute){
        if(mute){
            System.out.println("무음처리합니다.");
            setVol(MinVol);
        }else {
            System.out.println("무음해제합니다");
        }

    }
}