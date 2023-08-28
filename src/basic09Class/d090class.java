package basic09Class;

public class d090class {
    public static void main(String[] args) {
        //하나에 단에 여러 클래스가
        MyClass01 m1 =new MyClass01();
        // new란 연산자와 //  MyClass01(); 생성자를 만든다.
        //참조값을 알아야한다.
        System.out.println("System.identityHashCode(m1) =" + System.identityHashCode(m1) );

        System.out.println("m1.age = " + m1.age); //
        m1.age=30;
        System.out.println("m1.age = " + m1.age);
        
        MyClass01 m2 =m1;
        
        System.out.println("m2.age = " + m2.age);
        
        m2.age=80;
        System.out.println("m2.age = " + m2.age);
    }
}
class MyClass01{
    //instance fiedld
    //인스턴스가 가져야하는 속성들  이 나열되어야 한다. class라는 설꼐도에
    int age ;
    String address;

    //instance methods
    //인스턴스가 가져하는 기능들 (메소드)
    

}