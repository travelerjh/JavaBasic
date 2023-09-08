package ch12.lecture;

public class C03p {
    public static void main(String[] args) {
         Car car1 = new Car("포르쉐 ",20000);
         Car car2 = new Car("포르쉐 ",15000);
         Car car3 = new Car("포르쉐 ",8000);

         car2.setName("제네시스");
         car3.setName("BMW");

        System.out.println(car1.getP());

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);


    }
}




class Car{
    private String name;
    private int p;

    // 초기화 해서 쓰라고
    public Car(String name, int p) {
        this.name = name;
        this.p = p;
    }

    // 값을 넣고 빼라고
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }


    //잘 문자로 읽어오라고
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", p=" + p +
                '}';
    }
}
