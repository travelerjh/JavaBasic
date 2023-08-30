package basic10.lecture;

public class C25abstract {
    public static void main(String[] args) {
        Dog25 d25= new Dog25();
        Cat25 c25 = new Cat25();

        Animal25 a1=  d25;
        Animal25 a2=  c25;


       // Animal25 a3 = new Animal25(); // 안되게 하기

    }

}
// 추상클래스로 인스턴스 생성 불가

abstract class Animal25{

}

class  Dog25 extends  Animal25{

}
class  Cat25 extends  Animal25{

}