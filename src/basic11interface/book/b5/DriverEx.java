package basic11interface.book.b5;

import basic11interface.book.b4.D;

public class DriverEx {
    public static void main(String[] args) {
        Driver br=new Driver();
        br.driver(new Bus());

        br.driver(new Taxi());
    }
}
