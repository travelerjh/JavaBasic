package basic10.lecture;

public class C13cast {
    public static void main(String[] args) {


    Animal13 a1 =new Dog();
    Animal13 a2 =new Cat();

    a1.breath();
    a2.breath();

    //강제 형변화   매우 위험 왠만하면 하지마세요
    Dog d1 =(Dog) a1;
    d1.sniff();
    }
}

class Animal13{
    public  void  breath(){
        System.out.println("쉼시다");
    }
}

class Dog extends Animal13{
    public void sniff(){
        System.out.println("냄새를 맡다");
    }

}
class  Cat extends Animal13{

}