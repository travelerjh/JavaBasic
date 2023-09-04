package ch09nested.lecture;

public class C04access {
    // static  member는 instance 맴버에 접근 할 수 없다.

    //스테틱은 클래스랑 관련된 정보
    //인스턴스는 각기능이 가지고 있는 속성과 기능
    //인스턴스 맴버는 스테틱에 가능
    // 스테틱은 인스턴스에 접근 불가


    // 인스턴스 맴버 클래스라 가능
    int instanceField;
    static  int staticfield;

    static class StaticNestClass{
        void  m2(){
            System.out.println(staticfield);
            //System.out.println(instanceField);
            // 얘는 안됨 .
        }
    }


    class  Inner {
        void  m1(){
            System.out.println(instanceField);
            System.out.println(staticfield);
        }



    }

}
