package ch16lambad.lecture;

public class C06methodReference {
    public static void main(String[] args) {
        Myinterface06 m1 = a-> { };
            //몸통에 크기들이
        // 특정 메소드 호출로 끝난다면

        // 메소드 참조 (method reference)
   Myinterface06 m2 = C06methodReference::someMethod;

    }
    public  static  void someMethod(int x){

    }

}

interface  Myinterface06{
    void  method(int a);
}