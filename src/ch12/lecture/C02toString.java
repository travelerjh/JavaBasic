package ch12.lecture;

public class C02toString {
    public static void main(String[] args) {

    MyClass02 o1 = new MyClass02();
   String s1 = o1.toString();
        System.out.println(s1);





    }

}

class  MyClass02 {
    public String toString(){
        return "my 객채 입니다";
    }

}
