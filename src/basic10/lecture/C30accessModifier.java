package basic10.lecture;

public class C30accessModifier {
    public static void main(String[] args) {
        // 접근 제한자
        // public   : 가장 넓은 범위 , 어디서든지 접근가능
        // private  : 가장좁은 범위 ,클래스 내에서만 접근가능
        //(default package private) : 같은 패키지내에서만 접근가능
        //protected :

        Myclass30 m30 =new Myclass30();
        m30.publicMethod();
 //       m30.privateMthod(); // [접근불가능]
        m30.pack();

    }
}


