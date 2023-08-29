package basic10.lecture;

public class C10Poly {
    public static void main(String[] args) {
        malra dog1= new malra();
        cihuahua dog2 = new cihuahua();

        Dogs do1 =dog1;
        Dogs do2 = dog2;

        Aniaml10 ani1 = do1;
        Aniaml10 ani2 = do2;
       //거꾸로는 안됨
       // dog1 = ani1 X

        dog1.breath();
        dog2.breath();

        dog1.cry();
        do1.cry();
        ani1.cry();

        dog2.cry();

    }
}


class  Aniaml10{

    public void breath(){
        System.out.println("숨쉬다");
    }
    public void cry(){
        System.out.println("동물이 운다");
    }

}
class Dogs extends Aniaml10{

}

class malra extends Dogs{
    @Override
    public void cry() {
        System.out.println("멍멍");
       }
}
class cihuahua extends Dogs{
    @Override
    public void cry() {
        System.out.println("왈왈운다.");
    }
}