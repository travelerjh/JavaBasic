package basic10.lecture;

public class C09polymorphism {
    public static void main(String[] args) {
        SubMy09 sub6 = new SubMy09();
        My09 sub7 = sub6;   //ok
        My09 sub8 = new My09();
        System.out.println(System.identityHashCode(sub6));
        System.out.println(System.identityHashCode(sub7));
        System.out.println(System.identityHashCode(sub8));

        sub6.method(); //변수의 타입과 관꼐없이 실제의 인스턴스 메소드가 실행
        sub7.method(); // 실제 인스턴스의 메소드 실행
        sub8.method(); //

    }
}

class My09 {

    void  method(){
        System.out.println("부모메소드");
    }

}

class SubMy09 extends My09{

    @Override
    void method() {
        System.out.println("자식 메소드");
    }
}