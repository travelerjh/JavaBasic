package ch09nested.book.d10;

public class HomeEx {
    public static void main(String[] args) {
        Home hm =new Home();
        hm.use1();
        hm.use2();
        hm.use3(new Remote() {
            @Override
            public void turnOn() {
                System.out.println("난방 켬");
            }

            @Override
            public void turnOff() {
                System.out.println("난방끔");
            }
        });
    }
}
