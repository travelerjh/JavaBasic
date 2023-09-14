package ch11exception.lecture;

public class C13throw {
    public static void main(String[] args) {
    try {
        m1();
    }catch (RuntimeException e){
        System.out.println("예외발생");
    }

        System.out.println("code2");

    }
    public  static  void m1(){
        System.out.println("code1");
        throw  new RuntimeException();
    }

    public  static  void m2(){
    }

}