package basic11interface.book.b9;

public class Instanceof {
    public  static  void ride(Vehicle v){
        if(v instanceof  Bus bs){
            bs.checkFare();
        }
        v.run();
    }

    public static void main(String[] args) {
        Taxi tx= new Taxi();
        Bus bs= new Bus();

        ride(tx);
        System.out.println();
        ride(bs);
    }

}
