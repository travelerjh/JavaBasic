package ch16lambad.lecture;

public class C07Lambda {

    MyInterface07 m1 =((x, y) -> MycClass07.otherMethod(x,y));
    MyInterface07 m2= MycClass07::otherMethod;
}
class MycClass07{
    //스테틱이니까 앞에 클레스 이름이 쓰일수 있다.
    static void otherMethod(int x , int y){

    }
}

interface  MyInterface07{
    void method(int x , int y);
}
