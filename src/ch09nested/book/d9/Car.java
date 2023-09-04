package ch09nested.book.d9;

public class Car {
 private Tire tire1= new Tire();
 //익명 객채
 private Tire tire2 = new Tire(){
     @Override
     public void roll() {
         System.out.println("익명 자식 타이거 객채 1이 굴러갑니다.");
     }
 };
 public  void  run(){
     tire1.roll();
     tire2.roll();
 }
 public  void  run2(){
     Tire tire= new Tire(){
     @Override
     public void roll(){
         System.out.println("익명자식 객채 2가 굴러 갑니다. ");
     }
     };
     tire.roll();
 }
 public  void  run3(Tire tire){
     tire.roll();
 }

}
