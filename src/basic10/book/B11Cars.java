package basic10.book;

public class B11Cars {
    public static void main(String[] args) {
        B11Car bc =new B11Car();
        bc.tire= new B11Tire();
        bc.run();

        bc.tire=new B11Ktire();
        bc.run();
        bc.tire=new B11Htire();
        bc.run();


    }
}
