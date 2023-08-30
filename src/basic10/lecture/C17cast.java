package basic10.lecture;

import basic10.book.Calculator;

public class C17cast {
    public static void main(String[] args) {
        Animal17 ani1 = new Dog17();
        Animal17 ani2 = new cat17();

        if(ani1 instanceof Dog17){
            Dog17 d1 = (Dog17) ani1;
            d1.bar();
        }else {
            System.out.println("Dog17로 형변환 안됨");
        }

        if(ani2 instanceof cat17){
            cat17 c3 = (cat17)ani2;
            c3.mew();
        }

        //형변환이 안되는 경우
        if(ani1 instanceof cat17){
            cat17 c1 = (cat17) ani1;// 안됨
        }else {
            System.out.println("형변환 안됨");
        }

        if (ani2 instanceof Dog17){
            Dog17 d1 =(Dog17) ani2;
        }else {
            System.out.println("Dog로 형변환 안됨");
        }



        System.out.println("형변환 됨");
    }
}


class  Animal17{

}
class Dog17 extends  Animal17{
    public  void  bar(){
        System.out.println("멍멍");
    }
}
class cat17 extends Animal17 {
    public  void  mew(){
        System.out.println("미우미우");
    }
}