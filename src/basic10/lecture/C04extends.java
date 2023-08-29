package basic10.lecture;

public class C04extends {
    public static void main(String[] args) {
        sub4 sb= new sub4();
        ssub4 sbb= new ssub4();
        sb.method2();
        sb.method1();
        sbb.method3();
    }
}

class Myclass04{
    void method1(){
        System.out.println("true = " + true);
    }
}
//sub4가 상속을 받는다. 상속 받는 이유는  void 더하기 뭘 하고 싶어서
class sub4 extends Myclass04{
    void method2(){
        System.out.println("false = " + false);
    }
}

class ssub4 extends Myclass04{
    void method3(){
        System.out.println("this = " + this);
    }
}
