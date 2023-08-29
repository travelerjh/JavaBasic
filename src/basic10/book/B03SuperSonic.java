package basic10.book;

import static basic10.book.B03SuperAir.NOMAL;
import static basic10.book.B03SuperAir.SUPERSONIC;

public class B03SuperSonic {
    public static void main(String[] args) {
        B03SuperAir b03a = new B03SuperAir();
        b03a.takeoff();
        b03a.fly();
        b03a.flymode = SUPERSONIC;
        b03a.fly();
        b03a.flymode = NOMAL;
        b03a.fly();
        b03a.land();
    }
}
