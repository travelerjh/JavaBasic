package ch13.book.b3;

public class Ex {
    public static void main(String[] args) {
        Product<Tv,String> p1 =new Product<>();
        p1.setKind(new Tv());
        p1.setModel("스마트 티비");
        Tv tv= p1.getKind();
        String tvM = p1.getModel();

        Product<Car ,String> p2 =new Product<>();
        p2.setKind(new Car());
        p2.setModel("SUV자동차");

        Car car =p2.getKind();
        String CarM =p2.getModel();
    }

}
