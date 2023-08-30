package basic10.lecture;

public class C15instanceof {
    //안전하게 형변환 하는 방법
    // 케스팅 + instanceof

    public static void main(String[] args) {
        Animal16 a16 = new Dog16();
        Animal16 a17 = new Cat16();
        Animal16 a18 = new Animal16();

        //instacneof 라는 연산자   ---> 사친연산 연산의 결과가 있다.
        // 연산결과의 타입은 ture , flase -->boolean
        //  좌변은 참조변수
        // 우변은 타입

        // tft
        //tff

        // Animal16 이 a16 타입인가 ?


        boolean res1= a16 instanceof  Animal16;
        boolean res2= a16 instanceof  Dog16;
        boolean res3= a16 instanceof  Cat16;

        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);
        // ttf
        System.out.println("------------------------");

        boolean res4= a17 instanceof  Animal16;
        boolean res5= a17 instanceof  Dog16;
        boolean res6= a17 instanceof  Cat16;

        System.out.println("res4 = " + res4);
        System.out.println("res5 = " + res5);
        System.out.println("res6 = " + res6);
        //tft

        System.out.println("------------------------");

        boolean res7= a18 instanceof  Animal16;
        boolean res8= a18 instanceof  Dog16;
        boolean res9= a18 instanceof  Cat16;

        System.out.println("res7 = " + res7);
        System.out.println("res8 = " + res8);
        System.out.println("res9 = " + res9);
        //tff

    }


}
class Animal16{

}
class Dog16 extends Animal16{}

class Cat16 extends Animal16{}