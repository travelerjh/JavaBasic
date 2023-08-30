package basic10.lecture;

public class C18cast {
    public static void main(String[] args) {
        Animal18 ani1 = new Dog18();
        Animal18 ani2 = new Cat18();

        if( ani1 instanceof  Dog18 d1){
            d1.bark();
        }
        if( ani2 instanceof Cat18 c18 )    //---> 엄청쉬운 형변환 방법
            c18.mew();

        //아래 방법으로 할필요가 없어짐
//        if(ani2 instanceof cat17){
//            cat17 c3 = (cat17)ani2;
//            c3.mew();
//        }




        System.out.println("실행됨");

}
}


class  Animal18{

}
class Dog18 extends  Animal18{
    public void bark(){
        System.out.println("멍멍");
    }
}
class Cat18 extends Animal18{
    public void mew(){
        System.out.println("미우미우");
    }

}