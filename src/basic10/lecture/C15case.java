package basic10.lecture;

public class C15case {
    public static void main(String[] args) {
        Animal ani1 = new Dog15();
        Animal ani2 = new cat15();

        Dog15 d1 = (Dog15)ani1;
        cat15 c1 = (cat15)ani2;

        System.out.println("실행됨");

    }


}


class  Animal{

}
class Dog15 extends  Animal{

}
class cat15 extends Animal{

}