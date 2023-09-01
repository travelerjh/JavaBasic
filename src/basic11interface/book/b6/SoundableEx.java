package basic11interface.book.b6;


public class SoundableEx {
    public  static  void  PrintSound(Soundable s){
        System.out.println(s.sound());
    }

    public static void main(String[] args) {
        PrintSound(new Cat());
        PrintSound(new Dog());
    }

}
