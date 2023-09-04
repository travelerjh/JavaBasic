package ch09nested.lecture;

public class C09anonymous {
    public static void main(String[] args) {
        Myclass09 o1 =new  MysubClass();

        //익명 객 채
        //클래스의 이름이 없다.
        // 바로 { }
        //클래스 상속과 , 인스턴스를 동시에 했다.

         Myclass09 o2 =new Myclass09(){
             @Override
             void m1() {
                 System.out.println("m2");
             }
         };
        // 자식 클래스 몸통을 넣는다.


        o1.m1();
        o2.m1();
    }

}

class  Myclass09{
    //메소드를 만들자
    void m1(){
        System.out.println("m1");
    }

}
class MysubClass extends  Myclass09{

}