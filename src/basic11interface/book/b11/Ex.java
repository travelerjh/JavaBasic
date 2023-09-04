package basic11interface.book.b11;

public class Ex {
    public static void main(String[] args) {
        RemoteControl rc;
        rc= new Tel();
        rc.turnOn();
        rc.setVol(5);

        rc.setMute(true);
        rc.setMute(false);
        System.out.println();


        rc=new Audio();
        rc.turnOn();
        rc.setVol(5);

        rc.setMute(true);
        rc.setMute(false);

        rc.turnOff();
    }
}
