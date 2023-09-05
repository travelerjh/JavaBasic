package ch16lambad.lecture;

public class C11constructor {
    Myinterface111 o1= z-> new Myclass11(z);
    Myinterface111 o2 = Myclass11 ::new;

}

//타입만 같으면 된다.

class Myclass11{
    Myclass11(int a){};
}
@FunctionalInterface
interface Myinterface111{
    Myclass11 method(int x);
}
@FunctionalInterface
interface Myinterface112{
    Myclass11 someMethod(String x, int y);
}
