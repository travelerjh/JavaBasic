package ch12.lecture;

public class C03toString {
    public static void main(String[] args) {
        car car1 = new car( "tesla" ,500);
        car car2 = new car( "honda" ,500);
        car car3 = new car( "kia" ,500);

        //out 인스턴스가 가지고 있는 인스

        System.out.println(car1);
        System.out.println(car2.toString());
        System.out.println(car3.toString());

    }
}
class  car{
    String model;
    int price;

    //생성자 만들자.
    public car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    //get 메소드 쓰자
    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }


    //투스트링의 역활
    // 객채를 설명하는 문자열을 리턴
    @Override
    public String toString() {
        return "car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}

