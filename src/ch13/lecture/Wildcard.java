package ch13.lecture;

// 고급 수준 // 이건 까먹자

public class Wildcard {
    public static void main(String[] args) {
        Dog d= new Dog();
        Animal a1 =d;
        Cat c =new Cat();
        Animal a2= c;

        MyClass06<Dog> o1 =new MyClass06();
       // MyClass06<Animal>o2 =o1;// 안됨

        MyClass06<? extends Animal> o3 =o1;

    }
}
class  Animal{

}
class  Dog extends Animal{

}
class  Cat extends Animal{

}


class MyClass06<T>{
    public  void  set(T param){};
}
