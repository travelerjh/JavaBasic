package ch16lambad.lecture;

public class C08methodRegerence {
    Myclass08 o2 = new Myclass08();
    MyInterface08 o1 = (x,y)->o2.otherMethod(x,y);
    MyInterface08 o3= o2::otherMethod;

}

//이런 경우는 스테틱이 없으니까 초기화 해야한다.
class Myclass08{
    void otherMethod(int x, int y){

    }
}

interface MyInterface08{
    void  method(int x,int y);
}
