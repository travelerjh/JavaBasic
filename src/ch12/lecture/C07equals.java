package ch12.lecture;

public class C07equals {
    public static void main(String[] args) {
    MyClass07 o1=new MyClass07("박지성");
    MyClass07 o2=new MyClass07("박지성");
    MyClass07 o3=new MyClass07("김민재");
    MyClass07 o4=new MyClass07("박지성");

        System.out.println(o1==o2); //false
        System.out.println( o1.equals(02));//false

        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());

        System.out.println(o1.equlas(03));// false
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
    }
}

class MyClass07{
    private String name;

    //컨스트럭터  생성자
    public MyClass07(String name) {
        this.name = name;
    }
    public  boolean equlas(Object obj){
        MyClass07 o = (MyClass07) obj;
        return  this.name.equals(((MyClass07) obj).name);
    }


}
