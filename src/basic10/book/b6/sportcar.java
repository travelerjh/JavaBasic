package basic10.book.b6;

public class sportcar extends Car{
    @Override
    public void speedUp() {

        speed+=10;
        System.out.println("speed 속도업 = " + speed);

    }
}
