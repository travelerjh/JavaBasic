package basic11interface.book.b11;

public class Audio implements RemoteControl{
    int vol;

    @Override
    public void turnOn() {
        System.out.println("오디오 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오 끕니다");
    }

    @Override
    public void setVol(int vol) {
    if(vol>RemoteControl.MaxVol){
        this.vol=RemoteControl.MaxVol;
    }else if(vol<RemoteControl.MinVol){
        this.vol=RemoteControl.MinVol;
        }else{
            this.vol =vol;
        }
        System.out.println("현재 오디오 볼륨 "+vol);
    }
    private  int memoryVol;

    @Override
    public void setMute(boolean mute) {
    if(mute){
        this.memoryVol=this.vol;
        System.out.println("무음처리 합니다");
        setVol((RemoteControl.MinVol));
    }else {
        System.out.println("무음해제합니다");
        setVol(this.memoryVol);
    }

    }
}

