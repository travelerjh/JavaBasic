package basic11interface.book.b11;

public class Tel implements RemoteControl{
    int vol;                                     //필드는 pulbic static final
    @Override
    public void turnOn() {
        System.out.println("티비켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("티비끕니다");
    }

    @Override
    public void setVol(int vol) {
    if(vol>MinVol){
        this.vol=MinVol;
    }else if (vol<MinVol){
        this.vol=MinVol;
    }else {
        this.vol=vol;
    }
        System.out.println("현재 티비 볼륨 = " + this.vol);
    }
}
