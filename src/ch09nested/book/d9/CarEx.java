package ch09nested.book.d9;

public class CarEx {
    public static void main(String[] args) {
        Car car = new Car();
        car.run();
        car.run2();

        car.run3(new Tire(){
            @Override
            public void roll() {
                System.out.println("익명 객채3이 굴러갑니다. ");
            }
        });



    }
}
