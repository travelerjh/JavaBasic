package ch16lambad.lecture;

public class C10constructorReference {
    MyInterface10 o1 =()->{
        return  new MyClass10();
    };

    MyInterface10 o2 =()-> new MyClass10();

    MyInterface10 o3 = MyClass10::new;

}

//     MyClass10(){} == method();
//     추상메서드인데 파라미터가 없으니까

class  MyClass10 {
     MyClass10(){}
}

@FunctionalInterface
interface  MyInterface10{
    MyClass10 method();
}
