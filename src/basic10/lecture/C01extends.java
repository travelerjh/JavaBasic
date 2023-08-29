package basic10.lecture;

public class C01extends{
    public static void main(String[] args) {
        My01 m1 = new My01();
        m1.age=30;
        m1.mt1();
    }
}

class Mm2 extends My01{

}



class My01  {
    int age;
    void mt1(){
        System.out.println("medthod1");
        System.out.println("age = " + age);
    }
    
}

