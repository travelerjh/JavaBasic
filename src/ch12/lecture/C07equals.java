package ch12.lecture;

public class C07equals {
    public static void main(String[] args) {
    MyClass07 o1=new MyClass07("박지성");
    MyClass07 o2=new MyClass07("박지성");
    MyClass07 o3=new MyClass07("김민재");
    MyClass07 o4=new MyClass07("박지성");

        System.out.println(o1==o2); //false        //t
        System.out.println( o1.equals(02));//false //t

        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());

        System.out.println(o1.equals(03));// false
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
    }
}

class MyClass07{
    private String name;

    //생성자
    public MyClass07(String name) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyClass07 myClass07 = (MyClass07) o;

        return name != null ? name.equals(myClass07.name) : myClass07.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
