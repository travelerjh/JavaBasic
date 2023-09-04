package basic11interface.book.b12;

public interface Remote {

    int MaxVol =10;
    int MinVol = 0;
    void turnOn();
    void turnOff();
    void setVol(int vol);

    default void  setMute(boolean mute){

    }

    static  void  changeBettery(){
        System.out.println("베터리 교체 해야 합니다.");
    }

}
