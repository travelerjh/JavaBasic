package basic11interface.book.b2;

public class TV implements Remocon{


    public static void main(String[] args) {
    Remocon r= new TV(); // 추상이 아니라는 뜻
    r.powerOn();
    }

    @Override
    public void powerOn() {
        System.out.println("TV on");
    }
}
