package basic11interface.lecture;

public class C14static {
    //스테틱 메소드
    public static void main(String[] args) {
        Myinter14.method();
    //스테틱 메소드는  인스턴스 생성 없이 바로 사용 가능하다

    //프라이빗은 실행이 안된다.



    }

}

interface Myinter14{
    //필드 public static final

    //추상메소드
    //디폴트 메소드

    //스테틱 (정적 ) 메소드
    //public 메소드
    //private 메소드


    //스테틱은 바로 실행가능
    static void  method(){
        //System.out.println("인터페이스 메소드");
        common();
    }

    static void  method2(){
//        System.out.println("인터페이스 메소드");
        common();

    }

    private static void  common(){
        //어려 스테틱들을 공통으로 묶을 수 있다.
        System.out.println("인터페이스 메소드");

    }


}