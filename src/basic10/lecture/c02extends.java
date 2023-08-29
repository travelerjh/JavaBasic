package basic10.lecture;

public class c02extends {
    public static void main(String[] args) {
        MysubClass021 o1 = new MysubClass021();
        o1.name ="spring";
        o1.mehtod3();
    }
}

//class MysubClass021 extends MyClass02{
//
//}


class MysubClass021 extends MyClass02 {

}

class MyClass02{
    String name;
    void mehtod3(){
        System.out.println("name = " + name);
    }
}